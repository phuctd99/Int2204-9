import java.util.Scanner;

public class ArithmeticExceptions {
    public static void Mod(int a, int b) throws ArithmeticException{

        try {
            System.out.println(a/b);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Lỗi chia cho so 0");
        }

    }
    public static void main(String[] args) {
        int a=3, b=1;

        Mod(a, b);
    }
}