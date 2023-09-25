package co.kr.apti.board.domain.controller.dto;


import co.kr.apti.board.domain.entity.Board;
import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Builder
public class BoardDto {

    private Long boardId;
    private boolean isNotice;
    private String title;
    private String author;
    private String content;
    private Integer likeCount;
    private Integer dislikeCount;
    private Integer readCount;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;


    public BoardDto(Long boardId, boolean isNotice, String title, String author, String content, Integer likeCount, Integer dislikeCount, Integer readCount, LocalDateTime createdDate, LocalDateTime modifiedDate) {
        this.boardId = boardId;
        this.isNotice = isNotice;
        this.title = title;
        this.author = author;
        this.content = content;
        this.likeCount = likeCount;
        this.dislikeCount = dislikeCount;
        this.readCount = readCount;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }
//    public Board toEntity() {
//        Board build = Board.builder()
//                .id(id)
//                .author(author)
//                .title(title)
//                .content(content)
//                .build();
//        return build;
//    }


}
