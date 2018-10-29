package Cau2;

import java.util.Scanner;

public class arrayIndexOfBound {

    public static void exception() throws ArrayIndexOutOfBoundsException {
        Scanner scn = new Scanner(System.in);
        int[] arr = new int[2];
        for( int i=0; i<3; i++) {
            arr[i] = scn.nextInt();
        }
    }

    public static void main(String[] args){
        try{
            exception();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ERROR: ArrayIndexOutOfBoundsException");
        }
    }
}
