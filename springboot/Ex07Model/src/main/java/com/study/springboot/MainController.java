package com.study.springboot;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//Java코드에서 UI템플릿(타임리프,JSP,머스테치)으로 데이타 전달
//1. request객체, session객체
//2. GET, POST 파라미터
//3. Model 객체
//4. ModelAndView 객체

//내장객체별 수명주기
//applicaton : 웹브라우저를 닫을 때까지
//session : 로그아웃하기 까지
//request : 요청에 대한 응답하기까지
//model : request와 동일함.

@Controller
public class MainController {   //HttpServlet 클래스를 상속받아서, 서블릿으로 등록됨.
    @GetMapping("/")
    public String main(){ //Servlet Method
        //return "redirect:/index"; //@GetMapping("/index")가 필요 / -> /index로 바뀜
        return "forward:/index"; // /index로 바뀌지 않고 /인 상태로 /index 매핑
    }
    @GetMapping("index")
    public String index(HttpServletRequest request, HttpServletResponse response, HttpSession session){
        return "index";
    }
    @GetMapping("/model1")
    public String model1(HttpServletRequest request){
        request.setAttribute("name","홍길동");
        request.setAttribute("age","30");

        request.getSession().setAttribute("isLogin","true");

        return "index";
    }
    @GetMapping("/post-form")
    public String postForm(){
        return "postForm";
    }
    @PostMapping("/model2")
    public String model2(HttpServletRequest request){
        String param_name = request.getParameter("name");
        String param_age = request.getParameter("age");
        request.setAttribute("name",param_name);
        request.setAttribute("age",param_age);
        return "index";
    }
    //ModelAndView : 모델(데이터)와 View(HTML)을 동시에 저장하는 객체
    @RequestMapping("/model3")
    public ModelAndView model3(ModelAndView mv){
        mv.addObject("name","춘향이");
        mv.addObject("age","18");
        mv.setViewName("index");
        return mv;
    }
}