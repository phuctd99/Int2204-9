package Tuan7;

public class circle extends shape {
    private point center; //trung điểm của hình tròn
    private int radius ; //bán kính
    private final double PI = 3.14; //số pi

    //các phương thức khởi tạo
    public  circle() {}
    public circle(point center, int radius) {
        super();
        this.center = center;
        this.radius = radius;
    }
    public circle(String color, boolean filled, point center, int radius, boolean visible) {
        super(color, filled, visible);
        this.center = center;
        this.radius = radius;
    }

    //các phương thức get/set
    public point getCenter() {
        return center;
    }
    public void setCenter(point center) {
        this.center = center;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double getArea() {
        return PI * radius * radius;
    }
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    //di chuyển
    public void move(int x, int y) {
        center.setX(this.center.getX() + x);
        center.setY(this.center.getY() + y);
    }
}

