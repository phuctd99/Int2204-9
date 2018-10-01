/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan4;

/**
 *
 * @author CCNE
 */
public class Tuan4 {
    public static int max(int a , int b) {
        if (a > b) return a ;
        else return b ;
    }
    
    public static int minarr(int arr[]) {
        int size = arr.length ;
        int min = arr[0] ;
        for (int i = 1 ; i < size ; i++) {
            if (arr[i] < min) min = arr[i] ;
        }
        return min ;
    }
    
    public static String bmi(double a , double b) {
    double c = a/(b*b) ;
        if( c < 18.5 ) return "THIEU CAN";
        else if (18.5 <= c && c < 22.99) return "BINH THUONG";
        else if(23 <= c && c <= 24.99) return "THUA CAN";
        else return "BEO PHI";
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
