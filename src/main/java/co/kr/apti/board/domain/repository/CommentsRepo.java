package co.kr.apti.board.domain.repository;


import co.kr.apti.board.domain.entity.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentsRepo extends JpaRepository<Comments, Long> {
}
