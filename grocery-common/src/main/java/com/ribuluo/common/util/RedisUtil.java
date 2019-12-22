/**
 * Copyright (C), 2018-2018,Kinglian Science and Technology Ltd
 * FileName: RedisUtil
 * Author:   weiyz
 * Date:     2018/6/15 16:09
 * Description: 操作redis工具类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ribuluo.common.util;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * 〈操作redis工具类〉
 *
 * @author weiyz
 * @create 2018/6/15
 * @since 1.0.0
 */
@Component
public class RedisUtil {

    @Autowired
    private static StringRedisTemplate template;

    public static void setKey(String key, String value) {
        ValueOperations<String, String> ops = template.opsForValue();
        ops.set(key, value);
    }
    public static String getValue(String key) {
        ValueOperations<String, String> ops = template.opsForValue();
        return ops.get(key);
    }
    public static <T> void setListValue(String key, T t) {
        ValueOperations<String, String> valueOps = template.opsForValue();
        valueOps.set(key, JSON.toJSONString(t));
    }

    public static <T> T getListValue( String key,Class clazz){
        ValueOperations<String, String> valueOps = template.opsForValue();
        String valueStr = valueOps.get(key);
        return (T) JSON.parseObject(valueStr, clazz);
    }

    /**
     * 设置redis中的key一天后失效
     * @param key
     */
    public static  void  expireByOneDay(String key) {
        template.expire(key,1, TimeUnit.DAYS);
    }
}