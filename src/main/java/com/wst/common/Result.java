package com.wst.common;

/**
 * @author wangst
 * @description s
 * @date 2021/8/5
 */
public class Result {
    private String code;
    private String msg;
    private Object data;

    private static final String CODE_SUCCESS="0";
    private static final String CODE_FAIL="-1";


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static Result success(Object data){
        Result r = new Result();
        r.setCode(CODE_SUCCESS);
        r.setData(data);
        r.setMsg("操作成功");

        return r;

    }
    public static Result success(String msg,Object data){
        Result r = new Result();
        r.setCode(CODE_SUCCESS);
        r.setData(data);
        r.setMsg(msg);

        return r;

    }
    public static Result fail(String msg){
        Result r = new Result();
        r.setCode(CODE_FAIL);
        r.setData(null);
        r.setMsg(msg);

        return r;

    }
    public static Result fail(String msg,Object data){
        Result r = new Result();
        r.setCode(CODE_FAIL);
        r.setData(data);
        r.setMsg(msg);

        return r;

    }
}
