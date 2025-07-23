package IteratorPattern.WithIP;

import java.util.*;

public class BookCollectionV2 implements Iterable<Book> {
    public Set<Book> books = new TreeSet<>();

    public void addBook(Book book){
        books.add(book);
    }

//    public Set<Book> getBooks(){
//        return books;
//    }


    @Override
    public Iterator<Book> iterator() {
        return books.iterator();
    }
}
