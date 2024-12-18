public class Rect implements iFigure{
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    private double a;

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public Rect(double a,double b) {
        this.a = a;
        this.b = b;
    }

    private double b;

    @Override
    public double getSquare() {
        return a*b;
    }
}
