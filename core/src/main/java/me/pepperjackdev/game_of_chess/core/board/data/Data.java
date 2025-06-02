package me.pepperjackdev.game_of_chess.core.board.data;

import me.pepperjackdev.game_of_chess.core.board.Result;
import me.pepperjackdev.game_of_chess.core.board.data.state.State;

import java.util.Optional;

public interface Data {
    State getState();
    Optional<Result> getResult();
}
