/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author CACLV
 */
public class Point {
    double x_, y_; // tọa độ x, y trên hệ tọa độ 

    // contructor có tham số truyền vào
    public Point(double x_, double y_) {
        this.x_ = x_;
        this.y_ = y_;
    }

    // các phương thức get/set
    public double getX_() {
        return x_;
    }

    public void setX_(double x_) {
        this.x_ = x_;
    }

    public double getY_() {
        return y_;
    }

    public void setY_(double y_) {
        this.y_ = y_;
    }
    
    // hàm trả về khoảng cách giữa hai điểm
    public double distance(Point p1){
        return Math.sqrt((this.x_ - p1.x_) * (this.x_ - p1.x_) + (this.y_ - p1.y_) * (this.y_ - p1.y_) );
    }
    
    // hàm kiểm tra xem ba điểm có thẳng hàng hay không
    public boolean checkOneLine(Point p1, Point p2){
        double a = this.distance(p1), b = this.distance(p2), c = p1.distance(p2);
        return (a + b == c) || (a + c == b) || (b + c == a);
    }
    
    // hàm main test thử
    public static void main(String[] args) {
        Point p1 = new Point(0,1);
        Point p2 = new Point(2,1);
        Point p3 = new Point(0,3);
        System.out.println("the distance between two points p1 and p2 is " + p1.distance(p2) + " units in length");
        System.out.println("Points p1 and p2 and p3 lie on a straight line: " + p1.checkOneLine(p3, p2));
    }
}
