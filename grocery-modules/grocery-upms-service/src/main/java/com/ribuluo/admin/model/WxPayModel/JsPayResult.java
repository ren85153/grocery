package com.ribuluo.admin.model.WxPayModel;


/**
 * 微信内H5返回结果
 * @author yuanyuana
 * @date  2017年6月27日
 *
 */
public class JsPayResult extends JsPayParams {

	private static final long serialVersionUID = 392188712101246402L;
	private String errMsg;
	private String resultCode;

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

}
