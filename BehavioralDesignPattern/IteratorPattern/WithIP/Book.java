package IteratorPattern.WithIP;

public class Book implements Comparable<Book>{

    private String title;

    public Book(String title){
        this.title =title;
    }

    public String getTitle(){
        return title;
    }
    public String toString(){
        return "Book title is " + title;
    }

    @Override
    public int compareTo(Book o) {
        return this.title.compareTo(o.title);
    }
}
