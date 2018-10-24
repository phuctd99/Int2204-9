package Tuan7;

public class rectangle extends shape {
    private point top_left; //điểm phía trên bên trái
    private point bot_right; //điểm phía dưới bên phải

    //các phương thức khởi tạo
    public rectangle() {}
    public rectangle(point top_left, point bot_right) {
        super();
        this.top_left = top_left;
        this.bot_right = bot_right;
    }
    public rectangle(String color, boolean filled, point top_left, point bot_right, boolean visible) {
        super(color, filled, visible);
        this.top_left = top_left;
        this.bot_right = bot_right;
    }

    //các phương thức get/set
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

    //lấy giá trị chiều dài chiều rộng của hình
    public int getWidth() {
        return bot_right.getX()-top_left.getX();
    }
    public int getHeight() {
        return bot_right.getY()-top_left.getY();
    }

    //tính diện tích
    public int getArea() {
        return (bot_right.getX() - top_left.getX()) * (bot_right.getY() - top_left.getY());
    }

    //tính chu vi
    public int getPerimeter() {
        return (bot_right.getX() - top_left.getX()) + (bot_right.getY() - top_left.getY()) * 2;
    }

    //di chuyển hình
    public void move(int x, int y) {
        top_left.setX(top_left.getX() + x);
        top_left.setY(top_left.getY() + y);
        bot_right.setX(bot_right.getX() + x);
        bot_right.setY(bot_right.getY() + y);
    }
}
