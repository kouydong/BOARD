package co.kr.apti.board.domain.entity;

import co.kr.apti.board.domain.entity.common.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.time.LocalDateTime;

@Entity
@DynamicInsert
@DynamicUpdate
@Table(name="MEMBER")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;

    @Column(length = 80, nullable = false, updatable = false, unique = true)
    private String id;

    @Column(length = 60, nullable = false)
    private String password;

    @Column(unique = true)
    private String email;

    @Column(length = 40, nullable = false)
    private String name;

    @Column(length = 40, nullable = false, unique = true)
    private String nickName;

    @Column(name = "last_login")
    private LocalDateTime updateDate;

}

