public class Circle extends Shape{
    private double r;
    Circle(){
        r = 1;
    }

    public Circle(double r) {
        this.r = r;
    }

    public Circle(int x, int y, String color, boolean isMove, double r) {
        super(x, y, color, isMove);
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }
}
