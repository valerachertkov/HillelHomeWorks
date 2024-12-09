import java.util.ArrayList;
public class Library {
    ArrayList<Book> books = new ArrayList<Book>();

    public void addbook(Book b){
        books.add(b);
    }
    public void findName(String n){
        for (Book b:books) {
            if (b.getName().equals(n)){
                b.print();
            }
        }
    }
    public void findAuthor(String a){
        for (Book b:books) {
            if (b.getAuthor().equals(a)){
                b.print();
            }
        }
    }
    public void remove(Book b) {
        books.remove(b);
    }
    public int count(){
        return books.size();
    }
}
