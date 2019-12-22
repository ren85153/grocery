package com.ribuluo.oss;


import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;

import org.springframework.core.io.ClassPathResource;
import org.springframework.util.ResourceUtils;

import com.aliyun.oss.OSSClient;

/**
 * @author weiyz
 * 文件上传
 **/
public class OSSClientUtils {


    private static OSSClientUtils aliyun;

    private static OSSConfig ossConfig;
    private OSSClientUtils() {

    }

    public static synchronized OSSClientUtils getInstance(OSSConfig config){
        if(aliyun==null){
            aliyun=new OSSClientUtils();

            ossConfig = config;
        }
        return aliyun;
    }

    public static synchronized OSSClientUtils getInstance(){
        return getInstance(new OSSConfig());
    }
    /**
     * 上传byte数组
     * @param fileByte 文件字节
     * @param fileKey 文件名
     * @return 返回文件名
     */
    public String uploadByte(String nickName,byte[] fileByte, String fileKey){

		Font font = new Font("msyh", Font.HANGING_BASELINE, 24);//字体
		Font font1 = new Font("msyh", Font.BOLD, 24);//字体
        String watermarkUrl="/jx/image/";
        String watermark="@"+nickName;//水印内容
        Map<String,Object> map = new HashMap<>();
        map.put("1", new Color(205,125,72));
        map.put("image1", watermarkUrl+"1.png");

        map.put("2", new Color(97,157,137));
        map.put("image2", watermarkUrl+"2.png");

        map.put("3", new Color(203,106,111));
        map.put("image3", watermarkUrl+"3.png");

        map.put("4", new Color(207,114,140));
        map.put("image4", watermarkUrl+"4.png");

        map.put("5", new Color(203,153,66));
        map.put("image5", watermarkUrl+"5.png");
        
        map.put("6", new Color(111,139,189));
        map.put("image6", watermarkUrl+"6.png");

        map.put("7", new Color(117,116,185));
        map.put("image7", watermarkUrl+"7.png");

        map.put("8", new Color(132,109,187));
        map.put("image8", watermarkUrl+"8.png");
        // 随机数
        String random = String.valueOf((int)(1+Math.random()*(8-1+1)));
        try {
        	fileByte = markImgMark(String.valueOf(map.get("image"+random)),fileByte,fileKey,watermark, (Color)map.get(random),font1,font);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
        // 创建OSSClient实例
        OSSClient ossClient = new OSSClient(ossConfig.ENDPOINT, ossConfig.ACCESSKEYID, ossConfig.ACCESSKEYSECTET);
        // 上传byte数组
        ossClient.putObject(ossConfig.BUCKNAME, fileKey, new ByteArrayInputStream(fileByte));
        // 关闭client
        ossClient.shutdown();
        return genFileAddress(fileKey);
    }

	/**
	 * 为图片添加图片水印
	 * @param watermarkUrl 水印图片
	 * @param source 原图
	 * @param output 制作完成的图片
	 * @return
	 * @throws IOException
	 */
	private byte[] markImgMark(String watermarkUrl, byte[] fileByte,String fileKey, String watermark,Color color,Font font1,Font font) throws IOException {
		String result = "添加图片水印出错";
//		File file = new File
		InputStream buffin = new ByteArrayInputStream(fileByte);
		Image img = ImageIO.read(buffin);
		int width = img.getWidth(null);//水印宽度
		int height = img.getHeight(null);//水印高
		BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Graphics2D g = bi.createGraphics();
		g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		g.drawImage(img.getScaledInstance(width, height, Image.SCALE_SMOOTH), 0, 0, null);
		System.out.println(OSSClientUtils.class.getResource("").getPath()+"-------------");
		Image con = ImageIO.read(new File(watermarkUrl)).getScaledInstance(50, 43, Image.SCALE_SMOOTH);
//		Image con = ImageIO.read(resource.getFile()).getScaledInstance(30, 23, Image.SCALE_SMOOTH);
		float clarity = 0.6f;//透明度
		g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_ATOP, clarity));
        g.setColor(color);
        g.setFont(font1);
        //设置水印的坐标
        int x = width - (g.getFontMetrics(g.getFont()).charsWidth(watermark.toCharArray(), 0, watermark.length())+35);  
        int y = height - 10;  

		g.drawImage(con, x-50, y-50, null);//水印的位置
		g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER));
		
        g.drawString("匠学", x, y-35);  //加水印
		g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER));
        g.setFont(font);
        g.drawString(watermark, x, y-10);  //加水印
		
		
		g.dispose();
		ByteArrayOutputStream bos = new ByteArrayOutputStream(); 
		ImageIO.write(bi,fileKey.split("\\.")[1],bos);
		System.out.println("添加图片水印成功");
		return bos.toByteArray();
	}
    /**
     * 获取文件地址
     * @param fileName 文件名
     * @return 返回文件名
     */
    String genFileAddress(String fileName){
        return ossConfig.FILE_ADDRESS + fileName;
    }

    /**
     * 上传文件流
     * @param inputStream 文件流
     * @param fileKey 文件名
     * @return 返回文件名
     */
    public String uploadInputStream(InputStream inputStream, String fileKey){
        // 创建OSSClient实例
        OSSClient ossClient = new OSSClient(ossConfig.ENDPOINT, ossConfig.ACCESSKEYID, ossConfig.ACCESSKEYSECTET);
        // 上传文件流
        ossClient.putObject(ossConfig.BUCKNAME, fileKey, inputStream);
        // 关闭client
        ossClient.shutdown();
        return genFileAddress(fileKey);
    }

    /**
     * 删除文件
     * @param fileKey 文件名
     */
    public void deleteFile(String fileKey){
        // 创建OSSClient实例
        OSSClient ossClient = new OSSClient(ossConfig.ENDPOINT, ossConfig.ACCESSKEYID, ossConfig.ACCESSKEYSECTET);
        // 删除文件
        ossClient.deleteObject(ossConfig.BUCKNAME, fileKey);
        // 关闭client
        ossClient.shutdown();
    }

    //base64字符串转化成图片
    @SuppressWarnings("restriction")
    public static byte[] BASE64DecoderStringToByte(String imgStr)
    {   //对字节数组字符串进行Base64解码并生成图片
        if (imgStr == null) //图像数据为空
            return null;
        sun.misc.BASE64Decoder decoder = new sun.misc.BASE64Decoder();
        try {
            //Base64解码
            byte[] b = decoder.decodeBuffer(imgStr);
            return b;
        } catch (Exception e){
            return null;
        }
    }


}
