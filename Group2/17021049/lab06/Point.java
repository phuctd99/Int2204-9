package lab6;

public class Point {
    protected int x;
    protected int y;


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point(){}

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
}
