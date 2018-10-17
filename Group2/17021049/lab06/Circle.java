package lab6;

public class Circle extends Shape {
    protected final double PI = 3.14;
    protected Point pO;
    protected double r;

    public Circle(){
    }

    public Circle(Point pO, double r){
        this.pO = pO;
        this.r = r;
    }

    public Circle(Point pO, double r, String color, boolean filled){
        super();
        this.pO = pO;
        this.r = r;
    }

    public void setpO(Point pO) {
        this.pO = pO;
    }

    public Point getpO() {
        return pO;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public double getArea(){
        return PI*r*r;
    }
    public double getPerimeter(){
        return 2*PI*r;
    }

    public void move(int x1, int y1) {
        pO.setX(this.pO.x + x1);
        pO.setY(this.pO.y + y1);
    }

}
