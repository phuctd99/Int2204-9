public class Triangle extends Shape {
    private int side1;
    private int side2;
    private int side3;
    public  Triangle(){
        side1 = 1;
        side2 = 2;
        side3 = 3;
    }

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(int x, int y, String color, boolean isMove, int side1, int side2, int side3) {
        super(x, y, color, isMove);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }
}

