package Patterns.BehavioralPatterns.ChainOfResponsibility;

public class Document {
    private String type;

    public Document(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
