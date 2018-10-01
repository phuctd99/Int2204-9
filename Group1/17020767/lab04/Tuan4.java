/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lap4;

/**
 *
 * @author admin
 */
import java.util.*;
import java.math.*;
 
public class Tuan4 {                                //tìm Max trong 2 số
    
    public static int Max(int a, int b){
        if(a > b) return a;                         //so sánh 2 số
        else return b;
    }
    
    public static int minArr(int[] arr){                   //Tìm min của một mảng
        int min = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < min) min = arr[i];         //so sánh từng phần tử với phần tử nhỏ nhất tìm được trước đó
        }
        return min;
        
    }
    
    public String BMI(float a, float b){
        double tinh = (b / Math.pow(a , 2));          //Tính chỉ số BMI
        if (tinh < 18.5) return "Thieu Can";                                //
        else if ((tinh >= 18.5) && (tinh < 23)) return "Binh Thuong";       //Phân loại chỉ số BMI
        else if ((tinh >= 23) && (tinh <= 25)) return "Thua Can";           //
        else return "Beo Phi";                                              //
    }
}
