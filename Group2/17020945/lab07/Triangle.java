import java.awt.Color;
import java.awt.Graphics;
public class Triangle extends Shape {
    PaintHinh p1;
    PaintHinh p2;
    PaintHinh p3;
    int X = 12;
    int Y = 12;
    public PaintHinh getP1() {
        return p1;
    }
    public void setP1(PaintHinh p1) {
        this.p1 = p1;
    }
    public PaintHinh getP2() {
        return p2;
    }
    public void setP2(PaintHinh p2) {
        this.p2 = p2;
    }
    public PaintHinh getP3() {
        return p3;
    }
    public void setP3(PaintHinh p3) {
        this.p3 = p3;
    }
    public Triangle(Color color) {
        super(color);
    }
    // Constructor
    public Triangle(PaintHinh p1, PaintHinh p2, PaintHinh p3, Color color) {
        super(color);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    // Di chuyển các điểm của tam giác
    public void moveTriangle(int dx, int dy) {
        p1.move(dx, dy);
        p2.move(dx, dy);
        p3.move(dx, dy);

    }
    // Vẽ tam giác
    @Override
    public void paint(Graphics g) {
        int[] xPoints = {p1.x, p2.x, p3.x};
        int[] yPoints = {p1.y, p2.y, p3.y};
        g.setColor(color);
        g.drawLine(p1.x, p1.y, p2.x, p2.y);
        g.drawLine(p2.x, p2.y, p3.x, p3.y);
        g.drawLine(p3.x, p3.y, p1.x, p1.y);
        g.fillPolygon(xPoints, yPoints, 3);
    }
    // Di chuyển tam giác
    public void update() {
        moveTriangle(X, Y);
        if (p1.x < 0 || p2.x < 0 || p3.x < 0 || p1.x > test.WIDTH || p2.x > test.WIDTH || p3.x > test.WIDTH) {
            X = -X;
        }
        if (p1.y < 0 || p2.y < 0 || p3.y < 0 || p1.y > test.HEIGHT || p2.y > test.HEIGHT || p3.y > test.HEIGHT) {
            Y = -Y;
        }
    }
    // Trả về thông tin tam giác
    @Override
    public String getInfo() {
        return "Yes";
    }
}