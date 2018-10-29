import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Exceptions {
    static void nullPointer(String str) throws NullPointerException {
            System.out.println(str);
    }
    static void arrayIndexOutOfBound(int[] arr, int n) throws ArrayIndexOutOfBoundsException {
            System.out.println(arr[n]);
    }

    static void arithmetic(int x, int y) throws ArithmeticException {
            System.out.println((double)x/y);
    }
    static void classCast() throws ClassCastException {
        try{
            Object x = Integer.valueOf(32);
            String str = (String)x;
        }catch (ClassCastException e){
            throw new ClassCastException();
        }
    }
    static void io() throws IOException {
        Scanner scr = new Scanner(System.in);
        char c = scr.next().charAt(0);
        if (c == 'r'){
            throw new IOException();
        }else{
            System.out.println("You've typed \'" + c + "\'!");
        }
    }
    static void fileNotFound(String path) throws FileNotFoundException{
        File f = new File(path);
        if (!f.exists()){
            throw new FileNotFoundException();
        }else{
            System.out.println("File is existed!");
        }
    }
    public static void main(String[] args) {
        int[] a = new int[]{0,1,2,3,4,5};
        try{
            nullPointer(null);
        }catch (NullPointerException e){
            System.out.println("Catched null pointer!");
        }

        try{
            arrayIndexOutOfBound(a,6);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Catched array index out of bound!");
        }

        try{
            arithmetic(1,0);
        }catch (ArithmeticException e){
            System.out.println("Catched arithmetic!");
        }

        try{
            classCast();
        }catch (ClassCastException e){
            System.out.println("Catched class cast!");
        }

        try{
            io();
        }catch (IOException e){
            System.out.println("Catched io!");
        }

        try {
            fileNotFound("C:\\Python27\\NEWS1.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Catch file not found!");
        }
    }
}
