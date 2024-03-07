package Patterns.BehavioralPatterns.ChainOfResponsibility;

public class ApplicationHandler extends Handler {
    public ApplicationHandler(Handler next) {
        super(next);
    }

    @Override
    public void handleRequest(Document request) {
        if (request.getType().equals("Application")) {
            System.out.println("Application processing");
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}