/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX2;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author Admin
 */
public class Test {
    public static void test1() throws ArithmeticException {
		System.out.println(1/0);
		throw new ArithmeticException();
	}
 	public static void test2() throws ClassCastException {
		Object obj = "Hello";
		Integer num = (Integer) obj;
		throw new ClassCastException();
	}
 	public static void test3(String s) throws NullPointerException {
		s = s.toUpperCase();
		throw new NullPointerException();
	}
 	public static void test4() throws ArrayIndexOutOfBoundsException {
		int[] arr = {0, 1};
		System.out.println(arr[3]);
		throw new ArrayIndexOutOfBoundsException();
	}
	public static void test5() throws Exception {
		FileReader fr = new FileReader("test.txt");
		fr.read();
		throw new Exception();
	}
	public static void main(String[] args) {
		try {
			test1();
		} catch (Exception e) {
                        System.out.println("Error : " + e);
		}
 		try {
			test2();
		} catch (Exception e) {
			 System.out.println("Error : " + e);
		}
 		try {
			test3(null);
		} catch (Exception e) {
			 System.out.println("Error : " + e);
		}
		
		try {
			test4();
		} catch (Exception e) {
			 System.out.println("Error : " + e);
		}
		
		try {
			test5();
		} catch (Exception e) {
			 System.out.println("Error : " + e);
		}
	}
}
