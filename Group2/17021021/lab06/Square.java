public class Square extends Shape {
    private int side;

    //constructor
    public Square() {
        side = 1;
    }

    public Square(int side) {
        this.side = side;
    }

    public Square(int side, int x, int y, String color) {
        super(x, y, color);
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", posi=(" + posiX + "," + posiY + ")" +
                ", color='" + color + '\'' +
                '}';
    }
}
