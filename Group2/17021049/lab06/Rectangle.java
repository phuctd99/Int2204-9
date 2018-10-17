package lab6;

public class Rectangle extends Shape {
    protected Point topLeft, botRight;

    //Ham khoi tao lop Rectangle

    public Rectangle() {
    }


    public Rectangle(Point topLeft, Point botRight) {
        super();
        this.topLeft = topLeft;
        this.botRight = botRight;
    }

    public Rectangle(String color, boolean filled, Point top_left, Point bot_right) {
        super(color, filled);
        this.topLeft = topLeft;
        this.botRight = botRight;
    }

    public Rectangle(Point topLeft, Point botRight, String color, boolean filled) {
    }


    public Point getTop_left() {
        return topLeft;
    }

    public void setTop_left(Point topLeft) {
        this.topLeft = topLeft;
    }

    public Point getBotRight() {
        return botRight;
    }

    public void setBot_right(Point botRight) {
        this.botRight = botRight;
    }

    public int getArea() {
        return (botRight.x - topLeft.x) * (botRight.y - topLeft.y);
    }

    public int getPerimeter() {
        return (botRight.x - topLeft.x) + (botRight.y - topLeft.y) * 2;
    }

    public void move(int x1, int y1) {
        topLeft.setX(topLeft.x + x1);
        topLeft.setY(topLeft.x + y1);
        botRight.setX(botRight.x + x1);
        botRight.setY(botRight.y + y1);
    }

}
