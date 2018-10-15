/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author Pc
 */
public class Triangle extends Shape {
    protected int a ,b ,c;
    
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    
    @Override
    public void inputtoado(){
//        super.input();
        System.out.println("Nhap toado a: ");
        a = super.scan.nextInt();
        System.out.println("Nhap toado b: ");
        b = super.scan.nextInt();
        System.out.println("Nhap toado c: ");
        c = super.scan.nextInt();
    }
    
    @Override
    public void outputtoado(){
//        super.output();
        System.out.println("toado cua Triangle: " +"("+" "+ a + " "+b +" "+c+")");
        System.out.println("kich thuoc la:" + a*b*c);
    }
    
}
