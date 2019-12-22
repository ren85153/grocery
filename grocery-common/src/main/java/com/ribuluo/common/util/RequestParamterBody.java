/**
 * Copyright (C), 2018-2018,Kinglian
 * FileName: RequestParamterBody
 * Author:   weiyz
 * Date:     2018/12/27 14:11
 * Description: 请求接口封装实体
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ribuluo.common.util;

import lombok.Data;

import java.util.Map;

/**
 * 〈请求接口封装实体〉
 * @author weiyz
 * @create 2018/12/27
 * @since 1.0.0
 */
@Data
public class RequestParamterBody {
    Header header;
    Map<String,Object> body;
}
