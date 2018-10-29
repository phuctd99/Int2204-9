package bt2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class testException {


    public static void main(String args[])throws NullPointerException, ArrayIndexOutOfBoundsException,
            ArithmeticException, ClassCastException, IOException, FileNotFoundException {
        //null pointer exception
        String a = null;
        try {
            System.out.println(a.length());
        }
        catch(NullPointerException e){
            System.out.println("Null Pointer Exception!");
        }

        //array of bound exception
        int arr[] = {1, 2, 3, 4};
        try {
            System.out.println(arr[6]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index of bound exception!");
        }

        //arithmetic exception
        try{
            System.out.println(10 / 0);
        }
        catch (ArithmeticException e){
            System.out.println("arithmetic Exception");
        }

        //class cast exception

        try{
            Object i = "Hello";
            System.out.println((int)i);
        }
        catch (ClassCastException e){
            System.out.println("Class cast exception!");
        }

        //IO exception
        try{
            FileInputStream file2 = new FileInputStream("text.text");
        }
        catch (IOException e){
            System.out.println("IO exception!");
        }

        //file not found exception
        try{
            FileInputStream file = new FileInputStream("java.txt");
        }
        catch (FileNotFoundException e){
            System.out.println("file not found exception!");
        }

    }
}
