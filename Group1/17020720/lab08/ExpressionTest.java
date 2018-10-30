package ExceptionTuan8;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExpressionTest {

    @Test
    public String toString() {
        return null;
    }

    @Test
    public void evaluate() {
    }

    public static void main(String[] args) throws NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException, ClassCastException, IOException, FileNotFoundException{
        //test ArithmeticException
        Expression n1 = new Numeral(10);//10
        System.out.println("Nhap: " + n1.toString());

        Expression s1 = new Square(n1);//10^2
        System.out.println("Phep tinh: " + s1.toString());
        System.out.println("Ket qua: " + s1.evaluate());

        Expression n2 = new Numeral(0); //0
        System.out.println("Nhap: " + n2.toString());
        Expression x1 = new Division(n2, n1);// 10/0
        System.out.println("Phep tinh: " + x1.toString());

        try {
            int value = x1.evaluate();
            System.out.println(x1.evaluate());
        }catch(ArithmeticException e) {
            System.out.println("Lỗi chia cho 0");
        }

        Expression n3 = new Numeral(1); // 1
        System.out.println("Nhap: " + n3.toString());

        Expression sub1 = new Subtraction(n3, s1); // 10^2 - 1
        System.out.println("Phep tinh: " + sub1.toString());
        System.out.println("Ket qua: " + sub1.evaluate());

        Expression n4 = new Numeral(2); // 2
        System.out.println("Nhap: " + n4.toString());
        Expression n5 = new Numeral(3); // 3
        System.out.println("Nhap: " + n5.toString());
        Expression mul1 = new Multiplication(n5, n4); // 2*3
        System.out.println("Phep tinh: " + mul1.toString());
        System.out.println("Ket qua: " + mul1.evaluate());

        Expression a2 = new Addition(sub1, mul1); //10^2 - 1 + 2*3
        System.out.println("Phep tinh: " + a2.toString());
        System.out.println("Ket qua: " + a2.evaluate());
        Expression s3 = new Square(a2); //(10^2 - 1 + 2*3)^2
        System.out.println("Nhap: " + s3.toString());
        System.out.println("Ket qua: " + s3.evaluate());

        //test NullPointerException
        Method m = new Method();
        String a = m.testMethod();

        try{
            System.out.println(a.length());
        }catch(NullPointerException e){
            System.out.println("Null Pointer Exception");
        }

        //test ArrayIndexOfBoundException
        String[] arr = new String[]{"1", "2", "3", "4", "5"};

        try{
            System.out.println(arr[7]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Of Bound Exception");
        }

        //test ClassCastException
        try {
            System.out.println(m.testClassCast(12.5));
        }catch (ClassCastException e){
            System.out.println("Class Cast Exception");
        }

        //test IOException, FileNotFoundException
        try {
            m.readFile(m.fileName);
        }catch (FileNotFoundException e){
            System.out.println("Find Not Found Exception");
        }catch (IOException e){
            System.out.println("Empty File");
        }

    }
}

