package org.hidog.member.controllers;

import lombok.Data;

@Data
public class RequestLogin {

    private String id;

    private String email;

    private String password;

    private boolean success = true;

    private String code;
    private String defaultMessage;

    private String redirectUrl;  //로그인  성공시 이동할 주소

}
