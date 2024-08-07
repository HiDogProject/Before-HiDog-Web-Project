package org.hidog.member.controllers;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RequestLogin {

    @NotBlank
    private String id;
   @NotBlank @Size(min = 8, max = 20)
    private String password;

    private boolean success = true;
    private String code;
    private String defaultMessage;

    private String redirectUrl;  //로그인  성공시 이동할 주소

}
