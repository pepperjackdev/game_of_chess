package me.pepperjackdev.chess.game.data.state.placement;

import me.pepperjackdev.chess.game.piece.Piece;
import me.pepperjackdev.chess.game.position.Position;

import java.util.Optional;

public interface Placement {
    Size getSize();
    Optional<Piece> getPiece(Position position);
}
