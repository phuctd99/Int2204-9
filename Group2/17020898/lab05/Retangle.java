package Shape;

public class Retangle extends Shape{
    protected   double width;
    protected double length;
    public Retangle(){
        super();
        this.width = 1.0;
        this.length = 1.0;
    }
    public Retangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Retangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }
    public double getArea(){
        return width * length;
    }
    public double getPerimeter(){
        return 2*(width + length);
    }

    @Override
    public String toString() {
        return "Retangle{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled + "Area = " + getArea() + ", Perimeter = "+ getPerimeter()+
                '}';
    }

}
