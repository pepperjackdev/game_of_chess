package me.pepperjackdev.game_of_chess.core.state;

import me.pepperjackdev.game_of_chess.core.Side;
import me.pepperjackdev.game_of_chess.core.position.Position;
import me.pepperjackdev.game_of_chess.core.state.castling.CastlingRights;
import me.pepperjackdev.game_of_chess.core.state.placement.Placement;

public interface State {
    Placement getPiecePlacementData();
    Side getActiveColor();
    CastlingRights getCastlingRights();
    Position getEnPassantTargetSquare();
    int getHalfMoveClock();
    int getFullMoveClock();
}
