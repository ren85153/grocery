package com.ribuluo.admin.common.util.wxPayUtil;

/**
 * 微信公众号相关的配置
 * 
 * @author yuanyuana
 * @date 2019年1月17日7月2日
 *
 */
public class WechatConfig {

	public static final String APP_ID = "wxaa35131f98dcbb68";//匠学的APPID
	public static final String XCX_APP_ID="wx9aacb213f422ca6c";//小程序的APPID
	public static final String XCX_APPSECRET="fa87226d4db4f583970d76e94ff9a47b";
	public static final String APP_SECRET = "xx";//待用
	public static final String WECHAT_TOKEN = "xx";//待用
	public static final String MCH_ID = "1503241881";//匠学商户号
	public static final String BODY = "匠学-鲜花购买";
	public static final String TRADE_TYPE = "APP";//交易类型
	// 异步通知URL
	public static final String NOTIFY_URL = "http://47.97.195.85:4000/question/wxPayCallBack";
	//API_KEY
	public  static final String API_KEY = "32092219940428613362220243010708";


	// 微信支付统一接口(POST)
	public static final String UNIFIED_ORDER_URL = "https://api.mch.weixin.qq.com/pay/unifiedorder";
	// 微信退款接口(POST)
	public static final String REFUND_URL = "https://api.mch.weixin.qq.com/secapi/pay/refund";
	// 订单查询接口(POST)
	public static final String CHECK_ORDER_URL = "https://api.mch.weixin.qq.com/pay/orderquery";
	// 关闭订单接口(POST)
	public static final String CLOSE_ORDER_URL = "https://api.mch.weixin.qq.com/pay/closeorder";
	// 退款查询接口(POST)
	public static final String CHECK_REFUND_URL = "https://api.mch.weixin.qq.com/pay/refundquery";
	// 对账单接口(POST)
	public static final String DOWNLOAD_BILL_URL = "https://api.mch.weixin.qq.com/pay/downloadbill";
	// 短链接转换接口(POST)
	public static final String PAY_SHORT_URL = "https://api.mch.weixin.qq.com/tools/shorturl";
	// 接口调用上报接口(POST)
	public static final String REPORT_URL = "https://api.mch.weixin.qq.com/payitil/report";
	// Token
	public static final String GET_ACCESS_TOKEN_URL = "https://api.weixin.qq.com/cgi-bin/token";
	// 创建二维码
	public static final String CREATE_TICKET_PATH = "https://api.weixin.qq.com/cgi-bin/qrcode/create";
	// 通过ticket换取二维码
	public static final String SHOW_QRCODE_PATH = "https://mp.weixin.qq.com/cgi-bin/showqrcode";
	// 长链接转成短链接
	public static final String WECHAT_SHORT_QRCODE_URL = "https://api.weixin.qq.com/cgi-bin/shorturl";

	// 创建菜单
	public static final String MENU_CREATE_URL = "https://api.weixin.qq.com/cgi-bin/menu/create";
	// 查询自定义菜单
	public static final String MENU_GET_URL = "https://api.weixin.qq.com/cgi-bin/menu/get";
	// 删除自定义菜单
	public static final String MENU_DELTE_URL = "https://api.weixin.qq.com/cgi-bin/menu/delete";

	// 发送模板消息
	public static final String SEND_TEMPLATE_MESSAGE = "https://api.weixin.qq.com/cgi-bin/message/template/send";

	// 授权链接
	public static final String AUTHORIZE_OAUTH_URL = "https://open.weixin.qq.com/connect/oauth2/authorize";
	// 获取token的链接
	public static final String GET_OAUTH_TOKEN_URL = "https://api.weixin.qq.com/sns/oauth2/access_token";
	// 刷新token
	public static final String REFRESH_OAUTH_TOKEN_URL = "https://api.weixin.qq.com/sns/oauth2/refresh_token";
	// 获取授权用户信息
	public static final String SNS_USERINFO_URL = "https://api.weixin.qq.com/sns/userinfo";
	// 判断用户accessToken是否有效
	public static final String CHECK_SNS_AUTH_STATUS_URL = "https://api.weixin.qq.com/sns/auth";
	// 授权登陆链接
	public static final String QR_CONNECT_URL = "https://open.weixin.qq.com/connect/qrconnect";
	// 获取jsapi_ticket
	public static final String GET_TICKET_URL = "https://api.weixin.qq.com/cgi-bin/ticket/getticket";// ?access_token=ACCESS_TOKEN&type=jsapi

	// 多媒体上传
	public static final String UPLOAD_MEDIA_TYPE_URL = "https://api.weixin.qq.com/cgi-bin/media/upload"; // ?access_token=ACCESS_TOKEN&type=TYPE
	public static final String UPLOAD_FOREVER_NEWS_MEDIA_URL = "https://api.weixin.qq.com/cgi-bin/material/add_news";
	public static final String UPLOAD_TEMP_MEDIA_TYPE_URL = "https://api.weixin.qq.com/cgi-bin/media/upload";
	public static final String UPLOAD_FOREVER_MEDIA_TYPE_URL = "https://api.weixin.qq.com/cgi-bin/material/add_material";

	//获取群发视频post中的media_id  
	public static final String UPLOAD_VIDEO_MEDIA_URL = " https://api.weixin.qq.com/cgi-bin/media/uploadvideo";  
	// 上传图文消息内的图片获取URL
	public static final String UPLOAD_IMG_MEDIA_URL = "https://api.weixin.qq.com/cgi-bin/media/uploadimg";
	// 上传图文消息素材的path
	public static final String UPLOAD_NEWS_MEDIA_URL = "https://api.weixin.qq.com/cgi-bin/media/uploadnews";
	// 按分组进行群发
	public static final String SEND_ALL_MASS_MESSAGE_URL = "https://api.weixin.qq.com/cgi-bin/message/mass/sendall";
	// 按照openid进行群发消息(OpenID最少2个，最多10000个 10000个)  
	public static final String SEND_MASS_MESSAGE_URL = "https://api.weixin.qq.com/cgi-bin/message/mass/send";
	// 删除群发消息
	public static final String DELETE_MASS_MESSAGE_URL = "https://api.weixin.qq.com/cgi-bin/message/mass/delete";
	// 预览接口
	public static final String PREVIEW_MASS_MESSAGE_URL = "https://api.weixin.qq.com/cgi-bin/message/mass/preview";
	// 查询群发消息的发送状态
	public static final String GET_MASS_MESSAGE_URL = "https://api.weixin.qq.com/cgi-bin/message/mass/get";

}
