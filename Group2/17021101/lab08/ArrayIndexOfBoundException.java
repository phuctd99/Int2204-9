package com.company;

public class ArrayIndexOfBoundException {
    public void ArrayIndexOfBoundException(int[] a, int n)
    {
        try{
            a[n]=0;
        }
        catch (ArrayIndexOutOfBoundsException A){
            System.out.println(A);
        }
    }
}
