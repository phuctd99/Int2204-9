import java.util.Scanner;

public class BMI {

    public static String BMI (double W, double H) {
        double BMI = W / (H * H);
        if (BMI <= 18.5) {
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

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        System.out.print(BMI(w, h));
    }
}
