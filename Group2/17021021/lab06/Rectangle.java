public class Rectangle extends Shape {
    private int width;
    private int height;

    //constructor
    public Rectangle() {
        width = 1;
        height = 1;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(int width, int height, int x, int y, String color) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", posi=(" + posiX + "," + posiY + ")" +
                ", color='" + color + '\'' +
                '}';
    }
}
