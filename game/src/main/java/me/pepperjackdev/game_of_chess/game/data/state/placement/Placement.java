package me.pepperjackdev.game_of_chess.game.data.state.placement;

import me.pepperjackdev.game_of_chess.game.piece.Piece;
import me.pepperjackdev.game_of_chess.game.position.Position;

import java.util.Optional;

public interface Placement {
    Size getSize();
    Optional<Piece> getPiece(Position position);
}
