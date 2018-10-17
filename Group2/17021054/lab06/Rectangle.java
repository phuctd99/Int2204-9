import java.util.Scanner;

public class Rectangle extends Shape {
    public double width;
    public double length;
    public Rectangle(){
        width= 1.0;
        length=1.0;
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void nhap(){
        System.out.println("nhap chieu dai va chieu rong:");
        double width, length;
        Scanner scan = new Scanner(System.in);
        width = scan.nextDouble();
        length = scan.nextDouble();
        setWidth(width);
        setLength(length);

    }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }

    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return 2*(width+length);
    }

    public void InToado() {
        InToado();
        System.out.println( "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}');

    }
}