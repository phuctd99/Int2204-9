package com.company;

public class Main {
    public  static  int Max ( int a, int b){
        if( a > b ){
            return  a;
        }
        else return b;
    }
    public  static  int minArray ( int a[]){
        int min = a[0];
        for(int i = 0; i < a.length; i++){
            if( a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }
    public  static String BMI( double weight, double heigh){
        double bmi = weight / ( heigh * heigh );
        if( bmi < 18.5) return "Thieu can";
        if( bmi >= 18.5 && bmi <23) return  "Binh thuong";
        if( bmi >=23 && bmi < 25 ) return "Thua can";
       else return "Beo phi";
    }

}
