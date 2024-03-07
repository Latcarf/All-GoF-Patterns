package Patterns.BehavioralPatterns.Iterator;

public class BookCollection implements Aggregate {
    private Book[] books;

    public BookCollection(Book[] books) {
        this.books = books;
    }

    @Override
    public Iterator<Book> createIterator() {
        return new BookIterator(this);
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public int getLength() {
        return books.length;
    }
}
