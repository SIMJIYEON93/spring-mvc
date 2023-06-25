package com.sparta.springmvc.html;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {


    private static long visitCount =0;

    //정적인 페이지
    @GetMapping("/static-hello")
    public String hello(){
        return "hello.html";
        //static에 있는 hello.html을 반환하는 것이 아니라 thymeleaf때문에 templates폴더를 먼저 거쳐서 오류남
    }

    @GetMapping("/html/redirect")
    public String htmlStatic(){
        return "redirect:/hello.html";
        //templates폴더를 먼저 거친 후 다시 redirect 해서 hello.html로 직접 접근
    }

    @GetMapping("/html/templates")
    public String htmlTemplates(){
        return "hello";
        //thymeleaf engine에서 templates에 있는 hello.html을 바로 반환
    }



    // 동적인 페이지
    //mvc 패턴에서 반환할 데이터는 model에 담고 model이 적용이 될 viewname의 정보를 전달하면 viewresolve를 통해서
    //model의 데이터가 view에 적용이 되어 완성된 페이지를 cilent에 반환해준다.

    @GetMapping("/html/dynamic")
    public String htmlDynamic(Model model){//데이터를 모델에 넣는 데, spring에서는 model을 객체로 제공함
        visitCount++;// 이 api요청이 들어오면 방문count를 1씩 늘리기
        model.addAttribute("visits",visitCount);// model에 변화한 visitCount데이터 넣음
        return "hello-visit";
        //model(templates>hello-visit.html의 ${visits})과 viewname(hello-visit)의 정보 반환
    }
}
