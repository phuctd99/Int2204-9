public class Square extends Rectangle {
    public double side;
    public Square(String color, boolean filled) {
       super(color, filled);
    }
    public Square(double side){
        super(side,side);
    }
    public Square (double side, String color, boolean filled){
        super(side,side,color,filled);
    }
    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    public double getSide() {
        return side;
    }

    @Override
    public void setWidth(double side) {
        this.setSide(side);
    }
    @Override
    public void setLength(double side) {

        this.setSide(side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side= " + side +
                '}';
    }
}
