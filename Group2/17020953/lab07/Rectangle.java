/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author Admin
 */
public class Rectangle extends Shape {
    private toaDo A, B, C, D;

    public Rectangle() {
        this.A = new toaDo(0, 0);
        this.B = new toaDo(0, 0);
        this.C = new toaDo(0, 0);
        this.D = new toaDo(0, 0);
    }

    public Rectangle(toaDo A, toaDo B, toaDo C, toaDo D) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }

    public Rectangle(toaDo A, toaDo B, toaDo C, toaDo D, String c, boolean f) {
        super(c, f);
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }

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

    public toaDo getD() {
        return D;
    }

    public void setD(toaDo d) {
        D = d;
    }

    public double getArea() {
        return (A.distance(B)) * (B.distance(C));
    }

    public double getPerimeter() {
        return 2 * (A.distance(B) + C.distance(B));
    }
     public boolean  sameRectangle(Rectangle r){
       if(r.getA().same(this.A) == true && r.getB().same(this.B) == true
          && r.getC().same(this.C) == true && r.getD().same(this.D) == true) return true ;
       else return false ;
    }
    @Override
    public String toString() {
        return "Diện tích: " + this.getArea() + " | Chu vi: " + this.getPerimeter() + " | " + super.toString();
    }
  
   }
