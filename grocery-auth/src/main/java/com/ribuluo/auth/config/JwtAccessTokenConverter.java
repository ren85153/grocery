package com.ribuluo.auth.config;

import com.ribuluo.common.constant.SecurityConstants;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import java.util.Map;

/**
 * @author
 * token 声明版权
 */
public class JwtAccessTokenConverter extends org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter {

    @Override
    public Map<String, ?> convertAccessToken(OAuth2AccessToken token, OAuth2Authentication authentication) {
        Map<String, Object> representation = (Map<String, Object>) super.convertAccessToken(token, authentication);
        representation.put("license", SecurityConstants.JX_LICENSE);
        return representation;
    }

    @Override
    public OAuth2AccessToken extractAccessToken(String value, Map<String, ?> map) {
        return super.extractAccessToken(value, map);
    }

    @Override
    public OAuth2Authentication extractAuthentication(Map<String, ?> map) {
        return super.extractAuthentication(map);
    }
}
