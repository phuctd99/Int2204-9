/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap04;

/**
 *
 * @author Hoang Vu Huong
 */
public class Lap04 {
    public static  int MAX(int x, int y){
        if(x >= y)
            return x;
        else
            if(x < y )
                return y;
        return 0;
    }
    public static int Minarr(int[] a){
        int MIN = a[0];
        for(int i = 1; i < a.length; i++){
            if(MIN > a[i])
                MIN = a[i];
        }
        return MIN;
    }
    public static void BMI(float cannang, float chieucao) {
        float BMI = cannang/(chieucao * chieucao);
        if(BMI < 18.5F)
            System.out.println("Thiếu cân");
        else
            if(BMI >= 18.5F && BMI < 23.0F )
                System.out.println("Bình Thường");
        else
            if(BMI >=23.0F && BMI <= 25.0F)
                System.out.println("Thừa cân");
            else
                if(BMI > 25.0F)
                    System.out.println("Béo phì");
    }
    public static void main(String[] args) {
	// write your code here
        System.out.println(MAX(4,7));
    }
}

