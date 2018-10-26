import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Scanner;

public class Circle extends Shape{

    static final double PI = 3.14;

    private int rad;

    public int getRad() {
        return rad;
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(color);
        g.fillOval(0, 0, rad, rad);
        this.setBounds(this.x, this.y, rad, rad);
    }
    public Circle() {
    }

    public Circle(int x, int y, int rad, Color color) {
        this.x = x;
        this.y = y;
        this.rad = rad;
        this.color = color;
    }
    public Boolean isCircle(){
        if (rad > 0){
            return true;
        }
        return false;
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
        System.out.println("Nhập bán kính của hình");
        this.rad = sc.nextInt();
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
             
            this.rad += w;
        }
 
        public void addHeight(int h) {
             
            this.rad += h;
        }
    //end
    @Override
    public int getArea() {
        return (int)PI * rad * rad;
    }

    @Override
    public int getPerimeter() {
        return (int)PI * 2 * rad;
    }
    @Override
    public String toString() {
        return "Circle{ " +
                "radius = " + rad+
                ", color = '" + color + '\'' +
                ", tam hinh tron = ( " + x + "," + y +")" +
                '}';
    }

}
