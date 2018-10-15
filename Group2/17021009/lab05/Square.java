package Cau2;

public class Square extends Rectangle {

    //
    public Square( String color, boolean filled,  double side) {
        super( side, side, color, filled);
    }

    //
    public double getSide() {
        return this.getLength();
    }

    public void setSide(double side) {
        super.setLength( side );
        super.setWidth( side );
    }

    //
    public void setLength( double side) {
        super.setLength( side );
        super.setWidth( side );
    }

    //
    public void setWidth( double side) {
        super.setWidth( side );
        super.setLength( side );
    }

    //
    public String toString() {
        return "HV cạnh " + this.getSide() + " có chu vi " + this.getPerimeter() + ", diện tích " + this.getArea();
    }
}
