package me.pepperjackdev.chess.game.data.state;

import me.pepperjackdev.chess.game.Side;
import me.pepperjackdev.chess.game.position.Position;
import me.pepperjackdev.chess.game.data.state.castling.CastlingRights;
import me.pepperjackdev.chess.game.data.state.placement.Placement;

public interface State {
    Placement getPiecePlacementData();
    Side getActiveColor();
    CastlingRights getCastlingRights();
    Position getEnPassantTargetSquare();
    int getHalfMoveClock();
    int getFullMoveClock();
}
