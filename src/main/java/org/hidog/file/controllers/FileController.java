package org.hidog.file.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // rest 형태로 처리할거임, 주로 자바스크립트로 처리할 것 같아서
@RequiredArgsConstructor
@RequestMapping("/file")
public class FileController {

}
