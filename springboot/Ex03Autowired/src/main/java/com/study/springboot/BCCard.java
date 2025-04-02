package com.study.springboot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("cardBC")
@Primary
public class BCCard implements ICard{

    @Override
    public void buy(String itemName) {
        System.out.println("BCCard itemName = " + itemName); //soutp

    }
}
