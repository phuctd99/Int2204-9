package test05;
import java.math.*;

class Square extends Rectangle{
    protected double side;
    protected double Ax;
    protected double Ay;
    protected double Bx;
    protected double By;

    public double getAx() {
        return Ax;
    }

    public void setAx(double ax) {
        Ax = ax;
    }

    public double getAy() {
        return Ay;
    }

    public void setAy(double ay) {
        Ay = ay;
    }

    public double getBx() {
        return Bx;
    }

    public void setBx(double bx) {
        Bx = bx;
    }

    public double getBy() {
        return By;
    }

    public void setBy(double by) {
        By = by;
    }

    public double getSide() {
        return side;
    }

    public void setSide() {
        this.side = Math.sqrt((Ax - Bx)*(Ax - Bx) + (Ay - By)*(Ay - By));
    }

    public Square(){  //kb không khởi tạo
        this.area = 0;
        this.side = 0;
        this.width = 0;
        this.perimeter = 0;
        this.filled = true;
        this.color = "red";
        this.Ax = 0;
        this.Bx = 0;
        this.Ay = 0;
        this.By = 0;
    }

    public Square(double side, String color, boolean filled,
                  double perimeter, double area, double ax, double bx, double ay, double by) { //kb tương tự
        this.area = area;
        this.side = side;
        this.perimeter = perimeter;
        this.filled = filled;
        this.color = color;
        this.Ax = 0;
        this.Bx = 0;
        this.Ay = 0;
        this.By = 0;
    }

    public void cvde(Square s){// chu vi diện tích
        s.setPerimeter(s.getSide() * s.getSide());
        s.setArea(s.getSide()* 4);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", color='" + color  +
                ", width=" + width +
                ", Ax=" + Ax +
                ", Bx=" + Bx +
                ", Ay=" + Ay +
                ", By=" + Ay +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
