package com.ribuluo.sso.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author
 */
@RestController
public class DemoController {

    @GetMapping("/")
    public Authentication user(Authentication authentication) {
        return authentication;
    }
}
