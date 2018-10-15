import java.sql.SQLOutput;

public class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
        color = "red";
        filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    public static void main(String[] args) {
        Circle c = new Circle("red", true);
        c.setRadius(3.0);
        System.out.println(c.toString());
        System.out.print("Dien tich hinh tron la :");
        System.out.println(c.getArea());
        System.out.print("Chu vi hinh tron la :");
        System.out.println(c.getPerimeter());
        Rectangle r = new Rectangle(20.0,20.0,"red", true);
        System.out.println(r.toString());
        System.out.print("Dien tich HCN la : ");
        System.out.println(r.getArea());
        System.out.print("Chu vi HCN la: ");
        System.out.println(r.getPerimeter());
        Square sq = new Square("blue",true);
        System.out.println(sq.toString());
        sq.setSide(5.0);
        System.out.print("Dien tich hinh vuong la : ");
        System.out.println(sq.getArea());
        System.out.print("Chu vi hinh vuong la: ");
        System.out.println(sq.getPerimeter());




    }
}
