public class Car {
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    String model;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    int year;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    String manufacturer;
     Car(String mo,int y,String ma){
         model=mo;
         year=y;
         manufacturer=ma;
         totalCarsProduced++;
     }
     public void print(){
         System.out.println("Model: "+model+" Year: "+year+" Manufacturer: "+manufacturer);
     }
     public static int totalCarsProduced=0;
}
