package com.qiao.exception;

public enum MyEnum {
    PARAMTER_EXCEPTION("400", "参数错误"),
    SERVICE_TIME_OUT("103","连接超时");

    private String code;
    private String msg;

    MyEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
