package org.hidog.member.repositories;

import com.querydsl.core.types.dsl.BooleanExpression;
import org.hidog.member.entities.Member;
import org.hidog.member.entities.QMember;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long>, QuerydslPredicateExecutor<Member> {

    @EntityGraph(attributePaths = "authorities")
    Optional<Member> findByEmail(String email);

    default boolean existsByEmail(String email) {
        QMember member = QMember.member;
        BooleanExpression predicate = member.email.eq(email);
        return exists(predicate);
    }
}