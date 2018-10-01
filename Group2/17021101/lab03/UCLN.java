package com.company;

import java.util.Scanner;

public class UCLN {
    public void UCLN(int a,int b){
        if(a<0) a=-a;
        if(b<0) b=-b;
        while ((a != b)) {
            if(a>b){
                a-=b;
            }else {
                b-=a;
            }
        }
        System.out.println(a);

    }
    public void Fibonaxi(int n){
        int f0 =0;
        int f1=1;
        int fn =1;
        if(n<0){
            return ;
        }
        else if(n==0){
            fn=0;
        }
        else if(n==1){
            fn=1;
        }
        else{
            for(int i=2;i<n;i++){
                f0=f1;
                f1=fn;
                fn=f0+f1;
            }
        }

        System.out.println(fn);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a =scan.nextInt();
        int b=scan.nextInt();
        int n=scan.nextInt();
        scan.close();
        UCLN sv = new UCLN();
        sv.UCLN(a,b);
        sv.Fibonaxi(n);
    }
}