/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagram;

/**
 *
 * @author pc
 */
public class triangle extends shape{
    private double a;
    private double b;
    private double c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public void input(){
        super.input();
        System.out.println("nhap do dai 3 canh");
        setA(super.scan.nextDouble());
        setB(super.scan.nextDouble());
        setC(super.scan.nextDouble());
    }
    public void output(){
        super.output();
        System.out.println("do dai 3 canh cua hinh tam giac la");
        System.out.println(getA() +" "+ getB()+ " " + getC());
    }
}
