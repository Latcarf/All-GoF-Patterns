package Patterns.BehavioralPatterns.ChainOfResponsibility;

public class ContractHandler extends Handler {
    public ContractHandler(Handler next) {
        super(next);
    }

    @Override
    public void handleRequest(Document request) {
        if (request.getType().equals("Contract")) {
            System.out.println("Contract processing");
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}