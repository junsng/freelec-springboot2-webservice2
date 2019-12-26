package com.junsng.book.springboot.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class) // 1
@WebMvcTest // 2
public class HelloControllerTest {

    @Autowired // 3
    private MockMvc mvc; //4

    @Test
    public void hello가_리턴된다() throws Exception {
        String hello = "hello";

        mvc.perform(get("/hello")) //5
                .andExpect(status().isOk())  //6
                .andExpect(content().string(hello)); //7
    }
}


/*
 @RunWith(SpringRunner.class)
-테스트를 진행할 때 JUnit에 내장된 실행자 외에 다른 실행자를 실행시킵니다.
-여기서는 SrpingRunner라는 스프링 실행자를 사용합니다.
-즉,스프링부트 테스트와 JUnit 사이에 연결자 역할을 합니다.
*/
/*
 @WebMvcTest
-여러 스프링 테스트 어노테이션 중, Web(Spring MVC)에 집중할 수 있는 어노테이션 입니다.
-선언할 경우 @Controller,@Repository 등은 사용할 수 없습니다.
-여기서는 컨트롤러만 사용하기 때문에 선언합니다.
 */
 /*
 @Autowired
-스프링이 관리하는 빈을 주입받습니다.
*/
 /*
 private MockMvc mvc
 -웹 API를 테스트할 때 사용합니다.
 -스프링 MVC 테스트의 시작점입니다
 -이 클래스를 통해 HTTP GET,POST등에 대한 API 테스트를 할 수 있습니다
 */
 /*
 mvc.perform(get("/hello"))
-MockMvc를 통해 /hello 주소로 HTTP GET 요청을합니다
-체이닝이 지원되어 아래와 같이 여러 검증 기능을 이어서 선언할 수 있습니다
*/
/*
.andExpect(status.isOk())
-mvc.perform의 결과를 검증합니다
-HTTP Header의 Status를 검증합니다
-우리가 흔히 알고 있는 200,404,500등의 상태를 검증합니다
-여기서 ok즉,200인지 아닌지를 검사함*/
