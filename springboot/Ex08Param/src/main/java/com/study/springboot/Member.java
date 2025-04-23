package com.study.springboot;

import lombok.*;
import org.springframework.stereotype.Component;

//1. springframework의 @Value
// 1) application의 설정값을 주입하는 용도

@Component
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    @Value("username")
    String username;
    @Value("password")
    String password;
}