class Circle extends Shape {
    private final double Pi = 3.14;
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius){

        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius*radius*Pi;
    }

    public double getPerimeter() {
        return 2*radius*Pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Pi=" + Pi +
                ", radius=" + radius +
                '}';
    }
}