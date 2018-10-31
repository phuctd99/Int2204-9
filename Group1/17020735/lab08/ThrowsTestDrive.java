/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Admin
 */
public class ThrowsTestDrive {
    private static String filepath = "C:\\Users\\nikos\\Desktop\\file.txt";
    public void nullPointerException(Object object) throws NullPointerException {
        System.out.println(object.hashCode());
    }
    public void arrayIndexOfBoundException(int arr[]) throws  ArrayIndexOutOfBoundsException {
        System.out.println(arr[arr.length + 1]);
    }
    public void arithmeticException(int a) throws ArithmeticException {
        System.out.println(a / 0);
    }
    public void classCastException(Object object) throws ClassCastException {
        System.out.println((String) object);
    }
    public void fileNotFoundException() throws FileNotFoundException {
        BufferedReader bufferedReader;
        bufferedReader = new BufferedReader(new FileReader(filepath));
    }
    public void iOException() throws IOException {
        FileReader fileReader = new FileReader("test.txt");
    }
    public static void main(String[] args) throws FileNotFoundException, IOException {
        ThrowsTestDrive throwsTestDrive = new ThrowsTestDrive();
        try {
            throwsTestDrive.nullPointerException(new Object());
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        try {
            throwsTestDrive.arrayIndexOfBoundException(new int[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        try {
            throwsTestDrive.arithmeticException(5);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        try {
            throwsTestDrive.classCastException(new Object());
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
        try {
            throwsTestDrive.fileNotFoundException();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            throwsTestDrive.iOException();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
    }
}
