package com.ribuluo.admin.common.util.wxPayUtil;

public class WeChatPayUtil {
    // 1.合作身份者ID，以2088开头由16位纯数字组成的字符串,或者商家的支付宝账户
    public static String partner = "2088*********4";
    // 2.请求网关
    public static String URL = "https://openapi.alipay.com/gateway.do";
    public static String URLDev = "http://openapi.alipaydev.com/gateway.do";
    //3.
    public static String service = "mobile.securitypay.pay";//固定值
    //4.用户的支付宝账号
    public static String seller_id = "3396321414@qq.com";
    //5.应用私钥
    public static String private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCXZGmDP+b++XPXLzzJzdkIel1ntofGBbMEBMUGjf2TlG+NP2TIQg0mzicS133453nkywGapveuV8Ct5fuaJbw7OH2jQZIUZBFoeZi1jgFXmkxxf3d3+AQV7IDsW393T51hRMx3VoKtOUzYT0kfnALqdnsGLE1NNzlt+7aRzmv8E4OJqNjr1OIWu/83TDzIuI0ka2heWBgThaXBwSobZMwekCO+490L6yvT5hT9jbFKEIZgmQbGU6gE6mrVDJe+LkpRtAi7p49i3pZxviJEcJIA0SKrjTma27Vl8YlzgpkpumQymBLzw6s2h4Z0BbG7V6CebV95ALO50s6Kj+7o7wfDAgMBAAECggEAR2qy65uFmNqMbwJ1pq1YqMswrPBKdHvTyx2E5GavLKNlTDiPjni6Q4gUnqrRXk20Dt5FT3Nce/4hgudvHXSXq0gm3JDeHIhoPeS+yUbIE09SqGf9L7bsFnuPBfDT3LDOCUivO8yvsI/LVG9yi1rJdVmXB352qOpYSS3pHjdGcY75KbFH7O6j66QCnQO1PKXjTlOCAiXVm6IxuvM9sjkUoUV3M51ExCagfpfujC4ITlVCk5yujXYT0qWBT2M/LonNmTy77kP4Yp3/nilWA9zkdEpiqP16QcOptRO2CxrzYi4DnwavycXjDGTYl8qrLf8qqPBMLjhgu1HrYDrjTIm7IQKBgQDMlaPHnPLQ7EL4AqNf/TfUEBO3pFf3VLImyenpPb+5Iuo0Lz+MD52+KkCjaAC1v0EU3a1nQive0qg7b/y7XVBWhOTBbvv07UtbkB3lvAIEGNzzkrCW2QpgN88XA8ZtwaOqZYabhFcBN809SdPrzUvzrrGnJG6cflzGpEeQ8eCu3wKBgQC9cInOpfkDd7a/uEzlqy7Ygq6IkajBCzUHa9vzjAJa8AnC+E2y+1jRJq2mA/EKR0tx1d0ydflWlpL4Vq6xVo7SnqbCuGrC+qw39x08yblwyDMO6F6+yNtXB2c3MOT0jBSwwAg8Pg8N8Dia3xzqMWV2v3uvmTHhR23kxbz13gpXnQKBgClKTkrcT1mBRabeiXC3H4xqTkBzJ9ngOzB+8fnEH6zS8ifkHVQ8Vp7p0i/orrP/zLfUYcoEXexT4eZVHNIH7E359l1f8/Qj7GCnfpE+V73R8s4qHf/kACcZPG+tsF+4hDrA0OEUXab+RysGeoIN5jVhXbOZM8Xb7wecYmFLoAhLAoGADnVqbzVHvjYC4rskU1svZiMDQzUq1iEO2RQoY3xKKbqsZA8jjweUDdKP6l3epdQvM+8IxPMwJqWzbfTfvHVIzVaCj9YXf+41+seHmb4jwzHkg7zEjncyFoBgJlw6/Vc7tQnTFxX9fCjbiSaCRHWkst2GiS5+Gh2ji5R0Caf6zhkCgYEAoZDNC181fIcRjkRw1JJJAbar1akLNJmOmm94PkTR9VYIc4S+l0H99s6jNvhDtypwbWYkEBqXx4qI0azSvpsREYJuuZmZZCCQk+zJMfait5NfLFNgmOPWYcXf62XkSwJyTT/Q3TBLG1kA6ByI7Z6aYt7lfrNVdnnXMvX1qK2Fno8=";
    //6.应用公钥
    public static String public_key ="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAl2Rpgz/m/vlz1y88yc3ZCHpdZ7aHxgWzBATFBo39k5RvjT9kyEINJs4nEtd9+Od55MsBmqb3rlfAreX7miW8Ozh9o0GSFGQRaHmYtY4BV5pMcX93d/gEFeyA7Ft/d0+dYUTMd1aCrTlM2E9JH5wC6nZ7BixNTTc5bfu2kc5r/BODiajY69TiFrv/N0w8yLiNJGtoXlgYE4WlwcEqG2TMHpAjvuPdC+sr0+YU/Y2xShCGYJkGxlOoBOpq1QyXvi5KUbQIu6ePYt6Wcb4iRHCSANEiq405mtu1ZfGJc4KZKbpkMpgS88OrNoeGdAWxu1egnm1feQCzudLOio/u6O8HwwIDAQAB";
    //7.支付宝的公钥，无需修改该值（不要删除也不要修改，在接收通知的时候需要进行签名认证）
    public static String ali_public_key= "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAhBl5kOFSRNa1hAkyFGHAebBn2YmrSHOETs2S9MGMxAJ0fjqpauijKSYpgEYozeGq7wrMjcvgW2c6zPIT6LPx6xs4gFJ2txfOAIZSueDlJ1Mep1zloxayHeGAPR7INr9+hRp8wpffnvZrCJf2AoNUkVtpRMl2xv5cMJZlLdt91hi27ySk1pYf419hLUs+sdVDjD/JM5+9XXK3z3SmZdRogWhz0hzzSR82lmVDG1J6yP+hF2BvW3XUzo2CD11HeAH5ixx6tu+Z1kqE5fx3fOHx9A7cBWfcoZHdb/X6MAiXzMam36iA7hVHPTcAnrtVAqugnpR2TKcZ9qt5O3EiuWIbEQIDAQAB";
    //8.字符编码格式 目前支持 gbk 或 utf-8
    public static String input_charset = "utf-8";
    //9.签名方式 不需修改
    public static String sign_type = "RSA2";
    //10.APPID(上线ID)
    public static String APPID = "2018020302139671";
    //11支付宝回调地址
    public static String notify_url = "";
    // 12.返回格式
    public static String FORMAT = "json";

}
