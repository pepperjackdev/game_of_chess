package me.pepperjackdev.game_of_chess.service.game;

import me.pepperjackdev.game_of_chess.game.Game;
import me.pepperjackdev.game_of_chess.service.Service;
import me.pepperjackdev.game_of_chess.service.request.game.DataGameRequest;
import me.pepperjackdev.game_of_chess.service.request.game.GameRequest;
import me.pepperjackdev.game_of_chess.service.request.player.PlayerRequest;

import java.util.concurrent.BlockingQueue;

public class GameService
    extends Service<GameRequest, PlayerRequest> {

    private final Game game;

    public GameService(Game game,
                       BlockingQueue<GameRequest> inbox,
                       BlockingQueue<PlayerRequest> outbox) {
        super(inbox, outbox);
        this.game = game;
    }

    @Override
    protected void dispatchRequest(GameRequest request) {

    }
}
