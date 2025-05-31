package me.pepperjackdev.game_of_chess.core.state.castling;

public interface CastlingRights {
    boolean canWhiteCastleKingSide();
    boolean canWhiteCastleQueenSide();
    boolean canBlackCastleKingSide();
    boolean canBlackCastleQueenSide();
}
