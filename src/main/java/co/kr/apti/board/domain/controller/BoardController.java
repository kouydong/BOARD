package co.kr.apti.board.domain.controller;

import co.kr.apti.board.domain.controller.dto.BoardDto;
import co.kr.apti.board.domain.entity.Board;
import co.kr.apti.board.domain.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;


    // 목록 조회
    @GetMapping("/")
    public String list(Model model) {

        List<BoardDto> boardDtoList = boardService.findAll();

        model.addAttribute("postList", boardDtoList);

        return "board/boardList.html";
    }


    // 글쓰기 화면
    @GetMapping("/board/new")
    public String register() {
        return "board/registerBoard.html";
    }


    // 글상세 화면
    @GetMapping("/board/{boardId}")
    public String update(Model model, @PathVariable("boardId") Long boardId) {
        Board board = boardService.findByBoardId(boardId);
        model.addAttribute("board", board);
        return "board/detailBoard.html";
    }


    // 글 저장
    @PostMapping("/board")
    @PutMapping("/board")
    public String save(BoardDto boardDto) {
        boardService.save(boardDto);
        return "redirect:/";
    }


    // 글 삭제
    @GetMapping("/board/delete")
    public String delete(@RequestParam("boardId") Long boardId) {
        boardService.deleteByBoardId(boardId);
        return "redirect:/";
    }

    @RequestMapping("/test")
    public String test() {
        return "board/boardList.html";
    }

}
