public abstract class Shape {
    protected int x, y;
    protected boolean isColor;
    protected boolean move;

    public Shape () {
        x = 0;
        y = 0;
        isColor = true;
        move = true;
    }

    public Shape(int x, int y, boolean isColor, boolean move) {
        this.x = x;
        this.y = y;
        this.isColor = isColor;
        this.move = move;
    }

    public int moveX () {
        return x++;
    }

    public  int moveY () {
        return y++;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                ", isColor=" + isColor +
                ", move=" + move +
                '}';
    }
}
