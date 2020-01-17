package com.ribuluo.common.bean.config;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.cache.interceptor.KeyGenerator;
 
import com.alibaba.fastjson.JSONObject;

 /**
  * 自定义 CacheKey参数形式
 * <p>Title: CacheKeyGenerator</p>  
 * Description:
 * @author saury  
 * @date 2020年1月17日
  */
public class CacheKeyGenerator  implements KeyGenerator {

	@Override
	public Object generate(Object target, Method method, Object... params) {
          		Map<String, Object> map = new HashMap<String, Object>();
		map.put("target", target.getClass().getName());//放入target的名字
		map.put("method", method.getName());//放入method的名字
		if (params != null && params.length > 0) {//把所有参数放进去
			int i = 0;
			for (Object o : params) {
				map.put("params-" + i, o);
				i++;
			}
		}
		String str = JSONObject.toJSON(map).toString();
		byte[] hash = null;
		try {
			hash = MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return MD5Encoder.encode(hash);
	}

}
