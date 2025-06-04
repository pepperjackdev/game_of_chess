package me.pepperjackdev.game_of_chess.core.data;

import me.pepperjackdev.game_of_chess.core.data.state.State;

import java.util.Optional;

public interface Data {
    State getState();
    Optional<Result> getResult();
}
