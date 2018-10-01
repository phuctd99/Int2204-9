package com.company;

public class Function {
    public static int max(int a, int b) {
        return a > b ? a : b;
    }
    public static int minOfArray(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
    static String BMI(double weight, double height) {
        double BMI = weight / (height * height);
        if (BMI > 25) {
            return "Béo phì";
        } else if (BMI > 23){
            return "Thừa cân";
        } else if (BMI > 18.5) {
            return "Bình thường";
        } else {
            return "Thiếu cân";
        }
    }
}
