/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt4;
import java.util.Arrays;
/**
 *
 * @author Tommmm^^
 */
public class BT4 {

     public int Max(int a, int b){
        if (a > b) return a;
        else return b;
    }
    public int MinArr(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }
    public  String BMI(double weight, double height){
        double BMI = weight / (height * height);
        if (BMI < 18.5){
            return "Thieu can";
        }
        else if (BMI >= 18.5 && BMI < 23){
            return "Binh thuong";
        }
        else if(BMI >= 23 && BMI < 25){
            return "Thua can";
        }
        else {
            return "Beo phi";
        }
    }
    
}
