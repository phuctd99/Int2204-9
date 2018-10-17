import java.util.ArrayList;
import java.util.List;

/**
 * Created by CCNE on 15/10/2018.
 */
class Diagram{
    public List<Layer> layers = new ArrayList();
    public void removeCircle() {
        for (Layer i : layers ) {
           for(Shape j : i.shapes){
               if (j instanceof Circle){
                   i.shapes.remove((j));
                   break;
               }
           }
        }
    }
}

class Layer {
    public List<Shape> shapes = new ArrayList();
    public void removeRectangle() {
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Rectangle) {
                shapes.remove(i);
                i--;
            }
        }
    }
}

class Shape {
    int td_x;
    int td_y;
    String color;

    public Shape (){
        td_x = 0;
        td_y = 0;
        color = "red";
    }

    public Shape (String color,  int td_x, int td_y){
        this.color = color;
        this.td_x = td_x;
        this.td_y = td_y;
    }
    public String toString (){
        return " Mau: " + color + " , toa do"  + "(" + td_x + ", " + td_y + ")";
    }
}

class Rectangle extends  Shape{
    int width, heigth;
    public Rectangle(){
        width =  1;
        heigth = 1;
    }

    public Rectangle(int width, int heigth){
        super();
        this.width = width;
        this.heigth = heigth;
    }

    public Rectangle(int width, int heigth, int td_x, int td_y, String color){
        super(color,td_x, td_y);
        this.width= width;
        this.heigth = heigth;
    }

    public void setCoordinates(int x, int y){
        super.td_x = x;
        super.td_y = y;
    }

    public void moveTo (int x, int y){
        this.td_x = x;
        this.td_y = y;
    }

    public void setColor  (String color){
        super.color = color;
    }
    public String toString (){
        return " Mau: " + color + " , toa do"  + "(" + td_x + ", " + td_y + ")";
    }
}

class Square extends Shape{
    int side;
    public Square(){
        side = 1;
    }

    public Square(int side){
        super();
        this.side = side;
    }

    public Square(int side, int td_x, int td_y, String color){
        super(color,td_x, td_y);
        this.side = side;
    }

    public void setCoordinates(int x, int y){
        super.td_x = x;
        super.td_y = y;
    }

    public void moveTo (int x, int y){
        this.td_x = x;
        this.td_y = y;
    }

    public void setColor  (String color){
        super.color = color;
    }
    public String toString (){
        return " Mau: " + color + " , toa do"  + "(" + td_x + ", " + td_y + ")";
    }
}

class Triangle extends Shape{
    int a, b, c;
    public Triangle(){
        a = 1;
        b = 1;
        c = 1;
    }

    public Triangle(int a, int b, int c){
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(int a, int b, int c, int td_x, int td_y, String color){
        super(color,td_x, td_y);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setCoordinates(int x, int y){
        super.td_x = x;
        super.td_y = y;
    }

    public void moveTo (int x, int y){
        this.td_x = x;
        this.td_y = y;
    }

    public void setColor  (String color){
        super.color = color;
    }
    public String toString (){
        return " Mau: " + color + " , toa do"  + "(" + td_x + ", " + td_y + ")";
    }
}

class Circle extends  Shape{
    int radius;
    public Circle(){
       radius = 1;
    }

    public Circle(int radius){
        super();
        this.radius = radius;
    }

    public Circle(int radius, int td_x, int td_y, String color){
        super(color,td_x, td_y);
        this.radius = radius;
    }

    public void setCoordinates(int x, int y){
        super.td_x = x;
        super.td_y = y;
    }

    public void moveTo (int x, int y){
        this.td_x = x;
        this.td_y = y;
    }

    public void setColor  (String color){
        super.color = color;
    }
    public String toString (){
        return " Mau: " + color + " , toa do"  + "(" + td_x + ", " + td_y + ")";
    }
}

public class Baitap {
    public static void main(String[] args) {
        Diagram d = new Diagram();
        Layer l = new Layer();
        Shape s1 = new Rectangle(4, 5, 1, 2 , "do");
        Shape s2 = new Square(5);
        Shape s3 = new Triangle(3, 4, 5, 1, 2 , "xanh");
        Shape s4 = new Circle(4);
        d.layers.add(l);
        l.shapes.add(s1);
        l.shapes.add(s2);
        l.shapes.add(s3);
        l.shapes.add(s4);
        for(Shape i : l.shapes){
            System.out.println(i.toString());
        }
        d.removeCircle();
        l.removeRectangle();
        System.out.println("-------------------------------------------");
        for(Shape i : l.shapes){
            System.out.println(i.toString());
        }
    }
}
