package com.ribuluo.admin.service.util;

import java.util.Random;

public class LoginUtil {
    public final static String[] HeadImg = {
            "https://jx-file.oss-cn-hangzhou.aliyuncs.com/2019050921474image1.png",
    "https://jx-file.oss-cn-hangzhou.aliyuncs.com/2019050940650image2.png",
    "https://jx-file.oss-cn-hangzhou.aliyuncs.com/2019050967994image3.png",
    "https://jx-file.oss-cn-hangzhou.aliyuncs.com/2019050993069image4.png"
    };
    public final static String[] HeadImgX = {
            "https://jx-file.oss-cn-hangzhou.aliyuncs.com/2019050921474image1.png?x-oss-process=image/resize,m_lfit,h_100,w_100",
            "https://jx-file.oss-cn-hangzhou.aliyuncs.com/2019050940650image2.png?x-oss-process=image/resize,m_lfit,h_100,w_100",
            "https://jx-file.oss-cn-hangzhou.aliyuncs.com/2019050967994image3.png?x-oss-process=image/resize,m_lfit,h_100,w_100",
            "https://jx-file.oss-cn-hangzhou.aliyuncs.com/2019050993069image4.png?x-oss-process=image/resize,m_lfit,h_100,w_100"
    };
    public static String[] getHeadImg(){
        String[] headImgs = new String[2];
        Random r = new Random();
        int radom = r.nextInt(4);
       headImgs[0] = HeadImg[radom];
       headImgs[1] = HeadImgX[radom];
        return headImgs;
    }
    public static String getLastFourNum(String mobile){
        //截取电话号码后四位
        String substring = "";
        if(!"".equals(mobile)){
            substring = mobile.substring(7);
        }
        return substring ;
    }
}
