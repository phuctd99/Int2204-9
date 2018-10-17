package com.company;

import java.util.Scanner;

public class Rectangle extends Shape{

    private double dai=0,rong=0;
    private String ten = "hinh chu nhat";
    public void setDai() {
        System.out.println("nhap chieu dai"+" "+getTen());
        double dai;
        Scanner s = new Scanner(System.in);
        dai= s.nextDouble();
        this.dai = dai;
    }

    public void setRong() {
        System.out.println("nhap mau sac"+" "+getTen());
        double rong;
        Scanner s = new Scanner(System.in);
        rong= s.nextDouble();
        this.rong = rong;
    }

    public double getDai() {
        return dai;
    }

    public double getRong() {
        return rong;
    }

    public String getTen() {
        return ten;
    }
    public void nhapDuLieu(){
        setToaDo();
        setMauSac();
        setDai();
        setRong();
    }
   public void cout(){
//       double[][] a = getToaDo();
//       for (int i=0;i<a.length;i++)
//       {
//           for(int j=0;j<2;j++)
//           {
//               System.out.print("toa do diem " + i+": "+a[i][j]);
//           }
//           System.out.println();
//       }
       System.out.println("toa do hinh chu nhat "+getToaDo()[0]+" "+getToaDo()[1]);
        System.out.println("mau  sac "+getTen()+": "+getMauSac());
        System.out.println("chieu dai "+getTen()+": "+getDai());
        System.out.println("chieu rong "+getTen()+": "+getRong());
        System.out.println();
    }
}
