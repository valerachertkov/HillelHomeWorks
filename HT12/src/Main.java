public class Main {
    public static void main(String[] args) {

        Book b1 =new Book("z","vana.r","2023");
        Book b2 =new Book("a","anton.f","2024");
        Book b3 =new Book("g","elena.t","2010");
        Library l=new Library();
        l.addbook(b1);
        l.addbook(b2);
        l.addbook(b3);
        System.out.println(l.count());
        l.findName("a");
        l.findAuthor("elena.t");
        //-------------------------------------------------------
        Account a1=new Account(1000000000);
        Account a2=new Account(-1.0);
        Account a3=new Account(3000.0);
        Bank b=new Bank();
        b.addaccount(a1);
        b.addaccount(a2);
        b.addaccount(a3);

        b.transtrfer(a1,a2,100);
        //-------------------------------------------------------
        Employee e1= new Employee("vasa",10000,"stolar");
        Employee e3= new Employee("vova",20000,"manager");
        Employee e2= new Employee("vasiliy ivanovich",100000,"direktor");
        Company c=new Company();
        c.addemployee(e1);
        c.addemployee(e2);
        c.addemployee(e3);
        System.out.println(c.totalsalary());
        System.out.println(c.averageSalary());
    }
}