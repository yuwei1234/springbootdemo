package com.example.springbootdemo.controller;

import com.example.springbootdemo.exception.MyRuntimeException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @RequestMapping("hello")
    public int index() {
        return 1/0;
    }
}
