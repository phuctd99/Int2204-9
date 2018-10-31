/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab08;

import java.util.Scanner;
import javax.imageio.ImageIO;

/**
 *
 * @author Admin
 */
public class ArrIndexOutOfBound {
    public static void method(int [] arr, int index) throws ArrayIndexOutOfBoundsException{
        try {
            arr[index] = index;
            System.out.println(index);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Chuỗi đầy");
        }
    }
    public static void main(String[] args) {
        int[] arr = new int [3];
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        method(arr, i);
    }
}
