package com.company;

import java.util.*;

public class Main {

    public static <T extends Comparable<T>> void bubbleSort(T[] a) {

        Arrays.sort(a);
    }

    public static <T extends  Comparable<T>> T max(List<T> list) {
        return Collections.max(list);
    }

    public static void main(String[] args) {
	// write your code here

        Double[] arr = new Double[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random() * 1000;
        }
        bubbleSort(arr);
        for (Double num : arr) {
            System.out.printf("%.2f ", num);
        }
        System.out.println();
        System.out.println("--------------------------------------------");

        //////////////////////////////////

        Integer[] arrInt = new Integer[1000];
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = (int)(Math.random() * 1000);
        }
        bubbleSort(arrInt);
        for (Integer num : arrInt) {
            System.out.print(num + " ");
        }
        ///////////////////////////////
        System.out.println();
        System.out.println("--------------------------------------------");


        ///////////////////////////////////

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arrInt.length; i++) {
            list.add(arrInt[i]);
        }
        System.out.println(max(list));

        PS psArray[] = new PS[5];
        psArray[0] = new PS(1, 2);
        psArray[1] = new PS(3, 4);
        psArray[2] = new PS(-2, 3);
        psArray[3] = new PS(-9, 5);
        psArray[4] = new PS(-1, 5);

        bubbleSort(psArray);

        for (PS ps : psArray) {
            System.out.println(ps);
        }
    }

}
