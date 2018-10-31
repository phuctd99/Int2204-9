/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab08;
//import java.lang.*;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class NullPointerExp {
    public static void method(String str) throws NullPointerException{

        if(str == null) System.out.println("chuỗi bị rỗng!!!");
        else {
            System.out.println("Chuỗi"+ str +" có hash Code là " + str.hashCode());
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập chuỗi");
        String str = scan.nextLine();
        method(str);
        str = null;
        method(str);
    }
}
