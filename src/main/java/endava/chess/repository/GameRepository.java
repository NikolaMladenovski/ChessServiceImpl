package endava.chess.repository;

import endava.chess.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRepository extends JpaRepository<Game,Long> {
    List<Game> findAllByPlayerOneIdOrPlayerTwoId(Long playerOne_id, Long playerTwo_id);
}
