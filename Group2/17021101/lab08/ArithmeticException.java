package com.company;

public class ArithmeticException  {
    public void ArithmeticException(int a, int b) {
        try{
            int n = a/b;
            System.out.println(n);
        }
        catch (java.lang.ArithmeticException e ){
            System.out.println(e);
        }
    }
}
