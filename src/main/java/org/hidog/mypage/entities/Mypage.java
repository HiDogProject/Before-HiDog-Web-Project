package org.hidog.mypage.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hidog.member.entities.Member;

@Data
@Entity
@Builder
@NoArgsConstructor @AllArgsConstructor
public class Mypage { // entity = db 에 저장되는 값 | 회원 가입 시 아이디, 비밀번호, 이메일, 주소, 닉네임 설정

    @Id
    private Long id; // Member 엔티티의 id를 기본 키로 설정

    @MapsId @OneToOne @JoinColumn(name = "id") // Member 엔티티 값 사용
    private Member member;

    @Column(name = "profile_image", nullable = true)
    private String profileImage; // 회원 정보 수정에서 프로필 이미지 설정
}