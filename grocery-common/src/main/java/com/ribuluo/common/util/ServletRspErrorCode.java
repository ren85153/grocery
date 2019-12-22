package com.ribuluo.common.util;

/**
 * PAD端请求错误码
 *
 * @author
 */
public class ServletRspErrorCode {

    /**
     * 消息解析成功
     */
    public final static String MESSAGE_RSP_SUCCESS = "0";
    public final static String MESSAGE_RSP_FAILURE = "1";

    public final static String MESSAGE_RSP_SUCCESS_CONTENT = "响应正确";
    /**
     * 消息格式错误Code
     */
    public final static String MESSAGE_FORMAT_ERROR_CODE = "001";

    /**
     * 消息格式错误Content
     */
    public final static String MESSAGE_FORMAT_ERROR_CONTENT = "消息格式错误";

    /**
     * Token验证错误Code
     */
    public final static String MESSAGE_TOKEN_VALIDATE_ERROR_CODE = "002";

    /**
     * Token验证错误Content
     */
    public final static String MESSAGE_TOKEN_VALIDATE_ERROR_CONTENT = "Token验证错误";

    /**
     * Token过期错误Code
     */
    public final static String MESSAGE_TOKEN_OVER_TIME_ERROR_CODE = "003";

    /**
     * Token过期错误Content
     */
    public final static String MESSAGE_TOKEN_OVER_TIME_ERROR_CONTENT = "Token过期";

    /**
     * 找不到对应的方法错误Code
     */
    public final static String MESSAGE_NO_EXIST_METHOD_ERROR_CODE = "004";

    /**
     * 找不到对应的方法错误Content
     */
    public final static String MESSAGE_NO_EXIST_METHOD_ERROR_CONTENT = "找不到对应的方法";

    /**
     * 服务器响应异常Code
     */
    public final static String MESSAGE_SERVICE_RESPONSE_ERROR_CODE = "005";

    /**
     * 服务器响应异常Content
     */
    public final static String MESSAGE_SERVICE_RESPONSE_ERROR_CONTENT = "服务器响应异常";
    /**
     * 服务器处理任务超时Code
     */
    public final static String MESSAGE_SERVICE_TIMEOUT_ERROR_CODE = "006";

    /**
     * 服务器处理任务超时Content
     */
    public final static String MESSAGE_SERVICE_TIMEOUT_ERROR__CONTENT = "服务器处理任务超时异常";

    /**
     * 设备号已被使用Code
     */
    public final static String MESSAGE_SERIAL_ISEXIST_ERROR_CODE = "007";

    /**
     * 设备号已被使用Content
     */
    public final static String MESSAGE_SERIAL_ISEXIST_ERROR__CONTENT = "设备号已被使用";

    /**
     * 用户不存在Code
     */
    public final static String MESSAGE_ACCOUNT_ISNOTEXIST_ERROR_CODE = "008";

    /**
     * 用户不存在Content
     */
    public final static String MESSAGE_ACCOUNT_ISNOTEXIST_ERROR__CONTENT = "用户不存在";

    /**
     * 设备具体类型Code
     */
    public final static String MESSAGE_DEVICE_TYPE_ERROR_CODE = "009";

    /**
     * 设备具体类型Content
     */
    public final static String MESSAGE_DEVICE_TYPE_ERROR_CONTENT = "设备具体类型格式不正确";

    /**
     * 设备号不存在Code
     */
    public final static String MESSAGE_SERIAL_ISNOTEXIST_ERROR_CODE = "010";

    /**
     * 设备号不存在Content
     */
    public final static String MESSAGE_SERIAL_ISNOTEXIST_ERROR__CONTENT = "设备号不存在";

    /**
     * 设备号不存在Code
     */
    public final static String MESSAGE_BINDSERIAL_ISNOTEXIST_ERROR_CODE = "011";

    /**
     * 设备号不存在Content
     */
    public final static String MESSAGE_BINDSERIAL_ISNOTEXIST_ERROR__CONTENT = "用户没有绑定设备";

    /**
     * 设备号不存在Code
     */
    public final static String MESSAGE_PARAM_IS_NULL_ERROR_CODE = "012";

    /**
     * 设备号不存在Content
     */
    public final static String MESSAGE_PARAM_IS_NULL_ERROR__CONTENT = "传入参数有为空字段";

    /**
     * 预约挂号不准重复预约同一号源code
     */
    public final static String MESSAGE_PARAM_NOT_ALLOW_ERROR_CODE = "013";

    /**
     * 预约挂号不准重复预约同一号源Content
     */
    public final static String MESSAGE_PARAM_NOT_ALLOW_ERROR__CONTENT = "您已订购过该时段号源，不能重复订购";

    /**
     * 无退款权限 code
     */
    public final static String MESSAGE_REFUND_NOT_ALLOW_CODE = "014";

    /**
     * 无退款权限 Content
     */
    public final static String MESSAGE_REFUND_NOT_ALLOW_CONTENT = "不允许退款";

    /**
     * 退款申请成功 code
     */
    public final static String MESSAGE_REFUND_APPLY_SUCCESS_CODE = "015";

    /**
     * 退款申请成功 Content
     */
    public final static String MESSAGE_REFUND_APPLY_SUCCESS_CONTENT = "退款申请成功,支付宝正在退款";

    /**
     * 退款处理失败 code
     */
    public final static String MESSAGE_REFUND_PROCESS_ERROR_CODE = "016";

    /**
     * 退款处理失败 Content
     */
    public final static String MESSAGE_REFUND_PROCESS_ERROR_CONTENT = "退款处理失败,请稍后重试";

    /**
     * 该身份审核已经通过不能再提交
     */
    public final static String MESSAGE_DOCOAUTHINFO_ISEXIST_ERROR__CONTENT = "该身份审核已经通过不能再提交";

    /**
     * 该身份审核已经通过不能再提交
     */
    public final static String MESSAGE_DOCOAUTHINFO_ISNOEXIST_ERROR__CODE = "017";

    /**
     * 订单号不存在
     */
    public final static String MESSAGE_ORDER__ISNOTEXIST_CONTENT = "订单号不存在";

    /**
     * 订单号不存在
     */
    public final static String MESSAGE_ORDER__ISNOTEXIST__CODE = "018";
    public final static String MESSAGE_DATE__OVER__CONTENT = "当前日期已过期，不能排班";
    /**
     * 更新数据失败
     */
    public final static String MESSAGE_UPDATE_ERROR_CODE = "019";
    /**
     * 更新数据失败
     */
    public final static String MESSAGE_UPDATE_ERROR_CONTENT = "更新数据失败";
    /**
     * 插入数据失败
     */
    public final static String MESSAGE_SAVE_ERROR_CODE = "020";
    /**
     * 插入数据失败
     */
    public final static String MESSAGE_SAVE_ERROR_CONTENT = "插入数据失败";

    /**
     * 处方号不存在
     */
    public final static String MESSAGE_PRESCRIPTION_ISNOTEXIST_CODE = "021";
    /**
     * 处方号不存在
     */
    public final static String MESSAGE_PRESCRIPTION_ISNOTEXIST_CONTENT = "处方号不存在";

    public final static String MESSAGE_METHOD_ERROR_CODE = "022";

    public final static String MESSAGE_METHOD_ERROR_CONTENT = "请求方式不正确";

    public final static String INTERNAL_ERROR_CODE = "400";

    public final static String INTERNAL_ERROR_CONTENT = "内部错误";

    public final static String JSON_PARSE_ERROR = "401";

    public final static String JSON_PARSE_ERROR_CONTENT = "JSON匹配异常";
    /**
     * 三师团队
     */
    public final static String MESSAGE_NOTFIND_ERROR_CODE = "600001";
    public final static String MESSAGE_NOTFIND_ERROR_CONTENT = "暂无服务该社区的三师团队";

    public final static String MESSAGE_SIGN_ERROR_CODE = "600002";
    public final static String MESSAGE_SIGN_ERROR_CONTENT = "不能重复签约，请联系健管师找回账号";
    /**
     * 三师签约
     */
    public final static String MESSAGE_USER_SIGN_INFO_ERROR_CODE = "600003";
    public final static String MESSAGE_USER_SIGN_INFO_ERROR_CONTENT = "暂无用户信息";
    /**
     * 三师团队
     */
    public final static String MESSAGE_VILLAGE_NOTFIND_ERROR_CODE = "600010";
    public final static String MESSAGE_VILLAGE_NOTFIND_ERROR_CONTENT = "找不到该街道下的社区";

}
