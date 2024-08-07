package org.hidog.member.controllers;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;

@Data
public class RequestLogin implements Serializable {

    @NotBlank
    private String email;
    @NotBlank @Size(min = 8, max = 20)
    private String password;

    private boolean success = true;
    private String code;
    private String defaultMessage;

    private String redirectUrl;  //로그인  성공시 이동할 주소

}
