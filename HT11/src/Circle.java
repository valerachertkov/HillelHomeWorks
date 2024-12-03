public class Circle {
    double radius;
    public static final double PI = 3.14159265358979323846;
    Circle(double r){
        radius= r;
    }
    public double calculateArea(){
        return PI*radius*radius;
    }
    public double calculateCircumference(){
        return PI*2*radius*radius;
    }
}
