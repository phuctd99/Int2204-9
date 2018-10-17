public class Square extends Shape {

    private double side;

    public Square(String address, double size, boolean movable, boolean filled, double side) {
        super(address, size, movable, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
