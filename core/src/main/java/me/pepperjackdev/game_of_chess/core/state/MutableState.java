package me.pepperjackdev.game_of_chess.core.state;

import me.pepperjackdev.game_of_chess.core.Side;
import me.pepperjackdev.game_of_chess.core.position.Position;
import me.pepperjackdev.game_of_chess.core.state.castling.MutableCastingRights;
import me.pepperjackdev.game_of_chess.core.state.placement.MutablePlacement;

public class MutableState
    implements State {

    private MutablePlacement piecePlacementData;
    private Side activeColor;
    private MutableCastingRights castlingRights;
    private Position enPassantTargetSquare;
    private int halfMoveClock;
    private int fullMoveClock;

    @Override
    public MutablePlacement getPiecePlacementData() {
        return piecePlacementData;
    }

    @Override
    public Side getActiveColor() {
        return activeColor;
    }

    public void setActiveColor(Side activeColor) {
        this.activeColor = activeColor;
    }

    @Override
    public MutableCastingRights getCastlingRights() {
        return castlingRights;
    }

    @Override
    public Position getEnPassantTargetSquare() {
        return enPassantTargetSquare;
    }

    public void setEnPassantTargetSquare(Position enPassantTargetSquare) {
        this.enPassantTargetSquare = enPassantTargetSquare;
    }

    @Override
    public int getHalfMoveClock() {
        return halfMoveClock;
    }

    public void setHalfMoveClock(int halfMoveClock) {
        this.halfMoveClock = halfMoveClock;
    }

    @Override
    public int getFullMoveClock() {
        return fullMoveClock;
    }

    public void setFullMoveClock(int fullMoveClock) {
        this.fullMoveClock = fullMoveClock;
    }
}
