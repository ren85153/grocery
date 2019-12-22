/**
 * Copyright (C), 2018-2018,Kinglian
 * FileName: JsonXMLUtils
 * Author:   weiyz
 * Date:     2018/12/27 16:50
 * Description: JsonXMLUtils
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ribuluo.common.util;

import com.alibaba.fastjson.JSON;

import java.util.Map;

/**
 * 〈JsonXMLUtils 〉
 * @author weiyz
 * @create 2018/12/27
 * @since 1.0.0
 */
public class JsonXMLUtils {
    public static String obj2json(Object obj) throws Exception {
        return JSON.toJSONString(obj);
    }

    public static <T> T json2obj(String jsonStr, Class<T> clazz) throws Exception {
        return JSON.parseObject(jsonStr, clazz);
    }

    public static <T> Map<String, Object> json2map(String jsonStr) throws Exception {
        return JSON.parseObject(jsonStr, Map.class);
    }

    public static <T> T map2obj(Map<?, ?> map, Class<T> clazz) throws Exception {
        return JSON.parseObject(JSON.toJSONString(map), clazz);
    }
}

