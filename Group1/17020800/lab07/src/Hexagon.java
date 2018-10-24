import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.GeneralPath;
import java.util.Scanner;


public class Hexagon extends Shape {
    private int  x0;
    private int y0;
    private int c;
    @Override
    public void paint(Graphics g) { 
//        
//        int c = (int)Math.sqrt(Math.pow((x1- x0), 2) + Math.pow((x1- y0), 2));
        int c1 = (int)Math.sqrt(3 * this.c * this.c); 
        
        int x1 = x0 - c1 / 2;
        int y1 = y0 - this.c / 2;
        
        int x2 = x0;
        int y2 = y0 - this.c;
        
        int x3 = x0 + c1 / 2 ;
        int y3 = y0 - this.c / 2;
        
        int x4 = x0 + c1 / 2 ;
        int y4 = y0 + this.c / 2;
        
        int x5 = x0;
        int y5 = y0 + this.c;
        
        int x6 = x0 - c1 / 2;
        int y6 = y0 + this.c / 2;
        
        int xpoints[] = {x1, x2, x3, x4, x5, x6};
        int ypoints[] = {y1, y2, y3, y4, y5, y6};
        int npoints = 6;
    g.setColor(color);
    g.fillPolygon(xpoints, ypoints, npoints);
    this.setBounds(x1,y1, 500, 500);
//        g.fillRect(0, 0, edge, edge);
//        this.setBounds(x, y, edge, edge);
    }
    
    public Hexagon() {
    }

    public Hexagon(int x0, int y0, int c, Color color) {
        this.x0 = x0;
        this.y0 = y0;
        this.c = c;
        this.color = color;
    }
    @Override
    public void NhapThongTIn() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập màu của hình");
        this.color = chonMau();
        System.out.println("Nhập hoành độ điểm tâm");
        this.x0 = sc.nextInt();
        System.out.println("Nhập tung độ điểm tâm");
        this.y0 = sc.nextInt();
        System.out.println("Nhập cạnh của lục giác đều");
        this.c = sc.nextInt();
    }

    @Override
    public int getArea() {
        return 0;
    }

    @Override
    public int getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "Hexagon{" +
                ", color='" + color + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}