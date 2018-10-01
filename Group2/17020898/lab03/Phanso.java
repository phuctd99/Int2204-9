package com.company;

import java.util.Scanner;

public class Phanso {
    int tuso;
    int mauso;

    public int ucln(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0) return b;
        if (b == 0) return a;
        if (a == b) return a;
        else {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return ucln(a, b);
    }
    public Phanso(){
        tuso = 1;
        mauso = 1;
    }
    public Phanso(int tuso, int mauso) {
        this.tuso = tuso;
        this.mauso = mauso;
    }

    public void Quychuanphanso(Phanso PS) {
        int t = ucln(PS.tuso, PS.mauso);
        PS.tuso = PS.tuso / t;
        PS.mauso = PS.mauso / t;
    }
    public void Tinhtong(Phanso PS1) {

        this.tuso = PS1.tuso * this.mauso + this.tuso * PS1.mauso;
        this.mauso = PS1.mauso * this.mauso;
        Quychuanphanso(this);
    }
    public void Tinhhieu(Phanso PS1) {
        this.tuso = PS1.tuso * this.mauso - this.tuso * PS1.mauso;
        this.mauso = PS1.mauso * this.mauso;
        Quychuanphanso(this);
    }


    public void Tinhtich(Phanso PS1) {
//        Phanso PS = new Phanso();
        this.tuso = PS1.tuso * this.tuso;
        this.mauso = PS1.mauso * this.mauso;
        Quychuanphanso(this);
    }
    public Phanso Tinhthuong(Phanso PS1) {
        this.tuso = PS1.tuso * this.mauso;
        this.mauso = PS1.mauso * this.tuso;
        Quychuanphanso(this);
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Phanso) {
            Phanso ps = (Phanso) obj;
            if (ps.tuso * this.mauso - ps.mauso * this.tuso == 0)
                return true;
            else return false;
        }
        return false;
    }

    public static void main(String[] args) {
        Phanso PS1 = new Phanso(2,3);

        Phanso PS = new Phanso(2,3);
        PS.Tinhtich(PS);
        System.out.print(PS.tuso + "/"+ PS.mauso);
    }
}
