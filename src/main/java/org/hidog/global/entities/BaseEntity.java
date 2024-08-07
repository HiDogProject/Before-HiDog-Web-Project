package org.hidog.global.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter @Setter
@MappedSuperclass // 공통속성화 클래스이다 알려주는 애노테이션
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity implements Serializable {

    @CreatedDate
    @Column(updatable = false) // 수정불가 // 처음가입일자는 수정 못하게 해야함
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(insertable = false) // 추가불가, 수정할 때 값 추가 가능
    private LocalDateTime modifiedAt;

    @Column(insertable = false) // 추가불가, 수정할 때 값 추가 가능
    private LocalDateTime deletedAt; // 일정시간이 지나면 자동 삭제
}
