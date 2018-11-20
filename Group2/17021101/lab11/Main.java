package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static <B extends Comparable<B>> void BubbleSort(B[] arr, int n) {
        for (int i = 0;i < n-1; i++) {
            for (int j = n-1; j > i; j--) {
                if (arr[j - 1].compareTo(arr[j])>0) {
                    B temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
    public static <M extends Comparable<M>> void Max(ArrayList<M> arr, int n) {
        M max = arr.get(0);
        for (int i=0;i<n;i++){
            if(max.compareTo(arr.get(i))<0) max=arr.get(i);
        }
        System.out.println();
        System.out.println(max);
    }
    public static < E > void printArray( E[] inputArray )
    {
        for ( E element : inputArray ){
            System.out.printf( "%s ", element );
        }
        System.out.println();
    }

    public static void main(String[] args) {
	    Integer a[]={1,3,5,7,2,4,6};
	    Double b[] = {1.3,1.5,1.7,1.2,1.4,1.6};
	    BubbleSort(a,7);
	    BubbleSort(b,6);
        PS[] ps = new PS[5];
        PS[] p = ps;
        ps[0] = new PS(2,3);
        ps[1] = new PS(1,2);
        ps[2] = new PS(3,4);
        ps[3] = new PS(4,5);
        ps[4] = new PS(6,7);
        System.out.println();
        BubbleSort(ps,5);
	    printArray(a);
        printArray(b);
        for (PS z : ps) {
            System.out.print(z+" ");
        }
        System.out.println();
        System.out.println("-------------------------------------------------------------");
        ArrayList<Integer> A = new ArrayList<Integer>();
        ArrayList<Double> B = new ArrayList<Double>();
        ArrayList<PS> P = new ArrayList<>();
        P.add(new PS(1,2));
        P.add(new PS(3,2));
        P.add(new PS(1,4));
        P.add(new PS(5,2));
        P.add(new PS(1,6));
        Random rd = new Random();
        int r =0;
       for (int i=0;i<10;i++) {
           r = rd.nextInt()%100;
           System.out.print(r + " ");
           A.add(r);
       }
       Max(A,10);
       double t;
        for (int i=0;i<10;i++) {
            t =(double) rd.nextInt() %100/10;
            System.out.print(t + " ");
            B.add(t);
        }
        Max(B,10);
        for(int i=0;i<5;i++){
            System.out.print(P.get(i).toString()+" ");
        }
        Max(P,5);
    }
}
