import java.util.ArrayList;
import java.util.List;

class Reader {
    private String name;
    private int id;
    private List<Book> borrowedBooks;


    public Reader(String name, int id) {
        this.name = name;
        this.id = id;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    public void printBorrowedBooks() {
        System.out.println("Books borrowed by " + name + ":");
        for (Book book : borrowedBooks) {
            book.getInfo();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(boolean name) {
        this.name = String.valueOf(name);
    }
}
