package Patterns.BehavioralPatterns.Memento;

/**
 * Memento - allows you to save and restore the previous state of an object without revealing the details of its implementation.
 * This is especially useful for implementing undo or change logging functions for an object.
 * The pattern consists of three main components: Originator, Caretaker, and Memento.
 */

public class Main {
    public static void main(String[] args) {
        Article article = new Article("Initial Content");
        Caretaker caretaker = new Caretaker();

        caretaker.save(article);

        article.setContent("Updated Content");
        System.out.println("Current Content: " + article.getContent());

        caretaker.undo(article);
        System.out.println("Content after undo: " + article.getContent());
    }
}