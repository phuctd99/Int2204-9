package com.company;

import sun.plugin2.message.ShowStatusMessage;

import java.util.Scanner;

public class Square extends Shape {
    private String ten = "hinh vuong";
    private double rong=0;

    public void setRong() {
        System.out.println("nhap mau sac"+" "+getTen());
        double rong;
        Scanner s = new Scanner(System.in);
        rong= s.nextDouble();
        this.rong = rong;
    }

    public double getRong() {
        return rong;
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
        setRong();
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
        System.out.println("toa do hinh vuong "+getToaDo()[0]+" "+getToaDo()[1]);
        System.out.println("mau  sac "+getTen()+": "+getMauSac());
        System.out.println("chieu rong "+getTen()+": "+getRong());
        System.out.println();
    }
}
