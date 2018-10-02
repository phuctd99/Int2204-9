/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

/**
 *
 * @author CACLV
 */
public class Week4 {

    // hàm trả về số lớn hơn rong hai số
    public static int maxIntdouble(int a, int b) {
        return (a > b) ? a : b;
    }

    // hàm trả về số nguyên nhỏ nhất trong dãy
    public static int minInts(int[] ar) {
        int min = Integer.MAX_VALUE;
        for (int ele : ar) {
            if (min > ele) {
                min = ele;
            }
        }
        return min;
    }

    // hàm kiểm tra tình hình cân nặng
    public static String BMI(double height, double weight) {
        String[] arr1 = {"Bình thường", "Thừa cân", "Béo phì"};
        double[] arr2 = {18.5, 23.0, 25.0};
        double bmi = weight / (height * height);
        for (int i = 2; i >= 0; i--) {
            if (bmi >= arr2[i]) {
                return arr1[i];
            }
        }
        return "Thiếu cân";
    }

    // test
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7};
        System.out.println(minInts(arr));
        System.out.println(BMI(1.6, 64));
    }
}
