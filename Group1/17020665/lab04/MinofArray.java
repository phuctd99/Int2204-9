import java.util.Arrays;

public class MinofArray {
    public static int MIN(int [] arr){
        Arrays.sort(arr);
        return arr[0];
    }
}
