package Tuan6;

public class rectangle extends shape {
    private point top_left;
    private point bot_right;

    public rectangle() {}

    public rectangle(point top_left, point bot_right) {
        super();
        this.top_left = top_left;
        this.bot_right = bot_right;
    }

    public rectangle(String color, boolean filled, point top_left, point bot_right) {
        super(color, filled);
        this.top_left = top_left;
        this.bot_right = bot_right;
    }

    public point getTop_left() {
        return top_left;
    }

    public void setTop_left(point top_left) {
        this.top_left = top_left;
    }

    public point getBot_right() {
        return bot_right;
    }

    public void setBot_right(point bot_right) {
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
