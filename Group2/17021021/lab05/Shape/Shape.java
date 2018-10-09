package Shape;

public class Shape {
    protected String color = "red";
    protected boolean filled = true;

    //constructor
    public Shape() {
        color = "red";
        filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }


    //getter
    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }


    //setter
    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(new Shape());
        System.out.println(new Circle());
        System.out.println(new Rectangle());
        System.out.println(new Square(14, "blue", false));
    }
}
