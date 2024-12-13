public class Main {
    public static void main(String[] args) {
       Dish d1=new Dish();
       d1.setName("pizza");
       d1.setPrice(10.99);
       d1.setCategory("main");
        Dish d2=new Dish();
        d2.setName("soup");
        d2.setPrice(100.99);
        d2.setCategory("main");
        Dish d3=new Dish();
        d3.setName("ice cram");
        d3.setPrice(2.99);
        d3.setCategory("desart");
        Restaurant r = new Restaurant();
        r.addDish(d1);
        r.addDish(d2);
        r.addDish(d3);
        System.out.println("----------");
        System.out.println(r.getTotalDishes() );
        r.printMenu();
        Car c1=new Car("n",2022,"BMV");
        Car c2=new Car("t-800",2054,"sky net");
        Car c3=new Car("f",2024,"tesla");
        c1.print();
        c2.print();
        c3.print();
        System.out.println(c1.totalCarsProduced);
    }
}