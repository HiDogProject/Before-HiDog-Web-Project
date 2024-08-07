package org.hidog.mypage.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMypage is a Querydsl query type for Mypage
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMypage extends EntityPathBase<Mypage> {

    private static final long serialVersionUID = -1256491790L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMypage mypage = new QMypage("mypage");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final org.hidog.member.entities.QMember member;

    public final StringPath profileImage = createString("profileImage");

    public QMypage(String variable) {
        this(Mypage.class, forVariable(variable), INITS);
    }

    public QMypage(Path<? extends Mypage> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMypage(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMypage(PathMetadata metadata, PathInits inits) {
        this(Mypage.class, metadata, inits);
    }

    public QMypage(Class<? extends Mypage> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new org.hidog.member.entities.QMember(forProperty("member")) : null;
    }

}

