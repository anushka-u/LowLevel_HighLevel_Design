package IteratorPattern.WithIP;


import java.util.Iterator;
/*
Now when we want to change the collection inside the BookCollection we won't need to change client Code
we will be changing the collection and methods in BookIterator internally.

The Iterator pattern provides a way to traverse a collection without revealing its underlyimg structure,
offerring a uniforn interface for traversal
 */
public class Client {
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(new Book("C++ Book"));
        bookCollection.addBook(new Book("Python book"));
        bookCollection.addBook(new Book("Java book"));


        //I want to iterate over book collection using iterator
        Iterator<Book> iterator = bookCollection.createIterator();
        while (iterator.hasNext())
        {
            Book book = iterator.next();
            System.out.println(book);
        }

        BookCollectionV2 books =  new BookCollectionV2();
        books.addBook(new Book("C++ Book"));
        books.addBook(new Book("Java book"));
        books.addBook(new Book("Python book"));

        Iterator<Book> itr = books.iterator();
        while (itr.hasNext()){
            Book book = itr.next();
            System.out.println(book);
        }
    }
}
