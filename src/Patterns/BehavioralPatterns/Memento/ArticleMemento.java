package Patterns.BehavioralPatterns.Memento;

public class ArticleMemento {
    private final String content;

    public ArticleMemento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
