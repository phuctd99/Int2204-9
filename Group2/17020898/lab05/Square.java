package Shape;

public class Square extends Retangle{
    public Square(){
        super();
    }
    public Square(double side) {
        super(side, side);
    }

    public Square(double width, double length) {
        super(width, length);
    }

    public Square(String color, boolean filled, double width, double length) {
        super(color, filled, width, length);
    }
    public void setSide( double side){
        this.length = side;
        this.width = side;
    }
    public void setWidth(double side){
         this.setSide(side);
    }
    public void setLength(double side){
        this.setSide(side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled + getArea() + " "+ getPerimeter()+
                '}';
    }

    public static void main(String[] args) {
        Square q = new Square();
        q.setSide(10);
        q.setLength(10);
        q.setWidth(10);
        System.out.print(q.toString());
    }
}
