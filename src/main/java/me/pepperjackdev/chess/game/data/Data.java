package me.pepperjackdev.chess.game.data;

import me.pepperjackdev.chess.game.data.state.State;

import java.util.Optional;

public interface Data {
    State getState();
    Optional<Result> getResult();
}
