package com.study.Pr06VMAPI;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String main(){
        return "Machine";
    }
    @GetMapping("/add")
    public String add(){
        return "AddItems";
    }
}
