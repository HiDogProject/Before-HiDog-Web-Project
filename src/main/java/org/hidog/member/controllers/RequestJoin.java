package org.hidog.member.controllers;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RequestJoin {

    @NotBlank @Size(min = 5, max = 20)
    private String id;

    @NotBlank @Email
    private String email;

    @NotBlank @Size(min = 8, max = 20)
    private String password;

    @NotBlank
    private String confirmPassword;

    @NotBlank @Size(min = 2, max = 10)
    private String nickName;

    @NotBlank
    private String address1;

    private String address2;

    @AssertTrue
    private boolean agree;
}
