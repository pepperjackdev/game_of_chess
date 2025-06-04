package me.pepperjackdev.game_of_chess.core;

import me.pepperjackdev.game_of_chess.core.action.Action;
import me.pepperjackdev.game_of_chess.core.action.DrawAction;
import me.pepperjackdev.game_of_chess.core.data.Data;
import me.pepperjackdev.game_of_chess.core.data.MutableData;
import me.pepperjackdev.game_of_chess.core.action.MoveAction;
import me.pepperjackdev.game_of_chess.core.data.Result;

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

    public void action(Action action) {
        if (isOngoing()) {
            switch (action) {
                case MoveAction moveAction -> move(moveAction);
                case DrawAction _ -> draw();
            }
        }
    }

    private void move(MoveAction moveAction) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void draw() {
        data.setResult(Result.DRAW);
    }
}
