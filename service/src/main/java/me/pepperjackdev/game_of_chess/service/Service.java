package me.pepperjackdev.game_of_chess.service;

import me.pepperjackdev.game_of_chess.service.request.Request;

import java.util.Optional;
import java.util.concurrent.BlockingQueue;

public abstract class Service<InputRequest extends Request, OutputRequest extends  Request> {
    private final BlockingQueue<InputRequest> inboxes;
    private final BlockingQueue<OutputRequest> outboxes;

    public Service(BlockingQueue<InputRequest> inboxes,
                   BlockingQueue<OutputRequest> outboxes) {
        this.inboxes = inboxes;
        this.outboxes = outboxes;
    }

    protected Optional<InputRequest> pollRequest() {
        return Optional.ofNullable(inboxes.poll());
    }

    protected void offerRequest(OutputRequest request) {
        var _ = outboxes.offer(request);
    }

    protected abstract void dispatchRequest(InputRequest request);
}
