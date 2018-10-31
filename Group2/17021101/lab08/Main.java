package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Queue;

public class Main {
	public static void  NullPointerException(int[] a) throws NullPointerException{
		try {
			System.out.println(a.length);
		}
		catch(NullPointerException N){
			System.out.println(N);
		}
	}

	public static void ArithmeticException(int a, int b) throws java.lang.ArithmeticException {
		try{
			int n = a/b;
			System.out.println(n);
		}
		catch (java.lang.ArithmeticException e ){
			System.out.println(e);
		}
	}
	public static void ClassCastException() throws ClassCastException{
		ArrayList<Integer> a = new ArrayList<>();
		try {
			Queue<Integer> b = (Queue)a;
		} catch (java.lang.ClassCastException e) {
			System.out.println(e);
		}
	}
	public static void IOException (String name) throws IOException {
		try {
			FileReader fw = new FileReader(name);
		} catch (java.io.IOException e) {
			System.out.println(e);
		}
	}
	public static void FileNotFoundException(String name) throws java.io.FileNotFoundException {
		try {
			FileReader fw = new FileReader(name);
		} catch (java.io.FileNotFoundException e) {
			System.out.println(e);
		}
	}
	public static void ArrayIndexOfBoundException(int[] a, int n) throws ArrayIndexOutOfBoundsException
	{
		try{
			a[n]=0;
		}
		catch (ArrayIndexOutOfBoundsException A){
			System.out.println(A);
		}
	}
    public static void main(String[] args) throws IOException, ClassCastException {
//	 nullPointerException n = new nullPointerException();
//	 ArrayIndexOfBoundException arr = new ArrayIndexOfBoundException();
//	 ArithmeticException ari = new ArithmeticException();
//	 ClassCastException c = new ClassCastException();
//	 IOException i = new IOException();
//	 FileNotFoundException f = new FileNotFoundException();
	 int[] a = {1,2,3};
	 int[] b = null;
	 String name = "t.txt";
	 NullPointerException(b);
	 ArrayIndexOfBoundException(a,9);
	 ArithmeticException(19,0);
	 ClassCastException();
	 IOException(name);
	 FileNotFoundException(name);
    }
}
