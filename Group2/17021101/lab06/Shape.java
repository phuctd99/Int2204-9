package com.company;

import java.util.Scanner;

abstract class Shape extends Layer{
    //private double toaDo[][] ;
    private double toaDo[] = {0.0,0.0};
    private String mauSac = "Trang";
    private String ten;

    public void setMauSac() {
        System.out.println("nhap mau sac"+" ");
        String mauSac;
        Scanner s = new Scanner(System.in);
        mauSac= s.nextLine();
        this.mauSac = mauSac;
    }

    public void setToaDo() {
        System.out.println("nhap toa do ");
        double a,b;
        Scanner s =new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        double[] toaDo = {a,b};
        this.toaDo = toaDo;
    }
    public String getMauSac() {
        return mauSac;
    }

    public double[] getToaDo() {
        return toaDo;
    }

    public String getTen() {
        return ten;
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
        System.out.println("mau  sac"+" "+getTen()+" "+getMauSac());
    }
}

