public class Main {


    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static int minArray(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static String BMI(double weight, double height) {
        double bmi = weight / height / height;
        if (bmi < 18.5) {
            return "Thiếu cân";
        } else if (bmi <= 22.99) {
            return "Bình thường";
        } else if (bmi <= 24.99) {
            return "Thừa cân";
        }
        return "Béo phì";
    }

    public static void main(String[] args) {
        System.out.println(max(16, 5));
        System.out.println(BMI(49, 1.65));
    }
}
