package com.springboot.blog.test;

import org.springframework.web.bind.annotation.*;
// 사용자가 요청 -> 응답 (html)
// @Controller

// 사용자가 요청 -> 응답 (Data)
@RestController
public class HttpController {
    //http://localhost:8080/http/get
    // 인터넷 브라우저 요청은 무조건 get요청 밖에 할 수 없다.
    // get방식으로 데이터를 요청할 때는 쿼리스트링 방식 밖에 없음
    @GetMapping("/http/get")
    public String getTest(Member m){
        return "get요청" + m.getId() + ", " + m.getUsername() +", "+m.getEmail();
    }
    //http://localhost:8080/http/post
    @PostMapping("/http/post")
    public String postTest(@RequestBody Member m){  // MessageConvertor(스프링 부트)
        return "post요청 ," + m.getId() + ", " + m.getUsername() + ", " + m.getEmail();
    }
    @PutMapping("/http/put")
    public String putTest(@RequestBody Member m){
        return "put요청," + m.getId() + ", " + m.getUsername() + ", " + m.getEmail();
    }
    @DeleteMapping("/http/delete")
    public String deleteTest(@RequestBody Member m){
        return "delete요청";
    }


}
