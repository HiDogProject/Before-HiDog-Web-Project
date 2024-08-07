package org.hidog.mypage.controllers;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RequestProfile {

    @NotBlank @Email
    private String email;

    @NotBlank @Size(min = 8, max = 20)
    private String password;

    @NotBlank @Size(min = 2, max = 10)
    private String nickName;

    @NotBlank
    private String address1;

    private String address2;

    private String profileImage; // 프로필 이미지
}