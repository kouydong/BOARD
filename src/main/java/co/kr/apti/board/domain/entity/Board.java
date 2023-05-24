package co.kr.apti.board.domain.entity;


import co.kr.apti.board.domain.entity.common.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;


@Entity
@DynamicInsert
@DynamicUpdate
@Table(name="BOARD")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
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
    private String author;

    @Column(nullable = false)
    private String content;

    @Column(updatable = false)
    @ColumnDefault("0")
    private Integer likeCount;

    @Column(updatable = false)
    @ColumnDefault("0")
    private Integer dislikeCount;

    @Column(updatable = false)
    @ColumnDefault("0")
    private Integer readCount;

    @Builder
    public Board(Long boardId, boolean isNotice, String title, String author, String content, Integer likeCount, Integer dislikeCount, Integer readCount) {
        this.boardId = boardId;
        this.isNotice = isNotice;
        this.title = title;
        this.author = author;
        this.content = content;
        this.likeCount = likeCount;
        this.dislikeCount = dislikeCount;
        this.readCount = readCount;
    }



}
