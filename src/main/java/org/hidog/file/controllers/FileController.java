package org.hidog.file.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController // rest 형태로 처리할거임, 주로 자바스크립트로 처리할 것 같아서
@RequiredArgsConstructor
@RequestMapping("/file")
public class FileController {

    /**
     * 파일 업로드
     */
    @PostMapping("/upload")
    public void upload() {

    }

    /**
     * 파일 다운로드
     */
    @GetMapping("/download/{seq}")
    public void download() {

    }

    /**
     * 파일 개별 삭제
     */
    @DeleteMapping("/delete/{seq}")
    public void delete() {
    }

    /**
     * 파일 목록 삭제
     */
    @DeleteMapping("/deletes/{gid}")
    public void deletes() {
    }

    /**
     * 파일 개별조회 by 등록번호
     */
    @GetMapping("/info/{seq}")
    public void get() {
    }

    /**
     * 파일 목록 조회
     */
    @GetMapping("/list/{gid}")
    public void getList() {
    }
}

