import java.util.Arrays;

class BubbleSort implements Strategy {

    @Override
    public void sort(int[] arr) {
        System.out.println("bublleSort");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

class SelectionSort implements Strategy {

    @Override
    public void sort(int[] arr) {
        System.out.println("Selection sort");
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }
}
public class bai2 {
    public static void main(String[] args) {
        int[] arr = {1,7,23,7,8};
        Strategy strategy = new SelectionSort();
        strategy.sort(arr);
        System.out.println(Arrays.toString(arr));
        Strategy strategy1 = new BubbleSort();
        strategy1.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
