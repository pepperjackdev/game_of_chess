package me.pepperjackdev.chess.game;

import me.pepperjackdev.chess.game.data.Data;
import me.pepperjackdev.chess.game.data.MutableData;

public class Game {
    private final MutableData data;

    public Game(MutableData data) {
        this.data = data;
    }

    public Data getData() {
        return data;
    }

    public boolean isOngoing() {
        return data.getResult().isPresent();
    }

    public boolean isFinished() {
        return !isOngoing();
    }
}
