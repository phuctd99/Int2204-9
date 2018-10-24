import java.awt.Color;
import java.awt.Graphics;
public class Triangle extends Shape {
    VeHinh p1;
    VeHinh p2;
    VeHinh p3;
    int X = 12;
    int Y = 12;
    public VeHinh getP1() {
        return p1;
    }
    public void setP1(VeHinh p1) {
        this.p1 = p1;
    }
    public VeHinh getP2() {
        return p2;
    }
    public void setP2(VeHinh p2) {
        this.p2 = p2;
    }
    public VeHinh getP3() {
        return p3;
    }
    public void setP3(VeHinh p3) {
        this.p3 = p3;
    }
    public Triangle(Color color) {
        super(color);
    }
    // Constructor
    public Triangle(VeHinh p1, VeHinh p2, VeHinh p3, Color color) {
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
        if (p1.x < 0 || p2.x < 0 || p3.x < 0 || p1.x > testmain.WIDTH || p2.x > testmain.WIDTH || p3.x > testmain.WIDTH) {
            X = -X;
        }
        if (p1.y < 0 || p2.y < 0 || p3.y < 0 || p1.y > testmain.HEIGHT || p2.y > testmain.HEIGHT || p3.y > testmain.HEIGHT) {
            Y = -Y;
        }
    }
    // Trả về thông tin tam giác
    @Override
    public String getInfo() {
        return "Yes";
    }
}