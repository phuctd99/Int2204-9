public abstract class Shape {
    protected String color = "blue";
    protected double x;
    protected double y;
    public Shape() {
    }
    // dung de nhap thong tin vao
    public abstract void Nhap();
    public abstract double getArea();
    public abstract double getPerimeter();
    @Override
    public String toString() {
        return " color: " + color + ", x = " + x + ", y = " + y ;
    }
}