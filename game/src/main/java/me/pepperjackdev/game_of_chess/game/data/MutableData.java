package me.pepperjackdev.game_of_chess.game.data;

import me.pepperjackdev.game_of_chess.game.data.state.MutableState;

import java.util.Optional;

public class MutableData
    implements Data {

    private final MutableState state;
    private Result result;

    public MutableData(MutableState state) {
        this.state = state;
    }

    @Override
    public MutableState getState() {
        return state;
    }

    @Override
    public Optional<Result> getResult() {
        return Optional.ofNullable(result);
    }

    public void setResult(Result result) {
        this.result = result;
    }
}
