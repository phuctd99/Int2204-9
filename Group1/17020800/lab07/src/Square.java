
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Scanner;

public class Square extends Shape {    
    private int edge;
   

    @Override
    public void paint(Graphics g) {
        g.setColor(this.color);
        g.fillRect(0, 0, edge, edge);
        this.setBounds(x, y, edge, edge);
    }
    
    public Square() {
    }
    
    public Square(int x, int y, int edge, Color color) {
        this.x = x;
        this.y = y;
        this.edge = edge;
        this.color = color;
    }

//    public Boolean isSquare() {
//        double c1 = Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2);
//        double c2 = Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2);
//        double c3 = Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2);
//        if (c1 > c2 && c1 > c3 && c1 == c2 + c3
//                || c2 > c1 && c2 > c3 && c2 == c1 + c3
//                || c3 > c2 && c3 > c1 && c3 == c2 + c1) {
//            return true;
//        }
//        return false;
//    }

    @Override
    public void NhapThongTIn() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập màu của hình");
        this.color = chonMau();
        System.out.println("Nhập hoành độ của hình");
        this.x = sc.nextInt();
        System.out.println("Nhập tung độ của hình");
        this.y = sc.nextInt();
        System.out.println("Nhập cạnh của hình");
        this.edge = sc.nextInt();
    }
    
    @Override
    public int getArea() {
        return edge + edge;
    }
    
    @Override
    public int getPerimeter() {
        return edge * 2;
    }
    
    @Override
    public String toString() {
        return "Square{"
                + "edge = " + edge
                + ", color='" + color + '\''
                + ", x=" + x
                + ", y=" + y
                + '}';
    }
}
