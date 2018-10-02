package com.company;

public class Main {

    public static int GTLN(int a,int b) {
        if (a>b) return a;
        else return b;
    }

    public static int GTNN(int[] a) {
        int min= Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]<min) min =a[i];
        }
        return min;
    }

    public static String BMI(double canNang, double chieuCao) {
        String s = new String();
        double BMI = canNang/(chieuCao*chieuCao);
        if(BMI<18.5) s=("Thiếu cân");
        else if(BMI<23) s=("Bình thường");
        else if(BMI<24.99) s=("Thừa cân");
        else s=("Béo phì");
        return s;
    }

    public static void main(String[] args) {
        System.out.println(BMI(60,1.58));
        System.out.println(BMI(56,1.60));
        System.out.println(BMI(65,1.67));
        System.out.println(BMI(40,1.65));
        System.out.println(BMI(120,1.7));
    }
}
