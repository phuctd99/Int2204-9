import java.awt.Color;
import java.awt.Graphics;
public class Hexagon extends Shape {

    VeHinh p1;
    VeHinh p2, p3, p4, p5, p6;
    int dai;
    int X = 10;
    int Y = 10;
    public VeHinh getP1() {
        return p1;
    }
    public void setP1(VeHinh p1) {
        this.p1 = p1;
    }
    public VeHinh getP2() {
        return p2;
    }
    public VeHinh getP3() {
        return p3;
    }
    public VeHinh getP4() {
        return p4;
    }
    public VeHinh getP5() {
        return p5;
    }
    public VeHinh getP6() {
        return p6;
    }
    public int getDai() {
        return dai;
    }
    public void setDai(int dai) {
        this.dai = dai;
    }
    // Constructor
    public Hexagon(VeHinh p1, VeHinh p2, VeHinh p3, VeHinh p4, VeHinh p5, VeHinh p6, Color color) {
        super(color);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        this.p5 = p5;
        this.p6 = p6;
    }
    // Di chuyển các điểm của Hexagon
    public void moveHexagon(int dx, int dy) {
        p1.move(dx, dy);
        p2.move(dx, dy);
        p3.move(dx, dy);
        p4.move(dx, dy);
        p5.move(dx, dy);
        p6.move(dx, dy);
    }
    // Vẽ Hexagon lên cửa sổ, fill color cho Hexagon
    @Override
    public void paint(Graphics g) {
        int[] xPoints = {p1.x, p2.x, p3.x, p4.x, p5.x, p6.x};
        int[] yPoints = {p1.y, p2.y, p3.y, p4.y, p5.y, p6.y};
        g.setColor(color);
        g.drawLine(p1.x, p1.y, p2.x, p2.y);
        g.drawLine(p2.x, p2.y, p3.x, p3.y);
        g.drawLine(p3.x, p3.y, p4.x, p4.y);
        g.drawLine(p4.x, p4.y, p5.x, p5.y);
        g.drawLine(p5.x, p5.y, p6.x, p6.y);
        g.drawLine(p6.x, p6.y, p1.x, p1.y);
        g.fillPolygon(xPoints, yPoints, 6);
    }
    // Di chuyển Hexagon
    public void update() {
        moveHexagon(X, Y);
        if (p1.x < 0 || p2.x < 0 || p3.x < 0 || p4.x < 0 || p5.x < 0 || p6.x < 0
                || p1.x > testmain.WIDTH || p2.x > testmain.WIDTH || p3.x > testmain.WIDTH
                || p4.x > testmain.WIDTH || p5.x > testmain.WIDTH || p6.x > testmain.WIDTH) {
            X = -X;
        }
        if (p1.y < 0 || p2.y < 0 || p3.y < 0 || p4.y < 0 || p5.y < 0 || p6.y < 0
                || p1.y > testmain.HEIGHT || p2.y > testmain.HEIGHT || p3.y > testmain.HEIGHT
                || p4.y > testmain.HEIGHT || p5.y > testmain.HEIGHT || p6.y > testmain.HEIGHT) {
            Y = -Y;
        }
    }
    // Trả về thông tin Hexagon
    @Override
    public String getInfo() {
        return "Thông tin Hexagon: ";
    }
}