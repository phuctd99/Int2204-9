import java.util.Scanner;

public class UCLN{

    static int ucln(int a, int b)
    {
        if(b==0)
            return a;
        else return ucln(b, a%b);
    }
    public static void main(String args[])
    {
            Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(ucln(x,y));
    }
}