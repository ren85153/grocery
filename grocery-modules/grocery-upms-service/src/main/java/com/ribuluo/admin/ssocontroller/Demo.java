package com.ribuluo.admin.ssocontroller;

import com.ribuluo.admin.common.annotation.NoVerify;
import com.ribuluo.admin.common.exception.Result;
import com.ribuluo.admin.common.exception.ResultUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import java.util.Date;
@ApiIgnore
@RestController
@RequestMapping("/demo")
public class Demo {
        /**
         *查找用户用户
         * @return 
         */
        @NoVerify
        @GetMapping("/test")
        public  Result getTime(){

            return ResultUtil.success(new Date().getTime()) ;
        }

}
