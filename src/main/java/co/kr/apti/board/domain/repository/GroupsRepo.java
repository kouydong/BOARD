package co.kr.apti.board.domain.repository;


import co.kr.apti.board.domain.entity.Groups;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupsRepo extends JpaRepository<Groups, Long> {
}
