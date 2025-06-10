package me.pepperjackdev.game_of_chess.service.player.request;

import me.pepperjackdev.game_of_chess.service.Request;

public sealed abstract class PlayerRequest
    extends Request
    permits MovePlayerRequest {
}
