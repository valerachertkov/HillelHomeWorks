public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        FictionBook fictionBook1 = new FictionBook("The Hobbit", "J.R.R. Tolkien", 1937, "12345", true, "Fantasy");
        EducationalBook educationalBook1 = new EducationalBook("Advanced Math", "John Doe", 2020, "67890", true, "Mathematics", "University");

        library.addBook(fictionBook1);
        library.addBook(educationalBook1);

        Reader reader1 = new Reader("Alice", 1);

        library.registerReader(reader1);
        System.out.println("          ");
        library.borrowBook(reader1, fictionBook1);
        System.out.println("----------");
        library.printAllBooksInfo();
        System.out.println("----------");
        library.searchByGenre("Fantasy");
        System.out.println("----------");
        library.searchBySubject("Mathematics");
        System.out.println("----------");
        library.returnBook(reader1, fictionBook1);
        System.out.println("----------");
        reader1.printBorrowedBooks();
    }
}