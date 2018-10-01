package Bai_tap_tuan_04;

import java.util.Arrays;

public class Class_01 {
    // ham tim gia tri lon nhat cua 2 so
    public static int maxValue(int value1, int value2) {
        if( value1 >= value2 ) return value1;
        else return value2;
    }

    // ham tim gia tri nho nhat cua mang so nguyen
    public static int minValueOfArray( int[] arr ){
        int[] arr1 = new int[arr.length];
        arr1 = arr;
        Arrays.sort(arr1);
        return arr1[0];
    }
    // ham tinh chi so BMI
    public static String bmi( double canNang, double chieuCao ) {
        double bmiValue = canNang / (chieuCao * chieuCao );
        if (bmiValue < 18.5 ) return "thieu can";
        else if(bmiValue < 23 ) return "binh thuong";
        else if(bmiValue < 25 ) return "thua can";
        else return  "BEO PHI";


    }




}
