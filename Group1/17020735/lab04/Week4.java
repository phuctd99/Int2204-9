package week4;

/**
 *
 * @author Nguyễn Quang Hiệp
 * @since 30-09-2018
 */
public class Week4 {

    // tìm số lớn nhất giữa 2 số nguyên
    public static int findMax(int a, int b) {
        return a > b ? a : b;
    }

    // tìm số nhỏ nhất trong mảng
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
        // Arrays.sort(arr);
        // return arr[0];
    }

    // tính chỉ số bmi
    public static String bmiIndex(float weight, float height) {
        float bmi = weight / (height * height);
        if (bmi < 18.5) {
            return "Thiếu cân";
        } else if (bmi >= 18.5 && bmi <= 22.99) {
            return "Bình thường";
        } else if (bmi >= 23 && bmi <= 24.99) {
            return "Thừa cân";
        } else {
            return "Béo phì";
        }
    }
}
