public class Circle implements iFigure {
    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        this.radius = r;
    }
Circle(double r)
{
    this.radius = r;
}    private double radius;
    @Override
    public double getSquare() {
        return 3.1415*radius*radius;
    }
}
