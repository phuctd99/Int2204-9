public class Rectangle extends Shape {
    private Point top_left;
    private int width = 20;
    private int height = 30;

    public Rectangle() {}

    public Rectangle(Point top_left, int width, int height) {
        super();
        this.top_left = top_left;
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, Point top_left, int width, int height) {
        super(color, filled);
        this.top_left = top_left;
        this.width = width;
        this.height = height;
    }

    public Point getTop_left() {
        return top_left;
    }

    public void setTop_left(Point top_left) {
        this.top_left = top_left;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    
    public int getArea() {
        return (width * height);
    }

    public int getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public void move(int x, int y) {
        top_left.setX(top_left.getX() + x);
        top_left.setY(top_left.getY() + y);
    }

    @Override
    public void getInfo() {
        System.out.println(getClass().getName() + " " + Integer.toHexString(hashCode()) + " " +
                getTop_left().getX() + " " + getTop_left().getY() + " " + width + " " + height +
                " " + getColor() + " " + String.valueOf(isFilled()));
    }
}
