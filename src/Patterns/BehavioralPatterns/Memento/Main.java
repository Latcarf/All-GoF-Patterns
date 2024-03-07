package Patterns.BehavioralPatterns.Memento;

/**
 * Memento - позволяет сохранять и восстанавливать предыдущее состояние объекта без раскрытия деталей его реализации.
 * Это особенно полезно для реализации функций отмены операций или ведения журнала изменений объекта.
 * Паттерн состоит из трех основных компонентов: Создателя (Originator), Хранителя (Caretaker) и Снимка (Memento).
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