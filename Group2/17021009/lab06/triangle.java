package Tuan6;

public class triangle extends shape {
    private point p1;
    private point p2;
    private point p3;

    public triangle() {}

    public triangle(point p1, point p2, point p3) {
        super();
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public triangle(String color, boolean filled, point p1, point p2, point p3) {
        super(color, filled);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public point getP1() {
        return p1;
    }

    public void setP1(point p1) {
        this.p1 = p1;
    }

    public point getP2() {
        return p2;
    }

    public void setP2(point p2) {
        this.p2 = p2;
    }

    public point getP3() {
        return p3;
    }

    public void setP3(point p3) {
        this.p3 = p3;
    }

    public int getAre() {
        return Math.abs((p2.getX() - p1.getX()) * (p3.getY() - p1.getY()) - (p3.getX() - p1.getX()) * (p2.getY() - p1.getY()));
    }

    public double getPerimeter() {
        return Math.sqrt((p1.getX() - p2.getX()) * (p1.getX() - p2.getX()) + (p1.getY() - p2.getY()) * (p1.getY() - p2.getY()))
                + Math.sqrt((p1.getX() - p3.getX()) * (p1.getX() - p3.getX()) + (p1.getY() - p3.getY()) * (p1.getY() - p3.getY()))
                + Math.sqrt((p2.getX() - p3.getX()) * (p2.getX() - p3.getX()) + (p2.getY() - p3.getY()) * (p2.getY() - p3.getY()));
    }

    public void move(int x, int y) {
        p1.setX(p1.getX() + x);
        p1.setY(p1.getY() + y);
        p2.setX(p2.getX() + x);
        p2.setY(p2.getY() + y);
        p3.setX(p3.getX() + x);
        p3.setY(p3.getY() + y);
    }
}
