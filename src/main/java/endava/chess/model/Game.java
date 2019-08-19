package endava.chess.model;

import lombok.Data;

@Data
public class Game {
    private User playerOne;
    private User playerTwo;
    private String status;
}
