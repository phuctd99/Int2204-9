package Shape;


public class Circle extends Shape {
    public double r;
    private final double  Pi= 3.14;
    public Circle() {
        super();
        this.r = 1.0;
    }

    public Circle(double r) {
        super();
        this.r = r;
    }

    public Circle(String color, boolean filled, double r) {
        super(color, filled);
        this.r = r;
    }

    public void setR(double r) {
        this.r = r;
    };

    public double getR() {
        return r;
    }
    public double getArea(){
        return r*r*Pi;
    }
    public double getPerimeter(){
        return 2*r*Pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}' + super.toString();

    }

    public static void main(String[] args) {
        Circle p = new Circle();
        System.out.print(p.toString());
    }
}
