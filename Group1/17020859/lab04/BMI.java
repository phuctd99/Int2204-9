import java.util.Scanner;

public class BMI {

    public static String BMI (double Weight, double Height) {
        double BMI = Weight / (Height * Height);
        if (BMI < 18.5) {
            return "Thiếu Cân";
        }
        else if (BMI < 23) {
            return "Bình Thường";
        }
        else if (BMI < 25) {
            return "Thừa Cân";
        }
        else {
            return "Béo Phì";
        }
    }

    public static void main (String[] args) {
        double Weight, Height;
        Scanner sc = new Scanner(System.in);
        Weight = sc.nextDouble();
        Height = sc.nextDouble();
        System.out.println(BMI(Weight, Height));
        sc.close();
    }
}
