package Patterns.BehavioralPatterns.Iterator;

public class BookIterator implements Iterator<Book> {
    private BookCollection bookCollection;
    private int index;

    public BookIterator(BookCollection bookCollection) {
        this.bookCollection = bookCollection;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < bookCollection.getLength();
    }

    @Override
    public Book next() {
        Book book = bookCollection.getBookAt(index);
        index++;
        return book;
    }
}
