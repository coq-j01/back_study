package com.study.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ApiController {
    // 서버의 응답 JSON문자열로 구성
    // { count : 1 }
    @GetMapping("/")
    public String main(){
        return "Api Server OK";
    }
    @Autowired
    private Counter counter;

    @GetMapping("/plus")
    public @ResponseBody Counter plus(){
        counter.setCount(counter.getCount() + 1 );
        return counter;
        // "{ count : 1 }"
    }
    @GetMapping("/minus")
    public @ResponseBody Counter minus(){
        counter.setCount(counter.getCount() - 1);
        return counter;
    }
}
