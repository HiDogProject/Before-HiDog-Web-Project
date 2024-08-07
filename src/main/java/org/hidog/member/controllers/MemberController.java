package org.hidog.member.controllers;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hidog.member.services.MemberSaveService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.hidog.member.validators.JoinValidator;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
@SessionAttributes("requestLogin")
public class MemberController {

    private final JoinValidator joinValidator;
    private final MemberSaveService memberSaveService;

    @GetMapping("/join")
    public String join(@ModelAttribute RequestJoin form, Model model) {
        model.addAttribute("addScript", List.of("joinAddress"));
        return "front/member/join";
    }

    @PostMapping("/join")
    public String joinPs(@Valid RequestJoin form, Errors errors) {

        joinValidator.validate(form, errors);

        if (errors.hasErrors()) {
            return "front/member/join";
        }

        memberSaveService.save(form); // 회원 가입 처리

        return "redirect:/member/login";
    }

    @GetMapping("/login")
    public String login(@Valid @ModelAttribute RequestLogin form, Errors errors) {
        String code = form.getCode();
        if (StringUtils.hasText(code)) {
            errors.reject(code, form.getDefaultMessage());
        }
        return "front/member/login";
    }
}