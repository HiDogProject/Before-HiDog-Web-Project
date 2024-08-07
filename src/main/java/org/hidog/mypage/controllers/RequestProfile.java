package org.hidog.mypage.controllers;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RequestProfile {
    @NotBlank
    private String id; // Member의 id

    private String profileImage; // 프로필 이미지
}