package Patterns.BehavioralPatterns.ChainOfResponsibility;

/**
 * Chain of Responsibility - allows requests to be passed along a chain of handlers.
 * Each subsequent handler decides whether it can handle the request
 * or whether it should be passed further down the chain. This pattern is often used to
 * handle different types of requests in different ways, without tying the sender of the request to a specific recipient.
 */

public class Main {
    public static void main(String[] args) {
        Handler chain = new ReportHandler(
                        new ApplicationHandler(
                        new ContractHandler(null)));

        Document report = new Document("Report");
        Document application = new Document("Application");
        Document contract = new Document("Contract");

        chain.handleRequest(report);
        chain.handleRequest(application);
        chain.handleRequest(contract);
    }
}