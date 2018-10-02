import java.util.Arrays;

public class lab04 {
    public static int maxi(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public static int mini(int[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

    public static String resultBMI(double wei, double hig) {
        double result = wei / (hig * hig);
        if (result > 25) {
            return "Béo phì";
        } else {
            if (result >= 23 && result <= 24.99) {
                return "Thừa cân";
            } else {
                if (result >= 18.5 && result <= 24.99) {
                    return "Bình thường";
                } else {
                    return "Thiếu cân";
                }
            }
        }
    }
}
