package Tuan7;

public class hexagon extends shape {
    private point p1;
    private point p2;
    private point p3;
    private point p4;
    private point p5;
    private point p6;

    public hexagon( point p1, point p2, point p3, point p4, point p5, point p6) {
        super();
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        this.p5 = p5;
        this.p6 = p6;
    }

    public hexagon(String color, boolean filled, point p1, point p2, point p3, point p4, point p5, point p6, boolean visible) {
        super(color, filled, visible);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        this.p5 = p5;
        this.p6 = p6;
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

    //lấy tọa độ x, y của từng điểm
    public int getXOfP1() {
        return this.p1.getX();
    }
    public int getXOfP2() {
        return this.p2.getX();
    }
    public int getXOfP3() {
        return this.p3.getX();
    }
    public int getXOfP4() {
        return this.p4.getX();
    }
    public int getXOfP5() {
        return this.p5.getX();
    }
    public int getXOfP6() {
        return this.p6.getX();
    }
    public int getYOfP1() {
        return this.p1.getY();
    }
    public int getYOfP2() {
        return this.p2.getY();
    }
    public int getYOfP3() {
        return this.p3.getY();
    }
    public int getYOfP4() {
        return this.p4.getY();
    }
    public int getYOfP5() {
        return this.p5.getY();
    }
    public int getYOfP6() {
        return this.p6.getY();
    }

    public point getP4() {
        return p4;
    }

    public void setP4(point p4) {
        this.p4 = p4;
    }

    public point getP5() {
        return p5;
    }

    public void setP5(point p5) {
        this.p5 = p5;
    }

    public point getP6() {
        return p6;
    }

    public void setP6(point p6) {
        this.p6 = p6;
    }
}
