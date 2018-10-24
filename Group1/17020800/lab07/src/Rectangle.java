import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Scanner;


public class Rectangle extends Shape {
    private int cd, cr;

    @Override
    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(0, 0, cd, cr);
        this.setBounds(x, y, cd, cr);
    }
    
    public Rectangle() {
    }

    public Rectangle(int x, int y,int CD, int CR, Color color) {
        this.x = x;
        this.y = y;
        this.cd = CD;
        this.cr = CR;
        this.color = color;
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
        System.out.println("Nhập chiều dài của hình");
        this.cd = sc.nextInt();
        System.out.println("Nhập chiều rộng của hình");
        this.cr = sc.nextInt();
    }

    @Override
    public int getArea() {
        return cd * cr;
    }

    @Override
    public int getPerimeter() {
        return ( cd + cr) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length = " + cd +
                "width = " + cr +
                ", color='" + color + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
