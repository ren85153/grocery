package com.ribuluo.admin.common.exception;

/**
 */
public class ResultUtil {
    public static Result success() {
        return success(null);
    }
    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(ResultCode.SUCCESS);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }
    public static Result success(Object msg,Object data){
        Result result = new Result();
        result.setCode(ResultCode.SUCCESS);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }
    public static Result success(Integer code,Object object) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    public static Result error( String msg) {
        Result result = new Result();
        result.setCode(ResultCode.ERROR);
        result.setMsg(msg);
        return result;
    }
    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
