public class Triangle implements iFigure{
    double a;
    double h;

    @Override
    public double getSquare() {
        return 0.5*h*a;
    }

    public double getA() {
        return a;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public Triangle(double a,double h) {
        this.a = a;this.h = h;
    }

    public void setA(double a) {
        this.a = a;
    }
}
