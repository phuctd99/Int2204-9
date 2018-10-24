
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
        //Mới thêm
    public boolean isHit(int x,int y) {
             
            return getBounds().contains(x, y);
        }
 
        public void addX(int x) {
             
            this.x += x;
        }
 
        public void addY(int y) {
             
            this.y += y;
        }
 
        public void addWidth(int w) {
             
            this.edge += w;
        }
 
        public void addHeight(int h) {
             
            this.edge += h;
        }
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
