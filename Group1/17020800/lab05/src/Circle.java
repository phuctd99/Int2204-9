/**
 * nên dùng final cho biến PI vì khai báo PI là hằng số
 */
public class Circle extends Shape {

    static final double PI = 3.14;

    private Double radius = 1.0;

    public Circle(Double radius){
        this.radius = radius;
    }

    public Circle(Double radius, String color, boolean filled){
        this.radius = radius;
        this.setColor(color);
        this.setFilled(filled);
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double getArea(){
        return Math.pow(this.radius, 2) * PI;
    }
    public Double getPerimeter() {
        return this.radius * 2* PI;
    }
    @Override
    public String toString(){
        return this.getRadius() + "\n" + this.getPerimeter() + "\n" + this.getArea();
    }

    public static void main(String[] args) {
        Circle h1 = new Circle(3.0);
        System.out.println(h1.toString());
    }
}
