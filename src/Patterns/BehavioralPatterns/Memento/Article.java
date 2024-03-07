package Patterns.BehavioralPatterns.Memento;

public class Article {
    private String content;

    public Article(String content) {
        this.content = content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public ArticleMemento createMemento() {
        return new ArticleMemento(content);
    }

    public void restore(ArticleMemento memento) {
        this.content = memento.getContent();
    }
}

