package me.pepperjackdev.chess.game.data.state.castling;

public interface CastlingRights {
    boolean canWhiteCastleKingSide();
    boolean canWhiteCastleQueenSide();
    boolean canBlackCastleKingSide();
    boolean canBlackCastleQueenSide();
}
