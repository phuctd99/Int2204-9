import java.io.*;
import java.lang.management.BufferPoolMXBean;

public class Lab082 {
    private static void npe(){
        Object npe = null;
        npe.hashCode();
    }
    public static void main(String[] args) throws Exception{
        // Lỗi NullPointerException
        try {
            npe();
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());

        }



        // Lỗi ArrayIndexOutOfBoundsException
        int a[] = new int[2];
        try{
            a[3] = 2;
            System.out.println(a[3]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: " + e.getMessage());
        }

        // Lỗi  ArithmeticException
        try {
            int value = 10 / 0;

            System.out.println("Value =" + value);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }


        // Lỗi ClassCastException

        try{
            Object x = new Integer(0);

            System.out.println((String) x);
        }
        catch (ClassCastException e){
            System.out.println("Error: " + e.getMessage());
        }

        // Lỗi IOException
        BufferedReader br = null;

        try{
            br = new BufferedReader(new FileReader("Hello.txt"));
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }


        // Lỗi FilleNotFoundException
        try
        {
            File f=new File("File.txt");
            PrintWriter p=new PrintWriter(new FileWriter(f));
            f.setReadOnly();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error: "+ e.getMessage());
        }


    }
}
