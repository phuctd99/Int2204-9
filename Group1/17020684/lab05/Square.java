
package lab5_1;


public class Square extends Rectangle {
    protected double side = 1.0;
    private String color;
    private boolean filled;
    private double width;
    private double length;
    public Square() {
    }
    public Square(double side) {
        this.side = side;
    }
    public Square(String color,boolean filled,double side) {
        this.color = color;
        this.filled = filled;
        this.side = side;
    }
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double size) {
        this.width = size;
    }

    public void setLength(double size) {
        this.length = size;
    }
    //toString
    @Override
    public String toString() {
        return "Square{" + "side=" + side + '}';
    }
    
    
}
