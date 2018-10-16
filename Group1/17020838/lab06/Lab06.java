package lab06;
import java.util.*;
class Diagram{
    public ArrayList <Layer> LLayer = new ArrayList();
    public void add(Layer l){
        LLayer.add(l);
    }
    public void getInfo(){
        for (int i = 0; i < LLayer.size(); i++) {
            LLayer.get(i).getInfo();
        }
    }
    public int size(){
        return LLayer.size();
    }
    public void deleteCircle() { // phuong thuc xoa cac doi tuong Circle
        for (int i = 0; i < LLayer.size(); i++) {
            for (int j = LLayer.get(i).getSize() - 1; j >= 0; j--)
            if (LLayer.get(i).getIndex(j) instanceof Circle) {
                LLayer.get(i).remove(j);
                j++;
            }
        }
    }
}
class Layer{
    public ArrayList <Shape> LShape = new ArrayList();
    public void add(Shape s){
        LShape.add(s);
    }
    public int size(){
        return LShape.size();
    }
    public void getInfo(){
        for (int i = 0; i < LShape.size(); i++){
           LShape.get(i).getInfo();
        }
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
    public int getSize() {
        return this.LShape.size();
    }
    public Shape getIndex(int n) {
        return this.LShape.get(n);
    }
        
}

abstract class Shape {
    protected int x, y;
    protected String color;
    abstract public void erase();
    abstract public void draw();
    public Shape(int x1 ,int y1, String s) {
        x = x1;
        y = y1;
        color = s;
    }
    public void moveTo(int x1, int y1) {
        x = x1;
        y = y1;
    }
    public String getColor(){
        return color;
    }
    public void getInfo() {
        
    }
}
class Circle extends Shape {
    double r;
    public Circle(int _x, int _y, double _r, String s) {
        super(_x, _y, s);
        r = _r;
    }
    public double getR() {
        return r;
    }
    public void setR(double _r) {
        r = _r;
    }
    public void erase() {
        x = 0;
        y = 0;
    }
    public void draw() {
        System.out.println(color);
    }
    public void getInfo() {
        System.out.println("Hinh tron:");
        System.out.println("Mau sac:" + getColor());
        System.out.println("Toa do: (" + x + ", " + y + ")");
        System.out.println("Ban kinh:" + r);
        System.out.println();
    }
} 
class Triangle extends Shape{
    public double a, b, c;
    public Triangle(int _x, int _y, double  _a, double _b, double _c, String s){
        super(_x, _y, s);
        a = _a;
        b = _b;
        c = _c;
    }
    public double getA() {
        return a;
    }
    public void setA(double _r) {
        a = _r;
    }
    public double getB() {
        return b;
    }
    public void setB(double _r) {
        b = _r;
    }
    public double getC() {
        return c;
    }
    public void setC(double _r) {
        c = _r;
    }
   public void erase() {
        x = 0;
        y = 0;
    }
    public void draw() {
        System.out.println(color);
    }
    public void getInfo() {
        System.out.println("Hinh tam giac:");
        System.out.println("Mau sac:" + getColor());
        System.out.println("Toa do: (" + x + ", " + y + ")");
        System.out.println("Do dai 3 canh lan luot la:" + a + ", " + b + ", " +c );
        System.out.println();
    }
}
class Rectangle extends Shape{  // doi tuong Rectangle ke thua doi tuong Shape
    protected double width, length; // va them 2 thuoc tinh width ,length 
    public Rectangle(int _x, int _y, double _a, double _b, String s) { 
        super(_x, _y, s);
        width = _a;     
        length = _b;
    }
    public double getWidth() { // getter width
        return width;
    }
    public void setWidth(double r) { // setter width
        width = r;
    }
    public double getLength() { // getter length
        return length;
    }
    public void setLength(double r) { // setter length
        length = r;
    }
    public void erase() {
        x = 0;
        y = 0;
    }
    public void draw() {
        System.out.println(color);
    }
    public void getInfo() {
        System.out.println("Hinh chu nhat:");
        System.out.println("Mau sac:" + getColor());
        System.out.println("Toa do: (" + x + ", " + y + ")");
        System.out.println("Chieu dai, chieu rong:" + length + ", " + width);
        System.out.println();
    }
}
class Square extends Rectangle { // doi tuong Square ke thua doi tuong Rectangle
    private double side; // nhung 2 thuoc tinh width, length chuyen thanh side
    public Square(int _x, int _y, double _r, String s) {
        super(_x, _y, _r, _r, s);
        side = _r;
    }
    public double getSide() { // getter side
        return side;
    }
    public void setSide(double r) { // setter side
        side = r;
    }
    public void erase() {
        x = 0;
        y = 0;
    }
    public void draw() {
        System.out.println(color);
    }
    public void getInfo() {
        System.out.println("Hinh vuong:");
        System.out.println("Mau sac:" + getColor());
        System.out.println("Toa do: (" + x + ", " + y + ")");
        System.out.println("Do dai canh:" + side);
        System.out.println();
    }
}
public class Lab06 {

    
    public static void main(String[] args) {
       Shape tron1 = new Circle(5, 5, 2.5, "red");
       Shape tron2 = new Circle(4, 3, 3.9, "blue");
       Shape tron3 = new Circle(1, 7, 1.8, "blue");
       Shape tron4 = new Circle(7, 3, 3.9, "black");
       Shape tron5 = new Circle(8, 10, 5.5, "green");
       Shape tg1 = new Triangle(3, 4, 3, 4, 5, "yellow");
       tron1.getInfo();
       tron1.erase();
       tron1.draw();
       tron1.moveTo(0, 0);
       tron1.getInfo();
       Shape tg2 = new Triangle(1,6, 7, 2, 6, "orange");
       Shape tg3 = new Triangle(3, 5, 8, 5, 9, "red");
       Shape cn = new Rectangle(6, 3, 4, 5, "White");
       Shape vuong = new Square(2, 1, 4, "Black");
       Layer layer1 = new Layer();
       layer1.add(tron1);
       layer1.add(tg1);
       layer1.add(tg2);
       layer1.add(tg3);
       layer1.add(cn);
       layer1.add(vuong);
       layer1.getInfo();
       layer1.deleteTriangle();
       layer1.getInfo();
       Layer layer2 = new Layer();
       layer2.add(tron1);
       layer2.add(tron2);
       layer2.add(tron3);
       layer2.add(tron4);
       layer2.add(tron5);
       Diagram dg = new Diagram();
       dg.add(layer1);
       dg.add(layer2);
       dg.getInfo();
       dg.deleteCircle();
       dg.getInfo();
    
    }
    
    
}
