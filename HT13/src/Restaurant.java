import java.util.ArrayList;

public class Restaurant {
    static ArrayList<Dish> dishes=new ArrayList<Dish>();
    public void addDish(Dish d){
        dishes.add(d);
    }
    public static void printMenu(){
        for (Dish d :dishes){
            d.displayInfo();
        }
    }
    public static int getTotalDishes(){
        return dishes.size();
    }
}
