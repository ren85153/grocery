package com.ribuluo.gateway.service;

import com.netflix.zuul.context.RequestContext;

/**
 * @author
 */
public interface LogSendService {

    /**
     * 往消息通道发消息
     * @param requestContext requestContext
     */
    void send(RequestContext requestContext);
}
