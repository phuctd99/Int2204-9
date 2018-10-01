/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class week4 {
    public static int max(int a,int b)
    {
        if (a > b)
        {
            return a;
        }
        else
            return b;
    }
    public static int minArr(int [] arr)
    {
        int min=arr[0];
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        return min;
    }
    public static String bmi( double weight, double high)
    {
        String sp;
        double bmi = (weight / (high * high));
        if (bmi < 18.5)
        {
            sp="Thieu can";
           
        }
        else if (bmi >=18.5 && bmi <=22.99)
        {
            sp="Binh thuong";
        }
        else if (bmi > 22.99 && bmi <=24.99)
        {
           sp="Thua can";
        }
        else
        {
            sp="Beo phi";
        }
        return sp;
    }
    public static void main (String [] args)
    {
        int a = max(4,2);
        System.out.println(a);
        int b[] = {1,2,5,3,4};
        int c = minArr ( b);
        System.out.println(c);
        //bmi(48,1.57);
        System.out.println(bmi(58,1.57));
    }
    
}
