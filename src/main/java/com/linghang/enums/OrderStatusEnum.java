package com.linghang.enums;

public enum OrderStatusEnum implements CodeEnum {

    NEW(0, "新订单"), FINISHED(1, "已完结"), CANCEL(2, "已取消");

    private Integer code;

    private String msg;

    OrderStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
