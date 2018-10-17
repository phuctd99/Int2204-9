package com.company;

import java.util.Scanner;

public class Triangle extends Shape{
    private String ten = "hinh tam giac";
    private double[] doDaiCanh = {0,0,0};
    public void setDoDaiCanh() {
        System.out.println("nhap toa do"+" "+getTen());
        double x,y,z;
        Scanner s = new Scanner(System.in);
        x = s.nextDouble();
        y = s.nextDouble();
        z = s.nextDouble();
        double[] doDaiCanh = {x,y,z};
        this.doDaiCanh = doDaiCanh;
    }

    public double[] getDoDaiCanh() {
        return doDaiCanh;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTen() {
        return ten;
    }
    public void nhapDuLieu(){
        setToaDo();
        setMauSac();
        setDoDaiCanh();
    }
    public void cout(){
//        double[][] a = getToaDo();
//        for (int i=0;i<a.length;i++)
//        {
//            for(int j=0;j<2;j++)
//            {
//                System.out.print("toa do diem " + i+": "+a[i][j]);
//            }
//            System.out.println();
//        }
        System.out.println("toa do hing tam giac "+getToaDo()[0]+" "+getToaDo()[1]);
        System.out.println("mau  sac "+getTen()+": "+getMauSac());
        System.out.println("do dai ba canh "+getTen()+": "+doDaiCanh[0]+" "+doDaiCanh[1]+" "+doDaiCanh[2]);
        System.out.println();
    }
}
