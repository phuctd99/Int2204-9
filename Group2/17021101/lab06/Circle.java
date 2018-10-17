package com.company;

import java.util.Scanner;

public class Circle extends Shape{
    private String ten = "hinh tron";
    private double banKinh=0;

    public double getBanKinh() {
        return banKinh;
    }

    public String getTen() {
        return ten;
    }

    public void setBanKinh() {
        System.out.println("nhap ban kinh"+" "+getTen());
        double banKinh;
        Scanner s = new Scanner(System.in);
        banKinh= s.nextDouble();
        this.banKinh = banKinh;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    public void nhapDuLieu(){
        setToaDo();
        setMauSac();
        setBanKinh();
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
        System.out.println("toa do tam hinh tron "+getToaDo()[0]+" "+getToaDo()[1]);
        System.out.println("mau  sac "+getTen()+": "+getMauSac());
        System.out.println("do dai ban kinh "+getTen()+": "+banKinh);
        System.out.println();
    }
}
