public class Book {
   private String name;
    private String author;
 private String year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    Book(String n, String a, String y){
        name=n;
        author=a;
        year=y;
    }
public void print(){
        System.out.println("name: "+name+" author: "+author+" year: "+year);
}
}
