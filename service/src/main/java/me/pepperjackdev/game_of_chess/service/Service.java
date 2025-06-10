package me.pepperjackdev.game_of_chess.service;

import java.util.Optional;
import java.util.concurrent.BlockingQueue;

public abstract class Service<IngoingRequest extends Request, OutgoingRequest extends Request> {
    private final BlockingQueue<IngoingRequest> inboxes;
    private final BlockingQueue<OutgoingRequest> outboxes;

    public Service(BlockingQueue<IngoingRequest> inboxes,
                   BlockingQueue<OutgoingRequest> outboxes) {
        this.inboxes = inboxes;
        this.outboxes = outboxes;
    }

    protected Optional<IngoingRequest> pollRequest() {
        return Optional.ofNullable(inboxes.poll());
    }

    protected void offerRequest(OutgoingRequest request) {
        var _ = outboxes.offer(request);
    }

    protected abstract void dispatchRequest(IngoingRequest request);
}
