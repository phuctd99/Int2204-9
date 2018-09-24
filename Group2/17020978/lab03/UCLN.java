import java.util.Scanner;

public class UCLN{

     int ucln(int a, int b)
    {
        if(b==0)
            return a;
        else return ucln(b, a%b);
    }
    public static void main(String args[])
    {
            Scanner scanner = new Scanner(System.in);
        UCLN uc = new UCLN();
        int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(uc.ucln(x,y));
    }
}
