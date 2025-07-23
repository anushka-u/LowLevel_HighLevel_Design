package IteratorPattern.WithIP;

import java.util.Iterator;
import java.util.List;

public class BookIterator implements Iterator<Book> {

    private List<Book> books;

    private int position = 0 ;

    public BookIterator(List<Book> book)
    {
        this.books =book;
    }
    @Override
    public boolean hasNext() {
        return position <  books.size();
    }

    @Override
    public Book next() {
        return books.get(position++);
    }
}
