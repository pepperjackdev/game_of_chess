package me.pepperjackdev.game_of_chess.core.board;

import me.pepperjackdev.game_of_chess.core.board.data.MutableData;
import me.pepperjackdev.game_of_chess.core.position.move.Move;

public class Board {
    private final MutableData data;

    public Board(MutableData data) {
        this.data = data;
    }

    public void move(Move move) {

    }
}
