/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPlab4;

import java.util.Arrays;

/**
 *
 * @author nguyenhuy
 */
public class lab04 {

    static int max(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }

    static int min(int[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

    static String BMI(double w, double h) {
        Double Bmi = w / Math.pow(h, 2);
        String[] arr = {"Thiếu cân", "Bình thường", "Thừa cân", "Béo phì"};
        if (Bmi < 18.5) {
            return arr[0];
        } else if (Bmi >= 18.5 && Bmi <= 22.99) {
            return arr[1];
        } else if (Bmi > 22.99 && Bmi <= 24.99) {
            return arr[2];
        } else {
            return arr[3];
        }
    }
}
