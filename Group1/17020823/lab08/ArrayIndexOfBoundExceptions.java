/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau2;
import java.lang.ArrayIndexOutOfBoundsException;
import java.util.Scanner;
/**
 *
 * @author Hoang Vu Huong
 */
public class ArrayIndexOfBoundExceptions {
    public static void PrintArr(int[] arr) throws ArrayIndexOutOfBoundsException
    {
        int i;
        Scanner scan = new Scanner(System.in);
        i= scan.nextInt();
        
            System.out.println(arr[i]);
        
    }
    public static void main(String[] args) {
        int[] arr = new int[10];
        try{
        PrintArr(arr);
        }catch(ArrayIndexOutOfBoundsException a){
            System.err.println("Vuot qua kich co mang");
        }
    }
}
