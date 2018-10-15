package Tuan6;

public class square extends rectangle {
    public square() {}

    public square(point top_left, point bot_right) {
        super(top_left, bot_right);
    }

    public square(String color, boolean filled, point top_left, point bot_right) {
        super(color, filled, top_left, bot_right);
    }
}
