package Patterns.BehavioralPatterns.ChainOfResponsibility;

public class ReportHandler extends Handler {
    public ReportHandler(Handler next) {
        super(next);
    }

    @Override
    public void handleRequest(Document request) {
        if (request.getType().equals("Report")) {
            System.out.println("Processing the report");
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}