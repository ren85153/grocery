package com.ribuluo.common.util;

import com.ribuluo.common.constant.CommonConstant;
import org.apache.commons.lang.StringUtils;
import org.junit.Test;

import java.util.Optional;

public class UserUtilsTest {

    @Test
    public void getToken() throws Exception {
        String authorization = null;
        System.out.println(StringUtils.substringAfter(authorization, CommonConstant.TOKEN_SPLIT));
    }

    @Test
    public void optionalTest() {
        Optional<String> optional = Optional.ofNullable("");
        System.out.println(optional.isPresent());
    }

}