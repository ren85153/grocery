package com.ribuluo.common.util;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/**
 * @author weiyz Map集合转为Bean
 */
public class ConvertMapToBean {
	/**
	 * 
	 * @param map
	 *            需转换的map对象
	 * @param beanName
	 *            转后的bean类型（需写包名加类名，否则类找不到），
	 *            即：类全名
	 * @return
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public static Object convertMapToBean(Map<String, String> map, String beanName)
			throws InstantiationException, IllegalAccessException {
		@SuppressWarnings("rawtypes")
		Class clazz = null;
		try {
			clazz = Class.forName(beanName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Object object = clazz.newInstance();

		// 获得对象的所有属性
		Field[] fields = clazz.getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			String key = fields[i].getName();
			if (map.containsKey(key)) {
				String tempKey = key.substring(0, 1).toUpperCase() + key.substring(1, key.length());
				try {
					@SuppressWarnings("unchecked")
					Method method = clazz.getMethod("set" + tempKey, new Class[] { fields[i].getType() });
					Object args[] = new Object[1];
					args[0] = String.valueOf(map.get(key));
					method.invoke(object, args);
				} catch (SecurityException e) {
					e.printStackTrace();
				} catch (NoSuchMethodException e) {
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
			}

		}
		return object;
	}
}
