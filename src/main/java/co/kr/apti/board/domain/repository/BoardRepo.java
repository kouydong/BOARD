package co.kr.apti.board.domain.repository;

import co.kr.apti.board.domain.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepo extends JpaRepository<Board, Long> {
}
