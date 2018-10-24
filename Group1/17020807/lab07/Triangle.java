package Lab06;
public class Triangle extends Shape {

    int x2, x3, y2, y3;

    public Triangle(int _x, int _y, boolean movable, boolean filled, int _x2, int _y2, int _x3, int _y3) {
        super(_x, _y, movable, filled);
        x2 = _x2;
        y2 = _y2;
        x3 = _x3;
        y3 = _y3;
    }

    public int getX2() {
        return x2;
    }

    public int getX3() {
        return x3;
    }


    public int getY2() {
        return y2;
    }

    public int getY3() {
        return y3;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public void setY3(int y3) {
        this.y3 = y3;
    }
   
}
