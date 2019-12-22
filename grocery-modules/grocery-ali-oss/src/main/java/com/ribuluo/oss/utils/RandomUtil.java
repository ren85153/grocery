/**
 * Copyright (C),
 * FileName: RandomUtil
 * Author:   weiyz
 * Description: 主要用来生成文件名
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ribuluo.oss.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * 〈主要用来生成文件名〉
 * @author weiyz
 * @create 2018/7/20
 * @since 1.0.0
 */
public class RandomUtil {

    /**
     * 生成随机文件名：当前年月日时分秒+五位随机数
     *
     * @return
     */
    public static String getRandomFileName() {

        SimpleDateFormat simpleDateFormat;

        simpleDateFormat = new SimpleDateFormat("yyyyMMdd");

        Date date = new Date();

        String str = simpleDateFormat.format(date);

        Random random = new Random();

        int rannum = (int) (random.nextDouble() * (99999 - 10000 + 1)) + 10000;// 获取5位随机数

        return str+rannum;// 当前时间
    }
}
