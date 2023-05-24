package co.kr.apti.board.domain.service;

import co.kr.apti.board.domain.controller.res.BoardDto;
import co.kr.apti.board.domain.entity.Board;
import co.kr.apti.board.domain.repository.BoardRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepo boardRepo;

    @Transactional
    public Board save(BoardDto boardDto) {
        return boardRepo.save(
                            Board.builder()
                                .boardId(boardDto.getBoardId())
                                .title(boardDto.getTitle())
                                .content(boardDto.getContent())
                                .author(boardDto.getAuthor())
                                .build()
                            );
    }

    // 목록 조회
    @Transactional
    public List<BoardDto> findAll() {

        List<BoardDto> boardDtoList = new ArrayList<>();

        List<Board> boardList = boardRepo.findAll(Sort.by(Sort.Direction.ASC,"boardId"));

        for(Board board : boardList) {
            BoardDto boardDto = BoardDto.builder()
                    .boardId(board.getBoardId())
                    .title(board.getTitle())
                    .content(board.getContent())
                    .author(board.getAuthor())
                    .createdDate(board.getCreatedDate())
                    .build();

            boardDtoList.add(boardDto);
        }
        return boardDtoList;
    }


    @Transactional
    public Board findByBoardId(Long boardId) {

        // 예외 처리
        Board boardDetail = boardRepo.findById(boardId).get();

        return boardDetail;
    }

    @Transactional
    public void deleteByBoardId(Long boardId) {
        boardRepo.deleteById(boardId);
    }









//    @Transactional
//    public List<BoardDto> getBoardList() {
//        List<Board> boardList = boardRepo.findAll();
//        List<BoardDto> boardDtoList = new ArrayList<>();
//
////
////        for(Board board : boardList) {
////            BoardDto boardDto = BoardDto.builder()
////                    .id(board.getId())
////                    .author(board.getAuthor())
////                    .title(board.getTitle())
////                    .content(board.getContent())
////                    .createdDate(board.getCreatedDate())
////                    .build();
////            boardDtoList.add(boardDto);
//        }
////        return boardDtoList;
//    }
}
