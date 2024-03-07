package Patterns.BehavioralPatterns.ChainOfResponsibility;

public abstract class Handler {
    protected Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public abstract void handleRequest(Document request);
}
