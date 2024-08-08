package org.hidog.mypage.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mypage")
@RequiredArgsConstructor
public class MypageController { /* 구성 순서 : 컨트롤러-뷰-엔티티-커맨드-검증-서비스 */
    /**
     * 1) 마이 페이지 메인 : 회원 정보 확인 버튼 / 회원 정보 수정 버튼 / 프로필 이미지 설정 버튼 / 찜한 목록 버튼 / 작성 글 목록 버튼 / 판매 & 구매 내역 버튼
     * 2) 마이 페이지 -> 회원 정보 확인 버튼 클릭 시 회원 정보 페이지로 이동
     * 3) 마이 페이지 -> 회원 정보 수정 버튼 클릭 시 본인 인증 -> 회원 정보 수정 페이지로 이동
     * -> 회원 정보 수정 페이지에서 원하는 부분 수정 -> 수정하기 클릭 시 수정 내용 저장 및 정보 변경, 마이 페이지 홈으로 이동
     * 4) 마이 페이지 -> 프로필 클릭 시 이미지 변경 창이 팝업 생성 -> 이미지 변경 후 변경 내용 반영
     * 5) 마이 페이지 -> 찜한 목록 보기 버튼 클릭 시 찜 목록 페이지로 이동 (당근 마켓 처럼 이미지 형식으로)
     * 6) 마이 페이지 -> 작성한 글 목록 보기 버튼 클릭 시 글 목록 페이지로 이동 -> 본인이 쓴 글 조회 가능
     * 7) 마이 페이지 -> 판매 & 구매 내역 버튼 클릭 시 판매 & 구매 내역으로 이동 -> 본인의 판매 & 구매 내역 조회 가능
     */

    // 마이 페이지 홈
    @GetMapping("/myhome")
    public String mypage() {
        return "front/mypage/myhome";
    }

    // 마이 페이지 -> 회원 정보 확인 버튼 클릭 시 회원 정보 페이지로 이동
    @GetMapping("/info")
    public String viewMemberInfo() {
        return "front/mypage/info";
    }

    // 마이 페이지 -> 회원 정보 수정 버튼 클릭 시 본인 인증 후 회원 정보 수정 페이지로 이동
    @GetMapping("/changInfo")
    public String changeMemberInfo() {
        return "front/mypage/changeInfo";
    }

    // 회원 정보 수정 페이지에서 수정 내용 저장 및 정보 변경, 마이 페이지 홈으로 이동
    @PostMapping("/changeInfo")
    public String saveChangedMemberInfo() {
        return "redirect:/myhome";
    }

    // 마이 페이지 -> 프로필 클릭 시 이미지 변경 창이 팝업 생성
    @GetMapping("/profile")
    public String changeProfileImage() {
        return "front/mypage/changeProfile";
    }

    // 프로필 이미지 변경 후 변경 내용 반영
    @PostMapping("/profile")
    public String saveProfileImage() {
        return "redirect:/myhome";
    }

    // 마이 페이지 -> 찜한 목록 보기 버튼 클릭 시 찜 목록 페이지로 이동
    @GetMapping("/like")
    public String viewlike() {
        return "front/mypage/like";
    }

    // 마이 페이지 -> 작성한 글 목록 보기 버튼 클릭 시 글 목록 페이지로 이동
    @GetMapping("/post")
    public String viewMyPost() {
        return "front/mypage/post";
    }

    // 마이 페이지 -> 판매 & 구매 내역 버튼 클릭 시 판매 & 구매 내역으로 이동
    @GetMapping("/sellAndBuy")
    public String viewSellAndBuy() {
        return "front/mypage/sellAndBuy";
    }
}