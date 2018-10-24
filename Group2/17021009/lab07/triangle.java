package Tuan7;

//hình tam giác
public class triangle extends shape {
    //tọa độ 3 đỉnh của tam giác
    private point p1;
    private point p2;
    private point p3;

    //các phương thức khởi tạo
    public triangle() {}
    public triangle(point p1, point p2, point p3) {
        super();
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    public triangle(String color, boolean filled, point p1, point p2, point p3, boolean visible) {
        super(color, filled, visible);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    //các phương thức get/set
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

    //lấy tọa độ x, y tại 3 điểm của hình tam giác
    public int getXOfP1() {
        return this.getP1().getX();
    }
    public int getYOfP1() {
        return this.getP1().getY();
    }
    public int getXOfP2() {
        return this.getP2().getX();
    }
    public int getYOfP2() {
        return this.getP2().getY();
    }
    public int getXOfP3() {
        return this.getP3().getX();
    }
    public int getYOfP3() {
        return this.getP3().getY();
    }

    //tính diện tích tam giác
    public int getAre() {
        return Math.abs((p2.getX() - p1.getX()) * (p3.getY() - p1.getY()) - (p3.getX() - p1.getX()) * (p2.getY() - p1.getY()));
    }

    //tính chu vi tam giác
    public double getPerimeter() {
        return Math.sqrt((p1.getX() - p2.getX()) * (p1.getX() - p2.getX()) + (p1.getY() - p2.getY()) * (p1.getY() - p2.getY()))
                + Math.sqrt((p1.getX() - p3.getX()) * (p1.getX() - p3.getX()) + (p1.getY() - p3.getY()) * (p1.getY() - p3.getY()))
                + Math.sqrt((p2.getX() - p3.getX()) * (p2.getX() - p3.getX()) + (p2.getY() - p3.getY()) * (p2.getY() - p3.getY()));
    }

    //di chuyển hình
    public void move(int x, int y) {
        p1.setX(p1.getX() + x);
        p1.setY(p1.getY() + y);
        p2.setX(p2.getX() + x);
        p2.setY(p2.getY() + y);
        p3.setX(p3.getX() + x);
        p3.setY(p3.getY() + y);
    }
}
