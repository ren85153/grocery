package com.ribuluo.admin.controller;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.ribuluo.admin.common.annotation.NoVerify;
import com.ribuluo.common.util.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.apache.commons.codec.binary.Base64;
import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;


@RestController
@RequestMapping("/ErWei")
@Api(tags="二维码接口2.0")
public class ErWeiCodeController {


    @ApiOperation(value="获取下载地址", notes="2.0 刘元凡")
    @NoVerify
    @RequestMapping(value = "/getDownloadUrl", method = {RequestMethod.GET})
    public R getDownloadUrl() throws IOException{
        String url = "https://a.app.qq.com/o/simple.jsp?pkgname=com.ribuluo";
        HashMap value = new HashMap<>();
        value.put("downloadUrl",url);
        return R.success(value);
    }
    /**
     * 生成二维码，返回到页面上
     */

    @ApiOperation(value="生成二维码，返回到页面上2.0", notes="2.0 刘元凡")
    @ApiImplicitParams(
            value = {
                    @ApiImplicitParam(name = "width", value = "宽，默认200", required = true, paramType = "query", dataType = "String"),
                    @ApiImplicitParam(name = "height", value = "高，默认200", required = true, paramType = "query", dataType = "String"),
                    @ApiImplicitParam(name = "type", value = "类型，1匠学，二维码为jxId，0其他,二维码是下载地址", required = false, paramType = "query", dataType = "String"),
            }
    )
    @NoVerify
    @RequestMapping(value = "/getQrCode", method = {RequestMethod.GET})
    public String getErWeiCode(HttpServletRequest request, String type, Integer width, Integer height) throws IOException{
        String jxId = request.getHeader("jxId");
        if(width == null || width == 0 || height == null || height == 0 ){
            width = 200;
            height = 200;
        }
        String content = "";
        if("0".equals(type)){
            content = "https://a.app.qq.com/o/simple.jsp?pkgname=com.ribuluo";
        }else{
            content = jxId;
        }
        String resultImage = this.crateQRCode(content,width,height);
        return resultImage;
    }

    public String crateQRCode(String content, int width, int height) throws IOException {
        String resultImage = "";
        ServletOutputStream stream = null;
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        @SuppressWarnings("rawtypes")
        HashMap<EncodeHintType, Comparable> hints = new HashMap<>();
        hints.put(EncodeHintType.CHARACTER_SET, "utf-8"); // 指定字符编码为“utf-8”
        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M); // 指定二维码的纠错等级为中级
        hints.put(EncodeHintType.MARGIN, 2); // 设置图片的边距
        try {
            QRCodeWriter writer = new QRCodeWriter();
            BitMatrix bitMatrix = writer.encode(content, BarcodeFormat.QR_CODE, width, height, hints);
            BufferedImage bufferedImage = MatrixToImageWriter.toBufferedImage(bitMatrix);
            ImageIO.write(bufferedImage, "png", os);
            resultImage = Base64.encodeBase64String(os.toByteArray());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (stream != null) {
                stream.flush();
                stream.close();
            }
        }
        return resultImage;
    }
}