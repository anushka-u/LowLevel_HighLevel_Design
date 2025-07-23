package IteratorPattern.WithoutIP;

public class Client {
    public static void main(String[] args) {
        Book book = new Book("C++ book");
        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(book);
        bookCollection.addBook(new Book("JAva Book"));
        bookCollection.addBook(new Book("Python book"));

        /*
        Now what if somebody changes the Collection used in BookCollection, by that what will happen is
        the for loop below will break, because it does only work with ArrayList not with Set, and this will cause
        the problem we will have to change the implementation of client which we don't want so that is how the
        Iterator Pattern came in picture
         */
        for (int i=0;i<bookCollection.getBooks().size();i++)
        {
            System.out.println(bookCollection.getBooks().get(i).toString());
        }

    }
}
