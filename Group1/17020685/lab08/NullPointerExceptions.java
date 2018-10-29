/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_2_tuan_8;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class NullPointerExceptions {
    public static void Null(String str) throws NullPointerException {
        if (str.isEmpty()) {
            System.err.println("Khi truy cập đối tượng null");
            
        } else {
            System.out.println(str);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Null(str);
    }
}
