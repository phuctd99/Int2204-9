package com.company;

import java.util.Scanner;

public class Fibonaxi {
    public  int timfibonaci (int n)
    {
        int [] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        for(int i =2; i< n+1;i++)
        {
            arr[i]= arr[i-1]+arr[i-2];
        }
        int t = arr[n];
        return t;
    }

    public static void main(String[] args){
        Fibonaxi p = new Fibonaxi();
        System.out.print(p.timfibonaci(6));
    }
}
