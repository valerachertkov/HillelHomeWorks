import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    String groupNumber;
    double averageGrade;
    List<Book>books=new ArrayList<Book>();
    Student(String n,String g){
       name=n;
       groupNumber=g;

    }
    public void addBook(Book b){
        books.add(b);
    }
    public void updateGrade(double da){
        averageGrade=da;
    }
    public void printInfo(){
        System.out.println("name"+name);
        System.out.println("groupNumber"+groupNumber);
        System.out.println("averageGrade"+averageGrade);
        for(Book b : books)
            b.printInfo();
    }
}
