package me.pepperjackdev.game_of_chess.core.board.data.state.castling;

public interface CastlingRights {
    boolean canWhiteCastleKingSide();
    boolean canWhiteCastleQueenSide();
    boolean canBlackCastleKingSide();
    boolean canBlackCastleQueenSide();
}
