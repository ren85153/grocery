package com.ribuluo.admin.model.WxPayModel;

import java.io.Serializable;

/**
 * 返回参数的抽类型
 * @author yuanyuana
 * @date  2017年6月27日
 *
 */
public abstract class AbstractPayResult implements Serializable {
	
	private static final long serialVersionUID = 8862987039336247667L;
	private String appid; // 公众号id
	private String mch_id; // 商户号
	private String nonce_str; // 随机字符串
	private String sign; // 签名
	
	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getMch_id() {
		return mch_id;
	}

	public void setMch_id(String mch_id) {
		this.mch_id = mch_id;
	}

	public String getNonce_str() {
		return nonce_str;
	}

	public void setNonce_str(String nonce_str) {
		this.nonce_str = nonce_str;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

}