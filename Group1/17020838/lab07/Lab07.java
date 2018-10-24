package lab07;

import java.util.*;
import javax.swing.JFrame;
import java.awt.*;
class Diagram{
    public ArrayList <Layer> LLayer = new ArrayList();
    Layer lCircle = new Layer();
    Layer lRectangle = new Layer();
    Layer lSquare = new Layer();
    Layer lTriangle = new Layer();
    Layer lHexagon = new Layer();
    public void movetoObjectLayer(){ // chuyen tung loai vao tung Layer
        for(int i = 0; i < LLayer.size(); i++){
            for(int j = 0; j < LLayer.get(i).getSize(); j++){
                if(LLayer.get(i).getIndex(j) instanceof Circle){
                    lCircle.add(LLayer.get(i).getIndex(j));
                }else if(LLayer.get(i).getIndex(j) instanceof Rectangle){
                    lRectangle.add(LLayer.get(i).getIndex(j));
                }else if(LLayer.get(i).getIndex(j) instanceof Square){
                    lSquare.add(LLayer.get(i).getIndex(j));
                }else if(LLayer.get(i).getIndex(j) instanceof Triangle){
                    lTriangle.add(LLayer.get(i).getIndex(j));
                }else if(LLayer.get(i).getIndex(j) instanceof Hexagon){
                    lHexagon.add(LLayer.get(i).getIndex(j));
                }
            }
        }
    }
    public void add(Layer l){
        LLayer.add(l);
    }
    public int size(){
        return LLayer.size();
    }
    public void deleteCircle() { // phuong thuc xoa cac doi tuong Circle
        for (int i = 0; i < LLayer.size(); i++) {
            LLayer.get(i).deleteCircle();
        }
    }
}
class Layer{
    private ArrayList <Shape> LShape = new ArrayList();
    private boolean visible;
    public void add(Shape s){
        LShape.add(s);
    }
    public boolean getVisible(){
        return this.visible;
    }
    public void setVisible(boolean lg) {
        this.visible = lg;
    }
    public int size(){
        return LShape.size();
    }
    public void remove(int j) {
        LShape.remove(j);
    }
    public void deleteTriangle(){ // phuong thuc xoa cac doi tuong Triangle
        for (int i = LShape.size() -1; i >= 0; i--) {
            if (LShape.get(i) instanceof Triangle) {
                LShape.remove(i);
                i++;
        }
        }
    }
    public void deleteCircle(){
        for (int i = LShape.size() -1; i >= 0; i--) {
            if (LShape.get(i) instanceof Circle) {
                LShape.remove(i);
                i++;
        }
        }
    }
    public boolean sameShape(Shape s1, Shape s2) {
        if(s1 instanceof Circle && s2 instanceof Circle){
             if(((Circle)s1).sameCircle((Circle)s2)){
                 return true;
             }
         }
        if(s1 instanceof Rectangle && s2 instanceof Rectangle){
             if(((Rectangle)s1).sameRectangle((Rectangle)s2)){
                 return true;
             }
         }
          if(s1 instanceof Square && s2 instanceof Square){
             if(((Square)s1).sameSquare((Square)s2)){
                 return true;
             }
         }
          if(s1 instanceof Triangle && s2 instanceof Triangle){
             if(((Triangle)s1).sameTriangle((Triangle)s2)){
                 return true;
             }
         }
          if(s1 instanceof Hexagon && s2 instanceof Hexagon){
             if(((Hexagon)s1).sameHexagon((Hexagon)s2)){
                 return true;
             }
         }
         return false;
    }
    public void moveSame() { // xoa cac hinh giong nhau trong Layer
        for (int i = 0; i < LShape.size() - 1; i++){
            for (int j = 0; j < LShape.size(); j++) {
                if (sameShape(LShape.get(i),LShape.get(j))) {
                    LShape.remove(j);
                    j--;
                }
            }
        }
    } 
    public int getSize() {
        return this.LShape.size();
    }
    public Shape getIndex(int n) {
        return this.LShape.get(n);
    }
     
}
class Location {
    private int x, y;
    public Location() {
        this.x = 0;
        this.y = 0;
    }
    public Location(int r1, int r2) {
        this.x = r1;
        this.y = r2;
    }
    public int getX() {
        return this.x;
    }
    public void setX(int r) {
        this.x = r;
    }
    public int getY() {
        return this.y;
    }
    public void setY(int r) {
        this.y = r;
    }
    public boolean sameLocation(Location l) {
        if (this.x == l.x && this.y == l.y) {
            return true;
        } else {
            return false;
        }
    }
}
abstract class Shape {
    protected Location loc;
    protected String color;
    abstract public void erase();
    public Shape(Location l, String s){
        this.loc = l;
        this.color = s;
    }
    public void moveTo(int x1, int y1) {
        this.loc.setX(x1);
        this.loc.setY(y1);
    }
    public String getColor(){
        return color;
    }
    
}
class Circle extends Shape {
    private int r;
    public Circle(Location l, int r1, String s) {
        super (l, s);
        this.r = r1;
    }
    public int getR() {
        return r;
    }
    public void setR(int _r) {
        r = _r;
    }
    public void erase() {
       this.loc.setX(0);
       this.loc.setY(0);
    }
    public boolean sameCircle(Circle s2) {
        if (loc.sameLocation(s2.loc) && r == s2.r) {
            return true;
        } else {
            return false;
        }
    } 
    
} 
class Triangle extends Shape{
    private int a, b, c;
    public Triangle(Location l, int  _a, int _b, int _c, String s){
        super(l, s);
        a = _a;
        b = _b;
        c = _c;
    }
    public int getA() {
        return a;
    }
    public void setA(int _r) {
        a = _r;
    }
    public int getB() {
        return b;
    }
    public void setB(int _r) {
        b = _r;
    }
    public int getC() {
        return c;
    }
    public void setC(int _r) {
        c = _r;
    }
   public void erase() {
        a = 0;
        b = 0;
        c = 0;
    }
    public boolean sameTriangle(Triangle s2) {
        if (loc.sameLocation(s2.loc) && a == s2.a && b 
                == s2.b && c == s2.c) {
            return true;
        } else {
            return false;
        }
    
    }
}
class Display extends Canvas{
    private Layer layer;
    public Display(Layer l) {
        this.layer = l;
    }
    public void paint(Graphics g) {
       
        setBackground(Color.WHITE); 
        setForeground(Color.RED);  
        for (int i = 0; i < layer.getSize(); i++) {
            if (layer.getIndex(i) instanceof Circle) {
                Circle c = (Circle) layer.getIndex(i);
                g.fillOval(c.loc.getX(), c.loc.getY(), c.getR(), c.getR());
            }
            if (layer.getIndex(i) instanceof Rectangle) {
                Rectangle c = (Rectangle) layer.getIndex(i);
                g.fillRect(c.loc.getX(), c.loc.getY(), c.getWidth(), c.getLength());
            }
            if (layer.getIndex(i) instanceof Square) {
                Square c = (Square) layer.getIndex(i);
                g.fillRect(c.loc.getX(), c.loc.getY(), c.getSide(), c.getSide());
            }
        }
   }
}
class Rectangle extends Shape{  // doi tuong Rectangle ke thua doi tuong Shape
    private int width, length; // va them 2 thuoc tinh width ,length 
    public Rectangle(Location l, int _a, int _b, String s) { 
        super(l, s);
        width = _a;     
        length = _b;
    }
    public int getWidth() { // getter width
        return width;
    }
    public void setWidth(int r) { // setter width
        width = r;
    }
    public int getLength() { // getter length
        return length;
    }
    public void setLength(int r) { // setter length
        length = r;
    }
    public Location getLoc(){
        return this.loc;
    }
     public void erase() {
         width = 0;
         length = 0;
    }
    public boolean sameRectangle(Rectangle s2) {
        if (loc.sameLocation(s2.loc) && width == s2.width && length 
                == s2.length) {
            return true;
        } else {
            return false;
        }
    
    }    
    
}

class Square extends Rectangle { // doi tuong Square ke thua doi tuong Rectangle
    private int side; // nhung 2 thuoc tinh width, length chuyen thanh side
    public Square(Location l, int a,int b, int _r, String s) {
        super(l,a,b, s);
        side = _r;
    }
    public int getSide() { // getter side
        return side;
    }
    public void setSide(int r) { // setter side
        side = r;
    }
    public void erase() {
        side = 0;
    }
    public boolean sameSquare(Square s2) {
        if (loc.sameLocation(s2.loc) && side == s2.side) {
            return true;
        } else {
            return false;
        }
    } 
}
class Hexagon extends Shape{
    private int a1, a2, a3 , a4, a5, a6;
    public Hexagon(Location l, int _a1, int _a2,int _a3, int _a4, int 
            _a5,int _a6, String s){
        super(l, s);
        a1= _a1;
        a2 = _a2;
        a3 = _a3;
        a4 = _a4;
        a5 = _a5;
        a6 = _a6;
    }
    public int getA1() {
        return a1;
    }
    public void setA1(int r) {
        a1 = r;
    }
    public int getA2() {
        return a2;
    }
    public void setA2(int r) {
        a2 = r;
    }
    public int getA3() {
        return a3;
    }
    public void setA3(int r) {
        a3 = r;
    }
    public int getA4() {
        return a4;
    }
    public void setA4(int r) {
        a4 = r;
    }
    public int getA5() {
        return a5;
    }
    public void setA5(int r) {
        a5 = r;
    }
    public int getA6() {
        return a6;
    }
    public void setA6(int r) {
        a6 = r;
    }
    public void erase() {
        a1 = 0;
        a2 = 0;
        a3 = 0;
        a4 = 0;
        a5 = 0;
        a6 = 0;
    }
    public boolean sameHexagon(Hexagon s2) {
        if (loc.sameLocation(s2.loc) && a1 == s2.a1 && a2 == s2.a2 && 
                a3 == s2.a3 && a4 == s2.a4 && a5 == s2.a5 && a6 == s2.a6) {
            return true;
        } else {
            return false;
        }
    
    }
}
public class Lab07 {

    
    public static void main(String[] args) {
    Location L1 = new Location(140, 130);
    Rectangle cn = new Rectangle(L1, 40, 50, "Red");
    Location L2 = new Location(80, 30);
    Square vuong = new Square(L2, 30, 30 , 30, "Red");
    Location L3 = new Location(40, 10);
    Circle c = new Circle(L3, 10, "Red");
    Layer layer = new Layer();
    layer.add(cn);
    layer.add(vuong);
    layer.add(c);
    Display m = new Display(layer);  
        JFrame f = new JFrame();  
        f.add(m);  
        f.setSize(400,400);  
        //f.setLayout(null);  
        f.setVisible(true); 
    }
    
}
