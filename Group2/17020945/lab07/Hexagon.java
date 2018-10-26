import java.awt.Color;
import java.awt.Graphics;
public class Hexagon extends Shape {

    PaintHinh p1, p2, p3, p4, p5, p6;
    int dai;
    int X = 10;
    int Y = 10;
    
    public PaintHinh getP1() {
        return p1;
    }
    
    public void setP1(PaintHinh h1) {
        this.p1 = h1;
    }
    
    public PaintHinh getP2() {
        return p2;
    }
    
    public PaintHinh getP3() {
        return p3;
    }
    
    public PaintHinh getP4() {
        return p4;
    }
    
    public PaintHinh getP5() {
        return p5;
    }
    
    public PaintHinh getP6() {
        return p6;
    }
    
    public int getDai() {
        return dai;
    }
    
    public void setDai(int dai) {
        this.dai = dai;
    }
    
    // Constructor
    public Hexagon(PaintHinh p1, PaintHinh p2, PaintHinh p3, PaintHinh p4, PaintHinh p5, PaintHinh p6, Color color) {
        super(color);
        
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        this.p5 = p5;
        this.p6 = p6;
    }

    public void Move(int dx, int dy) {
        p1.move(dx, dy);
        p2.move(dx, dy);
        p3.move(dx, dy);
        p4.move(dx, dy);
        p5.move(dx, dy);
        p6.move(dx, dy);
    }

    @Override
    public void paint(Graphics g) {
        int[] x1 = {p1.x, p2.x, p3.x, p4.x, p5.x, p6.x};
        int[] y1 = {p1.y, p2.y, p3.y, p4.y, p5.y, p6.y};
        g.setColor(color);
        
        g.drawLine(p1.x, p1.y, p2.x, p2.y);
        g.drawLine(p2.x, p2.y, p3.x, p3.y);
        g.drawLine(p3.x, p3.y, p4.x, p4.y);
        g.drawLine(p4.x, p4.y, p5.x, p5.y);
        g.drawLine(p5.x, p5.y, p6.x, p6.y);
        g.drawLine(p6.x, p6.y, p1.x, p1.y);
        
        g.fillPolygon(x1, y1, 6);
    }

    public void update() {
        
        Move(X, Y);
        if (p1.x < 0 || p2.x < 0 || p3.x < 0 || p4.x < 0 || p5.x < 0 || p6.x < 0
            || p1.x > test.WIDTH || p2.x > test.WIDTH || p3.x > test.WIDTH
            || p4.x > test.WIDTH || p5.x > test.WIDTH || p6.x > test.WIDTH) {
            X = -X;
        }
        if (p1.y < 0 || p2.y < 0 || p3.y < 0 || p4.y < 0 || p5.y < 0 || p6.y < 0|| p1.y > test.HEIGHT 
            || p2.y > test.HEIGHT || p3.y > test.HEIGHT || p4.y > test.HEIGHT || p5.y > test.HEIGHT 
            || p6.y > test.HEIGHT) {
            Y = -Y;
        }
    }

    @Override
    public String getInfo() {
        return "Thông tin Hexagon: ";
    }
}