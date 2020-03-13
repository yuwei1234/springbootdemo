package com.example.springbootdemo.base;

import java.util.List;

public class ResultResponse <T>{

    public static Result error(String msg, String status, String code){
        return new Result(msg, status, code);
    }

    public static Result success(String msg, String status, String code){
        return new Result(msg, status, code);
    }

    public static<T> Result  success(String msg, String status, String code , T data){
        return new Result(msg, status, code, data);
    }
    public static<T> Result  success(String msg, String status, String code , List<T> data){
        return new Result(msg, status, code, data);
    }
}
