package co.kr.apti.board.domain.entity;


import co.kr.apti.board.domain.entity.common.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;


@Entity
@DynamicInsert
@DynamicUpdate
@Table(name="BOARD")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Board extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long boardId;

    @Column(length = 1)
    @ColumnDefault("'N'")
    private boolean isNotice;

    @Column(length = 250, nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    @Column(updatable = false)
    @ColumnDefault("0")
    private Long likeCount;

    @Column(updatable = false)
    @ColumnDefault("0")
    private Long dislikeCount;

    @Column(updatable = false)
    @ColumnDefault("0")
    private Long readCount;

}
