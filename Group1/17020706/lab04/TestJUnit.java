/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjunit;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Giang
 */
public class TestJUnit {

    /**
     * @param args the command line arguments
     */
    static Scanner scan = new Scanner(System.in);

    public static int solonnhat(int a, int b) {
        if (a > b || a == b) return a;
        else return b;
    }

    static int mincuaMang(int[] ar) {
        int dai = ar.length;
        int Min = ar[0];
        for (int i = 0; i < dai; i++) {
            if (Min > ar[i]) Min = ar[i];
        }
        return Min;
    }

    static String bmi(double cao, double nang) {
        double chiso = nang / (cao * cao);
        if (chiso < 18.5) return "Thieu can";
        else if (chiso >= 18.5 && chiso <= 22.99)
            return "Binh thuong";
        else if (chiso >= 23 && chiso <= 24.99)
            return "Thua can";
        else if (chiso > 25) return  "Beo phi";
        return null;
    }
}
