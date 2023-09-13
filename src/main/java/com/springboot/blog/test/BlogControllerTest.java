package com.springboot.blog.test;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 스프링이 com.springboot.blog 패키지 이하를 스캔해서 모든 파일을 메모리에 new하는 것이 아니고
// 특정 어노테이션이 붙어있는 클래스 파일들을 new 해서 스프링 컨테이너에 관리해줌
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@RestController
public class BlogControllerTest {
     @GetMapping("/test/hello")
     public String hello(){
         return "<H1>hello spring boot </H1>";
     }
}
