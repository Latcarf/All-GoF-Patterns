package Patterns.BehavioralPatterns.Iterator;

/**
 * Iterator - allows you to sequentially iterate over elements of composite objects,
 * without revealing their internal representation.
 */

public class Main {
    public static void main(String[] args) {
        Book[] books = {new Book("Book 1"), new Book("Book 2"), new Book("Book 3")};
        BookCollection bookCollection = new BookCollection(books);
        Iterator<Book> iterator = bookCollection.createIterator();

        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book.getName());
        }
    }
}