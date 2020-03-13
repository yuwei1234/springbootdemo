package com.example.springbootdemo.base;

import java.util.List;

public class Result<T> {

    private String msg;

    private String status;

    private String code;

    private T data;

    private List<T> datas;

    public Result(String msg, String status, String code) {
        this.msg = msg;
        this.status = status;
        this.code = code;
    }

    public Result(String msg, String status, String code, T data) {
        this.msg = msg;
        this.status = status;
        this.code = code;
        this.data = data;
    }

    public Result(String msg, String status, String code, List<T> datas) {
        this.msg = msg;
        this.status = status;
        this.code = code;
        this.datas = datas;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public List<T> getDatas() {
        return datas;
    }

    public void setDatas(List<T> datas) {
        this.datas = datas;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
