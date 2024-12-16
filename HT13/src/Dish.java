public class Dish {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    double price;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    String category;
    public void displayInfo(){
        System.out.println("Назва: "+name+" Ціна: "+price +" Категорія: "+category);
    }
}
