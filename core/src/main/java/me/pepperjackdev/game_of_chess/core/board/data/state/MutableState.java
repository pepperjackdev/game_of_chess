package me.pepperjackdev.game_of_chess.core.board.data.state;

import me.pepperjackdev.game_of_chess.core.Side;
import me.pepperjackdev.game_of_chess.core.position.Position;
import me.pepperjackdev.game_of_chess.core.board.data.state.castling.MutableCastingRights;
import me.pepperjackdev.game_of_chess.core.board.data.state.placement.MutablePlacement;

public class MutableState
    implements State {

    private final MutablePlacement piecePlacementData;
    private Side activeColor;
    private final MutableCastingRights castlingRights;
    private Position enPassantTargetSquare;
    private int halfMoveClock;
    private int fullMoveClock;

    public MutableState(MutablePlacement piecePlacementData,
                        Side activeColor,
                        MutableCastingRights castlingRights,
                        Position enPassantTargetSquare,
                        int halfMoveClock,
                        int fullMoveClock) {
        this.piecePlacementData = piecePlacementData;
        this.activeColor = activeColor;
        this.castlingRights = castlingRights;
        this.enPassantTargetSquare = enPassantTargetSquare;
        this.halfMoveClock = halfMoveClock;
        this.fullMoveClock = fullMoveClock;
    }

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
