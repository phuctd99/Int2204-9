import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Expression e = new Square(new Addition(new Subtraction(new Square(new Numberal(10)), new Numberal(1)), new Multiplication(new Numberal(2), new Numberal(3))));
        System.out.println(e.evaluate());



        try
        {
            Expression t = new Division(new Numberal(3), new Numberal(0));
            t.evaluate();
        }
        catch (ArithmeticException ex)
        {
            System.out.println(ex);
        }


        try
        {
            Double d = null;
            System.out.println(d.toString());
        }
        catch (NullPointerException n)
        {
            System.out.println(n);
        }

        try
        {
            int arr[] = {3};
            System.out.println(arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException arr)
        {
            System.out.println(arr);
        }

        try
        {
            Object s = "123";
            System.out.println((int) s);

        }
        catch (ClassCastException cl)
        {
            System.out.println(cl);
        }

        FileInputStream fis = null;
        try
        {
            fis = new FileInputStream("abc.txt");
        }
        catch(FileNotFoundException fnf)
        {
            System.out.println(fnf);
        }


    }
}
