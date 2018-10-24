import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.GeneralPath;
import java.util.Scanner;


public class Triangle extends Shape {
    private int  x1, x2, x3;
    private int y1, y2, y3;
    @Override
    public void paint(Graphics g) { 
    g.setColor(color);
    int xpoints[] = {this.x1, this.x2, this.x3};
    int ypoints[] = {this.y1, this.y2, this.y3};
    int npoints = 3;
    
    g.fillPolygon(xpoints, ypoints, npoints);
    this.setBounds(this.x1,this.y1, 500, 500);
//        g.fillRect(0, 0, edge, edge);
//        this.setBounds(x, y, edge, edge);
    }
    
    public Triangle() {
    }

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3, Color color) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        this.color = color;
    }
    @Override
    public void NhapThongTIn() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập màu của hình");
        this.color = chonMau();
        System.out.println("Nhập tọa độ điểm thứ 1");
        this.x1 = sc.nextInt();
        this.y1 = sc.nextInt();
        System.out.println("Nhập tọa độ điểm thứ 2");
        this.x2 = sc.nextInt();
        this.y2 = sc.nextInt();
        System.out.println("Nhập tọa độ điểm thứ 3");
        this.x3 = sc.nextInt();
        this.y3 = sc.nextInt();
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
        return "Triangle{" +
                ", color='" + color + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}