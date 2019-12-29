package com.ribuluo.admin.common.util;

import org.springframework.http.ResponseEntity;
import java.util.HashMap;
import java.util.Map;
/**
 * Created by 刘元凡 on 2017/7/13.
 */
public class ResponseUtil {

    public class HmResponse{
        private Object data;
        private String msg;
        private int errorCode;

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public int getErrorCode() {
            return errorCode;
        }

        public void setErrorCode(int errorCode) {
            this.errorCode = errorCode;
        }
    }

    public static ResponseEntity<Map> success(Object data){
        Map result = buildBase(0,"");
        result.put("data",data);
        return ResponseEntity.ok(result);
    }

    public static ResponseEntity<Map> error(String msg){
        Map result = buildBase(-1,msg);
        result.put("data","");
        return ResponseEntity.badRequest().body(result);
    }

    private static Map<String,Object> buildBase(int errorCode,String msg){
        Map<String,Object> data = new HashMap();
        data.put("errorCode",errorCode);
        data.put("msg",msg);
        return data;
    }
}
