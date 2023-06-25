package com.sparta.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody //HTML을 return 해주는 것이 아니라 그냥 문자열 전달이여서 @reponsebody사용
    public String hello(){
        return "hello world!!!!";       //viewname의 정보를 전달해주는 부분 -> 해당하는 html찾아서 전달
    }


    @GetMapping("/get")
    @ResponseBody
    public String get(){
        return "GET Method요청";
    }

    @PostMapping("/post")
    @ResponseBody
    public String post(){
        return "POST Method요청";
    }

    @PutMapping("/put")
    @ResponseBody
    public String put(){
        return "PUT Method요청";
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public String delete(){
        return "DELETE Method요청";
    }
}
