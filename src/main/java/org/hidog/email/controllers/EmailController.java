package org.hidog.email.controllers;

import org.hidog.email.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
@RequestMapping("/email")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/sendVerificationCode")
    public String sendVerificationCode(@RequestBody EmailRequest emailRequest) {
        String email = emailRequest.getEmail();

        // 생성된 인증번호를 이메일로 발송
        String verificationCode = generateVerificationCode();
        emailService.sendVerificationCode(email, verificationCode);

        return "인증번호가 발송되었습니다.";
    }

    private String generateVerificationCode() {
        // 6자리 숫자 인증번호 생성
        Random random = new Random();
        int code = 100000 + random.nextInt(900000);
        return String.valueOf(code);
    }
}
