package com.study.Ex15JSP;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HtmlController {
    @GetMapping("/")
    public String main(){
        return "ex01"; //exo1.jsp 응답
    }
    //url : localhost:8080/ex/02
    @GetMapping("/ex/{no}")
    public String ex(@PathVariable String no, Model model){
        model.addAttribute("홍길동","홍길동");
        return "ex" + no; //ex02.jsp응답
    }
}
