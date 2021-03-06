package bttuan7;

public class Rectangle extends Shape {
    private Point top_left;
    private Point top_right;
    private Point bot_left;
    private Point bot_right;

    public Rectangle() {}

    public Rectangle(Point top_left, Point top_right, Point bot_left, Point bot_right) {
        super();
        this.top_left = top_left;
        this.bot_right = top_right;
        this.bot_left = bot_left;
        this.bot_right = bot_right;
    }

    public Rectangle(String color, boolean filled, Point top_left, Point bot_right) {
        super(color, filled);
        this.top_left = top_left;
        this.bot_right = bot_right;
    }

    public Point getTop_left() {
        return top_left;
    }

    public void setTop_left(Point top_left) {
        this.top_left = top_left;
    }
    
    public Point getTop_right() {
        return top_right;
    }

    public void setTop_right(Point top_right) {
        this.top_right = top_right;
    }

    public Point getBot_left() {
        return bot_left;
    }

    public void setBot_ledt(Point bot_left) {
        this.bot_left = bot_left;
    }

    public Point getBot_right() {
        return bot_right;
    }

    public void setBot_right(Point bot_right) {
        this.bot_right = bot_right;
    }
    
    public int getArea() {
        return (bot_right.getX() - top_left.getX()) * (bot_right.getY() - top_left.getY());
    }

    public int getPerimeter() {
        return (bot_right.getX() - top_left.getX()) + (bot_right.getY() - top_left.getY()) * 2;
    }

    public void move(int x, int y) {
        top_left.setX(top_left.getX() + x);
        top_left.setY(top_left.getY() + y);
        bot_right.setX(bot_right.getX() + x);
        bot_right.setY(bot_right.getY() + y);
    }
}
