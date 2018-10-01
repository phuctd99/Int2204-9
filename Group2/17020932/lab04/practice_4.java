public class practice_4 {
    public static int maxValue(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int minValue(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) min = a[i];
        }
        return min;
    }

    public static String BMI(double weight, double height) {
        double BMI = weight / (height * height);
        if (BMI < 18.5)
            return "Thiếu cân";
        else if (18.5 <= BMI && BMI < 23)
            return "Bình thường";
        else if (23 <= BMI && BMI < 25)
            return "Thừa cân";
        else
            return "Béo Phì";
    }

}
