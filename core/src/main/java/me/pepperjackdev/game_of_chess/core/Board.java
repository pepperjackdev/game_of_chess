package me.pepperjackdev.game_of_chess.core;

import me.pepperjackdev.game_of_chess.core.state.MutableState;

public class Board {
    private final MutableState state;

    public Board(MutableState state) {
        this.state = state;
    }
}
