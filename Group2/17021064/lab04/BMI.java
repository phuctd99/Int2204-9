import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double high = scan.nextDouble();
        double weight = scan.nextDouble();
        double BMI = weight / (high * high);
        if (BMI >= 25) {
            System.out.println("Béo phì");
        } else {
            if (BMI >= 23 && BMI < 25) {
                System.out.println("Thừa cân");
            } else {
                if (BMI >= 18.5 && BMI < 23) {
                    System.out.println("Bình thường");
                } else {
                    System.out.println("Thiếu cân");
                }
            }
        }
    }
}
