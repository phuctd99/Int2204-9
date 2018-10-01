/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author nguyenhuy
 */
public class Fraction {

    private int TS;
    private int MS;
    //Khởi tạo không cần biến đầu vào
    public Fraction() {
        this.TS = 0;
        this.MS = 0;
    }
    //Khởi tạo có biến đầu vào
    public Fraction(int ts, int ms) {
        this.TS = ts;
        this.MS = ms;
    }

    //thay đổi giá trị của F
    public Fraction sum(Fraction f1) {
        this.TS = this.TS * f1.MS + this.MS * f1.TS;
        this.MS = this.MS * f1.MS;
        return this;
    }
    
    //thay đổi giá trị của F
    public Fraction sub(Fraction f1) {
        this.TS = this.TS * f1.MS - this.MS * f1.TS;
        this.MS = this.MS * f1.MS;
        return this;
    }
    
    //thay đổi giá trị của F
    public Fraction multi(Fraction f1) {
        this.TS = this.TS * f1.TS;
        this.MS = this.MS * f1.MS;
        return this;
    }

    //thay đổi giá trị của F
    public Fraction division(Fraction f1) {
        this.TS = this.TS * f1.MS;
        this.MS = this.MS * f1.TS;
        return this;
    }
    
    //không thay đổi giá trị của F
    public Fraction sumc(Fraction f1) {
        Fraction f2 = new Fraction();
        f2.TS = this.TS * f1.MS + this.MS * f1.TS;
        f2.MS = this.MS * f1.MS;
        return f2;
    }
    
    //không thay đổi giá trị của F
    public Fraction subc(Fraction f1) {
        Fraction f2 = new Fraction();
        f2.TS = this.TS * f1.MS - this.MS * f1.TS;
        f2.MS = this.MS * f1.MS;
        return f2;
    }
    
    //không thay đổi giá trị của F
    public Fraction multic(Fraction f1) {
        Fraction f2 = new Fraction();
        f2.TS = this.TS * f1.TS;
        f2.MS = this.MS * f1.MS;
        return f2;
    }
    
    //không thay đổi giá trị của F
    public Fraction divisionc(Fraction f1) {
        Fraction f2 = new Fraction();
        f2.TS = this.TS * f1.MS;
        f2.MS = this.MS * f1.TS;
        return f2;
    }
    public String getFraction() {
       LCM temp = new LCM();
       int lcm = temp.UocChung(TS, MS) ;
        return (this.TS/ lcm + " / " + this.MS/ lcm);
    }

    public boolean equals(Fraction f1) {
        return this.TS * f1.MS == this.MS * f1.TS;
    }

    public static void main(String[] args) {
        Fraction f = new Fraction(2, -3);
        Fraction f1 = new Fraction(2, 3);
        System.out.println(f.getFraction());
//        System.out.println(f.sumc(f1).getFraction());
//        System.out.println(f.equals(f1));
//        System.out.println(f.sum(f1).getFraction());
//        System.out.println(f.equals(f1));
    }
}
