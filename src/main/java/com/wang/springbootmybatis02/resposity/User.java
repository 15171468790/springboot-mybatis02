package com.wang.springbootmybatis02.resposity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class User {
    private long id;
    private String userName;
    private String password;
    private String userSex;
    private String nickName;
}
