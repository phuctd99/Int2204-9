public class Square extends Rectangle {
    public double side = 1;


    //cac phuong thuc khoi tao
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side);
        this.color = color;
        this.filled = filled;

    }

    //ham get set
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
        super.setLength(side);
        super.setWidth(side);
    }

    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }


    public String toString() {
        return super.toString() + " " + side;
    }
}
