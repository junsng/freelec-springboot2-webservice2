package com.junsng.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication으로 인해 스프링부트의 자동설정, 스프링 Bean의 읽기와 생성을 모두 자동으로 설정됨
 * 특히나 @SpringBootApplication이 있는 위치부터 설정을 읽어 가기 때문에 항상 프로젝트 최상단에 위치해야함.
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
        //SpringApplication.run으로 인해 내장 WAS 실행.외부에 WAS를 두지 않고 애플리케이션을 실행할 때
        // 내부에서 WAS를 실행하는 것을 이야기함. 항상 서버에 톰캣을 설치할 필요가 없게 됨.
        // 스프링 부트로 만들어진 Jar파일로 실행하면 됨.
        /*1.내장 WAS를 사용하는 것을 권장
        -언제 어디서나 같은 환경에서 스프링 부트를 배포할 수 있다. ->나중에 버전 업 한다면? 일이 많아짐.
        -성능상 이슈는 크게 고려하지않아도 됨.
        */
    }
}
