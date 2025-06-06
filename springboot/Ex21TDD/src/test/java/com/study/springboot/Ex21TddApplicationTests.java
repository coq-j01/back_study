package com.study.springboot;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Ex21TddApplicationTests {

	@Test
	void contextLoads() {
	}

    public static class LifeCycleTest {
        @Test
        @DisplayName("테스트!")
        void test1(){
            System.out.println("테스트1");
        }
        @Test
        @DisplayName("테스트2-비활성화")
        @Disabled
        void test2(){
            System.out.println("테스트2");
        }
        @BeforeAll //테스트 클래스를 기준으로 테스트 메소드들이 실행되기 전에 한 번 실행
        static void beforeAll(){
            System.out.println("beforeAll");
        }
        @AfterAll //테스트 클래스 기준으로 테스트 메소드들이 실행된 후에 한 번 실행
        static void afterAll(){
            System.out.println("afterAll");
        }
        @BeforeEach //각 테스트 메소드가 실행된 후에 매번 실행
        void beforeEach(){
            System.out.println("beforeEach");
        }
        @AfterEach //각 테스트 메소드가 실행된 후에 매번 실행
        void afterEach(){
            System.out.println("afterEach");
        }
    }
}
