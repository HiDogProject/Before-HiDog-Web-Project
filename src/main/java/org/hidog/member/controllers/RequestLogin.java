package org.hidog.member.controllers;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.io.Serializable;

@Data
public class RequestLogin implements Serializable {
    @NotBlank
    private String id;
    @NotBlank
    private String password;

}

