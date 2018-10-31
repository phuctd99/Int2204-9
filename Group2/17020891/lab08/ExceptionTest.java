package com.company;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class ExceptionTest {
    public void nullPointerException(int[] a) throws NullPointerException {
        System.out.println(a.length);
    }

    public void arrayIndexOfBoundException(int[] a) throws ArrayIndexOutOfBoundsException {
        System.out.println(a[a.length]);
    }

    public void arithmeticException() throws  ArithmeticException {
        System.out.println(2/ 0);
    }

    public void classCastException() throws  ClassCastException {
        ArrayList<Integer> list = new ArrayList<>();
        Queue queue = (Queue)list;
    }

    public void testIOException(String path) throws IOException {
        FileWriter writer = new FileWriter(path);
    }

    public void fileNotFoundException(String path) throws FileNotFoundException {
        FileReader scanner = new FileReader(path);
    }

    public static void main(String[] args) {
        ExceptionTest test = new ExceptionTest();


        //test NullPointerException
        try {
            int[] a = null;
            test.nullPointerException(a);
        } catch (NullPointerException e) {
            System.out.println(e);
        }

        try {
            int[] a = {1, 2};
            test.arrayIndexOfBoundException(a);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        try {
            test.classCastException();
        } catch (ClassCastException e) {
            System.out.println(e);
        }


        try {
            test.arithmeticException();
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        try {
            test.testIOException("goodbye.txt");
        } catch (IOException e) {
            System.out.println(e);
        }

        try {
            test.fileNotFoundException("hello.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
