public abstract class Shape {

    protected String color;

    protected double x;
    protected double y;

    public Shape() {
    }

    public abstract void NhapThongTIn();
    public abstract Double getArea();
    public abstract Double getPerimeter();

    @Override
    public String toString() {
        return " color " + color + ", x = " + x + ", y = " + y ;
    }
}
