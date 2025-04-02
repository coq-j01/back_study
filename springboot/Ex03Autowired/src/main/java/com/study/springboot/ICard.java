package com.study.springboot;

// interface에는 @Component 쓰지 않음
public interface ICard {
    // 인터페이스는 반환함수가 있음
    public void buy(String itemName);
}
