package org.hidog.board.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {

    @GetMapping("/list") // 게시판리스트 조회
    public String boardList() {

        return "front/board/boardList";
    }
}
