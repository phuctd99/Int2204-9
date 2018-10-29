package bai2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MainBai2 {
    public static void NullPointEx(String str) throws  NullPointerException {
        if (str.equals(null)) {
            throw new NullPointerException();
        } else {
            System.out.println(str);
        }
    }

    public static void  ArrayIndexOutOfBoundsEx (int[] arr, int i) throws ArrayIndexOutOfBoundsException {
        if (i >= arr.length) {
            throw  new ArrayIndexOutOfBoundsException();
        } else {
            System.out.println(arr[i]);
        }
    }

    static void arithmeticEx (int x, int y) throws ArithmeticException {
        if (y == 0){
            throw new ArithmeticException();
        }else{
            System.out.println((double)x/y);
        }
    }
    static void classCastEx() throws ClassCastException {
        try{
            Object x = Integer.valueOf(32);
            String str = (String)x;
        }catch (ClassCastException e){
            throw new ClassCastException();
        }
    }

    static void ioEx() throws IOException {
        Scanner scr = new Scanner(System.in);
        char c = scr.next().charAt(0);
        if (c == 'r'){
            throw new IOException();
        }else{
            System.out.println("You've typed \'" + c + "\'!");
        }
    }

    static void fileNotFoundEx(String path) throws FileNotFoundException {
        File f = new File(path);
        if (!f.exists()){
            throw new FileNotFoundException();
        }else{
            System.out.println("File is existed!");
        }
    }

    public static void main(String[] args) {
        try{
            NullPointEx(null);
        }catch (NullPointerException e){
            System.out.println("null pointer Exception!");
        }
        int[] arr = new int[]{0,1,9,6,2,5};
        try{
            ArrayIndexOutOfBoundsEx(arr,6);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("array index out of bound Exception!");
        }

        try{
            arithmeticEx(1,0);
        }catch (ArithmeticException e){
            System.out.println("arithmetic Exception!");
        }

        try{
            classCastEx();
        }catch (ClassCastException e){
            System.out.println("class cast Exception!");
        }

        try{
            ioEx();
        }catch (IOException e){
            System.out.println("io Exception!");
        }

        try {
            fileNotFoundEx("C:\\Users\\Admin\\workspace\\Hello.txt");
        } catch (FileNotFoundException e) {
            System.out.println("file not found Exception!");
        }
    }
}

