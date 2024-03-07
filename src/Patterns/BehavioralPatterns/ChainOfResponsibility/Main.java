package Patterns.BehavioralPatterns.ChainOfResponsibility;

/**
 * Chain of Responsibility - позволяет передавать запросы вдоль цепочки обработчиков.
 * При этом каждый последующий обработчик решает, может ли он обработать запрос
 * или его следует передать дальше по цепочке. Этот паттерн часто используется для
 * обработки различных типов запросов разными способами, не привязывая отправителя запроса к конкретному получателю.
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