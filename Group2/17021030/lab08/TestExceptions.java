package lab08;

import java.io.File;
import java.io.FileNotFoundException;

public class TestExceptions {
    
    static void NullPointer(String str) throws NullPointerException {
        if(str == null) {
            System.out.println("Inside NullPointer(String str)");
            throw new NullPointerException();
        }
        else System.out.println(str);
    }
    
    static void ArrayIndexOutBound(int[] arr, int i) throws ArrayIndexOutOfBoundsException {
        if (i >= arr.length) {
            System.out.println("Inside ArrayIndexOutBound(int[] arr, int i)");
            throw new ArrayIndexOutOfBoundsException();
        }
        else System.out.println(arr[i]);
    }
    
    static void Arithmetic(double a, double b) throws ArithmeticException {
        if (b == 0) {
            System.out.println("Inside Arithmetic(double a, double b)");
            throw new ArithmeticException();
        }
        else System.out.println(a / b);
    }
    
    static void FileNotFound(String filename) throws FileNotFoundException {
        File file = new File(filename);
        if (!file.exists()) {
            System.out.println("Inside FileNotFound(String filename)");
            throw new FileNotFoundException();
        }
        else System.out.println("File already exists");
    }
    
    static void ClassCast() throws ClassCastException {
        try {
            Object dog = new Dog();
            Rectangle rec = (Rectangle)dog;
        } catch (ClassCastException e) {
            throw new ClassCastException();
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        try {
            NullPointer(null);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException in main!");
        }
        
        try {
            ArrayIndexOutBound(arr, 10);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException in main!");
        }
        
        try {
            Arithmetic(3, 0);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException in main!");
        }
        
        try {
            FileNotFound("abcxyz.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Caught FileNotFoundException in main!");
        }
        
        try {
            ClassCast();
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException in main!");
        }
        
    }
}

// hai class phu de kiem tra ClassCastException
class Dog {
    private String name;
    public void bark() {
        System.out.println("Gou gou");
    }
}

class Rectangle {
    private double length;
    private double width;
}