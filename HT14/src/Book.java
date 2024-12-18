import java.util.ArrayList;
import java.util.List;

class Book {
    protected String title;
    protected String author;
    protected int year;
    protected String isbn;
    protected boolean isAvailable;

    public Book(String title, String author, int year, String isbn, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
        this.isAvailable = isAvailable;
    }

    public void getInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", Year: " + year + ", ISBN: " + isbn);
    }

    public void changeAvailability(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}

