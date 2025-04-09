package com.study.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HtmlController {
    @GetMapping("/")
    public String main(){
        return "index";
    }
    @GetMapping("/calc-submit")
//   @RequestParam("num1") String num1 처럼 같으면 @RequestParam String num1로 생략하기 가능
    public String calcSubmit(@RequestParam("num1") String number1, @RequestParam("num2") String number2,
                             @RequestParam String calType, Model model){
        System.out.println("num1 = " + number1 + ", num2 = " + number2 + ", calType = " + calType + ", model = " + model);

        int result =0;
        int num1 = Integer.parseInt(number1);
        int num2 = Integer.parseInt(number2);
        if(calType.equals("add")){
            result = num1 + num2;
        } else if(calType.equals("sub")){
            result = num1 - num2;
        }
        else if(calType.equals("mul")){
            result = num1 * num2;
        }
        else if(calType.equals("div")){
            result = num1 / num2;
        }
        model.addAttribute("num1", number1);
        model.addAttribute("num2", number2);
        model.addAttribute("result", result);
        return "index";
    }

}
