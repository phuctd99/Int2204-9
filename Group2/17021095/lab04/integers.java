import java.util.Arrays;

public class integers {

    public static int max(int number1, int number2) {
        if (number1 > number2)
            return number1;
        return number2;
    }

    public static int minarr(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];
        }
        return min;
    }

    public static String BIM(double weight, double height) {
        double BIM;
        BIM = weight / (height * height);
        if (BIM < 18.5)
            return "Thieu can";
        else if (BIM < 23)
            return "Binh thuong";
        else if (BIM <= 25)
            return "Thua can";
        else
            return "Beo phi";
    }

    public static void main(String[] args) {

    }

}
