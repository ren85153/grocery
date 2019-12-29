package com.ribuluo.admin.common.config;

import com.ribuluo.common.util.R;
import com.ribuluo.common.util.exception.BusinessRunException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
* <p>Title: ExceptionHandlerControllerAdvice</p>  
* Description:
* @author saury  
* @date 2019年12月29日
 */
@ControllerAdvice(basePackages = "com.ribuluo.admin.controller")
@Slf4j
public class ExceptionHandlerControllerAdvice {

    /**
     * 全局异常捕捉处理
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public R errorHandler(Exception ex) {
        log.error("ExceptionHandlerControllerAdvice log err. ", ex);
        if (ex instanceof BusinessRunException) {
           return  R.error(ex.getMessage());
        }
        return R.error("系统异常");
    }
}
