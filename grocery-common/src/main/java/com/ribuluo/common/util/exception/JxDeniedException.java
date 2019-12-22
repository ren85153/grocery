package com.ribuluo.common.util.exception;

/**
 * @author
 * 403 授权拒绝
 */
public class JxDeniedException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public JxDeniedException() {
    }

    public JxDeniedException(String message) {
        super(message);
    }

    public JxDeniedException(Throwable cause) {
        super(cause);
    }

    public JxDeniedException(String message, Throwable cause) {
        super(message, cause);
    }

    public JxDeniedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
