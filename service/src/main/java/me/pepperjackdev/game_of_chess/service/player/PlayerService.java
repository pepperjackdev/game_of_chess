package me.pepperjackdev.game_of_chess.service.player;

import me.pepperjackdev.game_of_chess.player.Player;
import me.pepperjackdev.game_of_chess.service.Service;
import me.pepperjackdev.game_of_chess.service.request.game.GameRequest;
import me.pepperjackdev.game_of_chess.service.request.player.PlayerRequest;

import java.util.concurrent.BlockingQueue;

public final class PlayerService
    extends Service<PlayerRequest, GameRequest> {

    private final Player player;

    public PlayerService(Player player,
                         BlockingQueue<PlayerRequest> inbox,
                         BlockingQueue<GameRequest> outbox) {
        super(inbox, outbox);
        this.player = player;
    }

    @Override
    protected void dispatchRequest(PlayerRequest request) {

    }
}
