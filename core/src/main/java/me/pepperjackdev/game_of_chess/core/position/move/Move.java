package me.pepperjackdev.game_of_chess.core.position.move;

import me.pepperjackdev.game_of_chess.core.Side;
import me.pepperjackdev.game_of_chess.core.piece.PieceType;

import java.time.LocalDateTime;
import java.util.Optional;

public class Move {
    private final Side author;
    private final LocalDateTime time;
    private final RawMove rawMove;
    private final PieceType promotion;

    public Move(Side author,
                RawMove rawMove,
                PieceType promotion) {
        this.author = author;
        this.time = LocalDateTime.now();
        this.rawMove = rawMove;
        this.promotion = promotion;
    }

    public Move(Side author,
                LocalDateTime time,
                RawMove rawMove) {
        this(author, rawMove, null);
    }

    public Side getAuthor() {
        return author;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public RawMove getRawMove() {
        return rawMove;
    }

    public Optional<PieceType> getPromotion() {
        return Optional.ofNullable(promotion);
    }
}