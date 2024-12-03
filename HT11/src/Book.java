public class Book {
    String title;
    String author;
    double price;
    Book(String t, String a, double p ) {
        title= t;
        author=a;
        price=p;
        }
        public void applyDiscount(int p) {
        price=price*(100-p)/100;
        }
        public void printInfo() {
            System.out.println("title: " + title + " author: " + author + " price: " + price + "$");
        }
}