package Lab06;
abstract class Shape extends Layer {

    private int x;
    private int y;
    private boolean Movable;
    private boolean Filled;

    public Shape(int _x, int _y, boolean movable, boolean filled) {
        x = _x;
        y = _y;
        Movable = movable;
        Filled = filled;
    }

    public int getX() {
        return x;
    }

    public void setX(int _x) {
        x = _x;
    }

    public int getY() {
        return y;
    }

    public void setY(int _y) {
        y = _y;
    }

    public boolean isMovable() {
        return Movable;
    }

    public void setMovable(boolean movable) {
        Movable = movable;
    }

    public boolean isFilled() {
        return Filled;
    }

    public void setFilled(boolean filled) {
        Filled = filled;
    }
}
