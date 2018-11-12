package oop_t10_b2;

public class OOP_T10_B2 {
    public static void sort(double[] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 1; j < arr.length - i; j++ ){
                if (arr[j-1]>arr[j]){
                    double t = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = t;
                }
            }
        }
        for (int i = 0; i < 100; i++){
            System.out.println(i +" "+ (double)Math.round(arr[i]*100)/100);
        }
    }
    public static void main(String[] args) {
        double[] arr = new double[1000];
        for (int i = 0; i < 1000; i++){
            arr[i] = Math.random()*1000 + 1;
        }
        sort(arr);
    }
    
}
