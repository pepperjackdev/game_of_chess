package me.pepperjackdev.game_of_chess.core.board.data.state.placement;

import me.pepperjackdev.game_of_chess.core.piece.Piece;
import me.pepperjackdev.game_of_chess.core.position.Position;

import java.util.Optional;

public interface Placement {
    Size getSize();
    Optional<Piece> getPiece(Position position);
}
