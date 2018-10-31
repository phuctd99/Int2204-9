package com.company;

public class nullPointerException {
    public void nullPointerException(int[] a){
        try {
            System.out.println(a.length);
        }
        catch(NullPointerException N){
            System.out.println(N);
        }
    }
}
