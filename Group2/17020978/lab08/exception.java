package lab0802;


import java.io.*;
import java.util.Scanner;

public class exception {

    void nullEx() throws NullPointerException
    {
        String s = null;
        s.toString();
       // throw new NullPointerException();
    }

    void arrEx() throws ArrayIndexOutOfBoundsException
    {
        int a[] = {1,2,3,4,5};
        a[6] = 7;
       // throw new ArrayIndexOutOfBoundsException();
    }


    void ariEX() throws ArithmeticException
    {
        int a = 30/0;
       // throw new ArithmeticException();
    }

    void classEx() throws ClassCastException
    {
        Object x = new Integer(0);
        System.out.println((String)x);
        //throw new ClassCastException();
    }

    void IOEX() throws IOException
    {
        BufferedReader bf = new BufferedReader(new FileReader("2.txt"));
        String s ;
        while ((s = bf.readLine()) != null)
        {
            System.out.println(s);
        }
        //throw new IOException();
    }

    void FileEx() throws FileNotFoundException
    {
        File file = new File("1.txt");
        Scanner scanner = new Scanner(file);
       // throw new FileNotFoundException();
    }

    public static void main(String[] args)
   {
            try {
                exception e = new exception();
                e.nullEx();

            }catch (NullPointerException ne)
            {
                System.out.println("NullPointerException");
            }

        try {
            exception
                    e = new exception();
            e.arrEx();
        }catch (ArrayIndexOutOfBoundsException arre)
        {
            System.out.println("ArrayIndexOutOfBoundsException");
        }

            try {
                exception
                        e = new exception();
                e.ariEX();
            }catch (ArithmeticException arie)
            {
                System.out.println("ArithmeticException");
            }

       try {
           exception
           e = new exception();
           e.IOEX();
       }catch (IOException ioex)
       {
           System.out.println("IOException");
       }

          try {
               exception
                       e = new exception();
               e.classEx();
           }catch (ClassCastException clex)
           {
               System.out.println("ClassCastException");
           }

       try {
           exception
                   e = new exception();
           e.FileEx();
       }catch (FileNotFoundException fiex)
       {
           System.out.println("FileNotFoundException");
       }

    }
}

