public class Square extends Shape{
    private int side;
    public Square(){
        side = 1;
    }

    public Square(int side) {
        this.side = side;
    }

    public Square(int x, int y, String color, boolean isMove, int side) {
        super(x, y, color, isMove);
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }
}
