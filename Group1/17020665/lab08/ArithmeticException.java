import java.util.Scanner;

public class ArithmeticException {

    public static void chia (int a, int b) {
        try {
            System.out.print(a / b);
        } catch (java.lang.ArithmeticException e) {
            System.out.print("Loi chia cho so 0");
        }
    }

    public static void main(String[] args){
        int a, b;
        Scanner sc = new Scanner(System.in);
        a= sc.nextInt();
        b =sc.nextInt();
        chia(a, b);
        }
}
