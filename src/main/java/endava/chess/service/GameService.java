package endava.chess.service;

import endava.chess.model.Game;

import java.util.List;

public interface GameService {
    Game getGameById(Long id);

    List<Game> getAllGamesByUser(Long userId);

    Game createGame(Game game);

    Game updateGameStatus(String newStatus, Long id);
}
