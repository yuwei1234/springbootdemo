package com.example.springbootdemo.exception;


import com.example.springbootdemo.base.Result;
import com.example.springbootdemo.base.ResultResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class MyRuntimeException{

    @ResponseBody
    @ExceptionHandler(RuntimeException.class)
    public Result excetionHandler(){
        return ResultResponse.error("传入参数有误","error","500");
    }
}
