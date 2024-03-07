package Patterns.BehavioralPatterns.Memento;

import java.util.Stack;

public class Caretaker {
    private Stack<ArticleMemento> mementos = new Stack<>();

    public void save(Article article) {
        mementos.push(article.createMemento());
    }

    public void undo(Article article) {
        if (!mementos.isEmpty()) {
            article.restore(mementos.pop());
        }
    }
}
