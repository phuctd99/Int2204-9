import java.util.Arrays;

public class MinOfArray {

    public static int MinOfArray(int[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }
}
