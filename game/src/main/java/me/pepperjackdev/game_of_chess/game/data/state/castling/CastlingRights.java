package me.pepperjackdev.game_of_chess.game.data.state.castling;

public interface CastlingRights {
    boolean canWhiteCastleKingSide();
    boolean canWhiteCastleQueenSide();
    boolean canBlackCastleKingSide();
    boolean canBlackCastleQueenSide();
}
