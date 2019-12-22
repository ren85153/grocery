package com.ribuluo.common.util;

/**
 * 统一返回结果建造者
 *
 * @param <T> 统一返回结果中的result 字段 ， 当不填写时默认为正确返回
 */
public class RestResultBuilder<T> {
    private String errorCode = ServletRspErrorCode.MESSAGE_RSP_SUCCESS;

    private String message = ServletRspErrorCode.MESSAGE_RSP_SUCCESS_CONTENT;

    private T data;

    public RestResultBuilder<T> setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public RestResultBuilder<T> setMessage(String message) {
        this.message = message;
        return this;
    }

    public RestResultBuilder<T> setData(T data) {
        this.data = data;
        return this;
    }

    public RestResult<T> build() {
        return new RestResult<T>(errorCode, message, data);
    }

    public RestResult<T> build(T data) {
        return new RestResult<T>(errorCode, message, data);
    }

    public BaseRestResult<T> create(int totalPageCount, int size, T data) {
        return new BaseRestResult<T>(totalPageCount, size, errorCode, message, data);
    }

    /*
     * @param  pageCount 总页数
     * @param  rowcountall 总行数
     * @param  pageNumber 当前页码
     * @param  currentpagecount 当前页的行数
     * */
    public BaseRestResult<T> buildPageObj(int pageCount, int rowcountall, int pageNumber, int currentpagecount, T data) {
        return new BaseRestResult<T>(errorCode, message, data, pageCount, rowcountall, pageNumber, currentpagecount);
    }
}
