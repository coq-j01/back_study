package com.study.springboot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController : @Controller + @ResponseBody
@Slf4j
@RestController
@RequestMapping("/api")
public class ApiController {
    @Autowired
    private ResDto resDto;

    @RequestMapping("/add")
    public ResDto add(@RequestBody ReqDto reqDto){
        resDto.setResult(reqDto.getNum1() + reqDto.getNum2());
        return resDto;
    }
    @RequestMapping("/sub")
    public ResDto sub(@RequestBody ReqDto reqDto){
        resDto.setResult(reqDto.getNum1() - reqDto.getNum2());
        return resDto;
    }

    @RequestMapping("/multi")
    public ResDto multi(@RequestBody ReqDto reqDto){
        resDto.setResult(reqDto.getNum1() * reqDto.getNum2());
        return resDto;
    }
    @RequestMapping("/divi")
    public ResDto div(@RequestBody ReqDto reqDto){
        resDto.setResult(reqDto.getNum1() / reqDto.getNum2());
        return resDto;
    }
}
