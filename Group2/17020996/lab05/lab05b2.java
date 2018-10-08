class shape{
    protected String color;
    protected boolean filled;

    public shape(){
        this.color = "red";
        this.filled = true;
    }

    public shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled(){
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString(){
        return "thoa man: " + this.filled + ", mau: " + this.color;
    }
}

class circle extends shape{
    final double pi = 3.14;
    protected double radius = 1;

    public circle(){
        super();
    }

    public circle(double radius){
        super();
        this.radius = radius;
    }

    public circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return pi*radius*radius;
    }

    public double getPerimeter(){
        return 2*pi*radius;
    }

    public String toString(){
        return super.toString() + ", ban kinh: " + this.radius + ", dien tich: " + this.getArea() + ", chu vi: " + this.getPerimeter();
    }
}

class rectangle extends shape{
    protected double width = 1, length = 1;

    public rectangle(){
        super();
    }

    public rectangle(double width, double length){
        super();
        this.width = width;
        this.length = length;
    }

    public rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return width*length;
    }

    public double getPerimeter(){
        return 2*(width + length);
    }

    public String toString(){
        return super.toString() + ", chieu rong: " + this.width + ", chieu dai: " + this.length + ", dien tich: " + this.getArea() +", chu vi: " + this.getPerimeter();
    }
}

class square extends rectangle{

    public square(){
        super();
    }

    public square(double side){
        super(side, side);
    }

    public square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public double getSide() {
        return super.length;
    }

    public void setSide(double side) {
        super.length = side;
        super.width = side;
    }

    public String toString(){
        return super.toString();
    }
}

public class lab05b2 {

    public static void main(String[] args){
        shape sh = new shape("blue", true);
        circle ci = new circle(3, "blue", false);
        rectangle re = new rectangle(2, 3, "blue", true);
        square sq = new square();
        sq.setSide(3);

        System.out.println(sh.toString());
        System.out.println(ci.toString());
        System.out.println(re.toString());
        System.out.println(sq.toString());
    }
}
