package com.sparta.springmvc.response;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/response")
public class ResponseController {
        // content-type : text.html
        //reponsebody
        //{"name":"robbie", "age":95}
    @GetMapping("/json/string")
    @ResponseBody
    public String helloStringJson(){
        return"{\"name\":\"Robbie\",\"age\":95}";
        //json은 java에는 없어서 json형태의 string 문자열 타입으로 반환
    }

    // content-type : application/json
    //reponsebody
    //{"name":"robbie", "age":95}
    @GetMapping("/json/class")
    @ResponseBody //html(view)반환하는 것이 아닌 그냥 데이터 반환할때
    public Star helloClassJson(){
        return new Star("Robbie",95);
        //spring에서 java의 객체를 json형태로 변환
    }
}
