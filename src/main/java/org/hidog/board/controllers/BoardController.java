package org.hidog.board.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {

    /**
     * 게시판 리스트 보기
     *
     * @return
     */
    @GetMapping
    public String boardList() {

        return "front/board/boardList";
    }

    /**
     * 게시글 리스트 보기
     *
     * @param bid
     * @return
     */
    @GetMapping("/list/{bid}")
    public String list(@PathVariable("bid") int bid) {

        return "front/board/list";
    }

    /**
     * 게시글 1개 보기
     *
     * @param seq
     * @return
     */
    @GetMapping("/view/{seq}")
    public String view(@PathVariable("seq") long seq) {

        return "front/board/view";
    }

    /**
     * 게시글 작성
     *
     * @param bid
     * @return
     */
    @GetMapping("/write/{bid}")
    public String write(@PathVariable("bid") String bid) {

        return "front/board/write";
    }

    /**
     * 게시글 수정
     *
     * @param seq
     * @return
     */
    @GetMapping("/update/{seq}")
    public String update(@PathVariable("seq") long seq) {

        return "front/board/update";
    }

    /**
     * 게시글 저장, 수정
     *
     * @return
     */
    @PostMapping("/save")
    public String save() {

        return "front/board/save";
    }
}
