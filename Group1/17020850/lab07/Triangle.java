package lab06;

import java.util.Scanner;

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
    public void input(){
        System.out.println("thong tin cua tam giac");
        super.input();
        System.out.println("Nhap a: ");
        a = super.scan.nextInt();
        System.out.println("Nhap b: ");
        b = super.scan.nextInt();
        System.out.println("Nhap c: ");
        c = super.scan.nextInt();
    }

    @Override
    public void output(){
        super.output();
        System.out.println("Chieu dai canh a: " + a);
        System.out.println("Chieu dai canh b: " + b);
        System.out.println("Chieu dai canh c: " + c);
    }

}
