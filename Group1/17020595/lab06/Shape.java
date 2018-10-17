/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_t6;

/**
 *
 * @author Administrator
 */
public class Shape {
    public String color;
    public double r;
    public double a, b, c;
    public double x,y;
    public void Diem(int x_,int y_){
        this.x = x_;
        this.y = y_;
        
    }
    Shape (double r_){
        this.r = r_;
    }

    Shape (double a_,double b_, double c_) {
        this.a = a_;
        this.b = b_;
        this.c = c_;
    }
    Shape (double a_,double b_){
        this.a = a_;
        this.b = b_;
    }
    
    Circle cir = new Circle();
    Trianghle tri = new Trianghle();
    Square sq = new Square();
    Rectangle rec = new Rectangle();
    
    Shape() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void DienTichCir(){
        cir.setR(r);
        System.out.println(cir.dienTich());
    }
    public void ChuViTri(){
        tri.setA(a);
        tri.setB(b);
        tri.setC(c);
        System.out.println(tri.chuVi());
    }
    public void DienTichQu(){
        sq.setA(r);
        System.out.println(sq.dienTinh());
        
    }
    public void DienTichRec(){
        rec.setA(a);
        rec.setB(b);
        System.out.println(rec.dienTich());
    }

    
}
