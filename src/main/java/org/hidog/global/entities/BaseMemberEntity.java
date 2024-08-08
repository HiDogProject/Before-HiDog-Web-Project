package org.hidog.global.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;

// 회원정보가 필요한 클래스가 상속받을 클래스
@MappedSuperclass
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseMemberEntity extends BaseEntity implements Serializable {

    @CreatedBy
    @Column(updatable = false, length = 65)
    private String createdBy;

    @LastModifiedBy
    @Column(length = 65, insertable = false)
    private String modifiedBy;
}
