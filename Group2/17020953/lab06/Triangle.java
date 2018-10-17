/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author Admin
 */
public class Triangle extends Shape {
    private toaDo A, B, C;
    //setter/getter
    public toaDo getA() {
        return A;
    }

    public void setA(toaDo a) {
        A = a;
    }

    public toaDo getB() {
        return B;
    }

    public void setB(toaDo b) {
        B = b;
    }

    public toaDo getC() {
        return C;
    }

    public void setC(toaDo c) {
        C = c;
    }
    //Khởi tạo
    public Triangle(toaDo A, toaDo B, toaDo C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }
    public Triangle(toaDo A, toaDo B, toaDo C, String color, boolean filler) {
        super(color, filler);
        this.A = A;
        this.B = B;
        this.C = C;
    }

    //tính diên tích
    public double getArea() {
        double p = (A.distance(B) + B.distance(C) + A.distance(C)) / 2;
        double heron = p * (p - A.distance(B)) * (p - B.distance(C)) * (p - A.distance(C)); //Công thức He-ron;
        heron  = Math.sqrt(heron);
        return heron;
    }
    //tính chu vi
    public double getPerimeter() {
        return( A.distance(B) + B.distance(C) + A.distance(C) );
    }

    @Override
    public String toString() {
        return "Diện tích: " + this.getArea() + " | Chu vi: " + this.getPerimeter() + " | " + super.toString();
    }
}