package lab05bt2;
class Shape{
    protected String color;  // khoi tao doi tuong shape gom 2 thuoc tinh
    protected boolean filled;// color va filled
    public Shape(){  // constructor khong tham so
        this.color = "red";
        this.filled = true;
    }
    public Shape(String s, boolean bool){ // constructor co tham so
        this.color = s;
        this.filled = bool;
    }
    public String getColor(){ // getter color
        return this.color;
    }
    public void setColor(String s) { // setter color
        this.color = s;
    }
    public boolean isFilled(){ // getter filled
        return this.filled;
    }
    public void setFilled(boolean bool) { // setter filled
        this.filled = bool;
    }
    public String toString(){ 
        return "shape:" + color + " " + filled;
    }
}
class Circle extends Shape{ // doi tuong circle ke thua doi tuong shape
    private double radius; // co them thuoc tinh radius 
    final private double PI = 3.14; // hang so pi
    public Circle(){ // constructor khong tham so
        this.radius = 1.0;
    }
    public Circle(double r) { // constructor voi 1 tham so radius
        this.radius = r;
    }
    public Circle(double r, String s, boolean bool) { // constructor voi day du
        this.radius = r;                                   // 3 tham so
        this.color = s;
        this.filled = bool;
    }
    public double getRadius() { // getter radius
        return this.radius;
    }
    public void setRadius(double r) { // setter radius
        this.radius = r;
    } 
    public double getArea() { // ham tinh dien tich
        return radius * radius * PI;
    }
    public double getPerimeter() { // ham tinh chi vi
        return 2 * PI * radius;
    }
    public String toString() {
        return "circle:" + color + " " + filled;
    }
}
class Rectangle extends Shape{  // doi tuong Rectangle ke thua doi tuong Shape
    protected double width, length; // va them 2 thuoc tinh width ,length 
    public Rectangle(){ // constructor khong tham so
        this.width = 1.0;
        this.length = 1.0;
    }
    public Rectangle(double r, double d) { // constructor voi 2 tham so width,
        this.width = r;                         // length
        this.length = d;
    }
    public Rectangle(double r, double d, String s, boolean bool) { // construtor
        this.width = r;     // voi day du 4 tham so
        this.length = d;
        this.color = s;
        this.filled = bool;
    }
    public double getWidth() { // getter width
        return this.width;
    }
    public void setWidth(double r) { // setter width
        this.width = r;
    }
    public double getLength() { // getter length
        return this.length;
    }
    public void setLength(double r) { // setter length
        this.length = r;
    }
    public double getArea(){ // ham tinh dien tich hinh chu nhat
        return width * length;
    }
    public double getPerimeter(){ // ham tinh chu vi hinh chu nhat
        return 2 * (width + length);
    }
    public String toString() {
        return "Rectangle:" + color + " " + filled;
    }
}
class Square extends Rectangle { // doi tuong Square ke thua doi tuong Rectangle
    private double side; // nhung 2 thuoc tinh width, length chuyen thanh side
    public Square(){ // constructor khong tham so
        this.side = 1.0;
    }
    public Square(double r){ // constructor voi 1 tham so side
        this.side = r;
    }
    public Square(double r, String s, boolean bool){ // constructor voi day du 3
        this.side = r;                                    // tham so
        this.color = s;
        this.filled = bool;
    }
    public double getSide() { // getter side
        return this.side;
    }
    public void setSide(double r) { // setter side
        this.side = r;
    }
    public void setWidth(double r) { // viet lai setter width
        this.side = r;
    }
    public void setLength(double r) { // viet lai setter length
        this.side = r;
    }
    public String toString() {
        return "square:" + color + " " + filled;
    }
}
public class Lab05BT2 {
    public static void main(String[] args) {
       Shape sh = new Shape("blue", true);
       System.out.println(sh);
       Circle tron = new Circle(2, "black", false);
       System.out.println(tron.getArea());
       System.out.println(tron.getPerimeter());
       Rectangle hcn = new Rectangle(2, 4, "white", true);
       System.out.println(hcn.getArea());
       System.out.println(hcn.getPerimeter());
       Square vuong = new Square(4, "Yellow", true);
       System.out.println(vuong);
    }
    
}
