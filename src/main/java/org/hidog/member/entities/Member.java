package org.hidog.member.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor @AllArgsConstructor
public class Member {

    @Id @GeneratedValue
    private Long seq;

    @Column(length = 20,nullable = false, unique = true)
    private String id;

    @Column(length = 65, nullable = false, unique = true)
    private String email;

    @Column(length = 65, nullable = false)
    private String password;

    @Column(length = 40, nullable = false, unique = true)
    private String nickName;

    @Column(length = 60, nullable = false)
    private String address1;

    @Column(length = 60)
    private String address2;

    @ToString.Exclude
    @OneToMany(mappedBy = "member")
    private List<Authorities> authorities;
}