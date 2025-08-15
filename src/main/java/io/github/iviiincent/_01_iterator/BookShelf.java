package io.github.iviiincent._01_iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class BookShelf implements Aggregate<Book> {

    private final ArrayList<Book> books;

    public BookShelf(int maxsize) {
        this.books = new ArrayList<>(maxsize);
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
