package com.springboot.blog.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;
@Entity // user클래스가 mysql에 테이블이 생성이 된다.
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 프로젝트에서 연결된 db의 넘버링 전략을 따라간다.
    private int id;
    private String username;
    private String password;
    private String email;
    private Timestamp createDate;

}
