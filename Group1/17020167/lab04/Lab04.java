/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;

/**
 *
 * @author Admin
 */
public class Lab04 {

    //ham tinh gia tri lon nhat cua hai so nguyen
    public static int maxoftwo(int a,int b) {
        if(a>=b) return a;
        return b;
    }
    
    //ham tinh gia be nhat cua mang
    public static int minofarr(int []a, int n) {
        int min=a[0];
        for(int i=0; i<n; i++) {
            if(a[i]<min) min=a[i];
        }
        return min;
    }
    
    //ham tinh BMI
    public static String BMI(double w, double h) {
        double BMI=w/(h*h);
        if(BMI<18.5) {
            return "Thieu can";
        }
        else if(BMI<23) {
            return "Binh thuong";
        }
        else if(BMI>=23&&BMI<25) {
            return "Thua can";
        }
        else {
            return "Beo phi";
        }
    }
    
    public static void main(String[] args) {
        //check ham gia tri be nhat cua hai so nguyen
        //System.out.println("Gia tri lon nhat cua 2 va 3 la " +maxoftwo(2, 3));
        //check ham gia tri nho nhat cua ham
        //int arr[]={1,2,3,4,0};
      //  System.out.println("Gia tri be nhat cua mang la " + minofarr(arr, arr.length));
        //check ham BMI
       // BMI(40,1.4);
    }
    
}
