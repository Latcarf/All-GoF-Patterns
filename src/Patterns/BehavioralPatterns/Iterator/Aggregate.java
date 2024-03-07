package Patterns.BehavioralPatterns.Iterator;

public interface Aggregate {
    Iterator<Book> createIterator();
}
