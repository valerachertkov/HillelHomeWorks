import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> books;
    private List<Reader> readers;

    public Library() {
        this.books = new ArrayList<>();
        this.readers = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void registerReader(Reader reader) {
        readers.add(reader);
    }

    public void borrowBook(Reader reader, Book book) {
        if (book.isAvailable) {
            reader.borrowBook(book);
            book.changeAvailability(false);
            System.out.println(reader.getName() + " has borrowed the book: " + book.title);
        } else {
            System.out.println("The book " + book.title + " is not available for borrowing.");
        }
    }

    public void returnBook(Reader reader, Book book) {
        reader.returnBook(book);
        book.changeAvailability(true);
        System.out.println(reader.getName() + " has returned the book: " + book.title);
    }

    public void printAllBooksInfo() {
        System.out.println("All books in the library:");
        for (Book book : books) {
            book.getInfo();
        }
    }

    public void searchByGenre(String genre) {
        System.out.println("Books in genre " + genre + ":");
        for (Book book : books) {
            if (book instanceof FictionBook && ((FictionBook) book).getGenre().equals(genre)) {
                book.getInfo();
            }
        }
    }

    public void searchBySubject(String subject) {
        System.out.println("Books on subject " + subject + ":");
        for (Book book : books) {
            if (book instanceof EducationalBook && ((EducationalBook) book).getSubject().equals(subject)) {
                book.getInfo();
            }
        }
    }
}

