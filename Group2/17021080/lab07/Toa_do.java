package Bai_tap;

public class Toa_do {
    protected double x = 0;
    protected double y = 0;

    public Toa_do(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void set( double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void print() {
        System.out.printf ( "(%.3f, %.3f)", x, y );
    }

}
