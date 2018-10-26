/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package okmen;

/**
 *
 * @author VIETTEL
 */
public class Triangle extends Shape{
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
        System.out.println("Nhap toa do a: ");
        a = super.scan.nextInt();
        System.out.println("Nhap toa do b: ");
        b = super.scan.nextInt();
        System.out.println("Nhap toa do c: ");
        c = super.scan.nextInt();
    }
    
    @Override
    public void outputtoado(){
//        super.output();
        System.out.println("toa do cua Triangle: " +"("+" "+ a + " "+b +" "+c+")");
        System.out.println("kich thuoc la: " + a*b*c);
    }
    
}
