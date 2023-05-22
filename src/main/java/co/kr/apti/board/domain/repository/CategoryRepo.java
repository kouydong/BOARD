package co.kr.apti.board.domain.repository;


import co.kr.apti.board.domain.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Long> {
}
