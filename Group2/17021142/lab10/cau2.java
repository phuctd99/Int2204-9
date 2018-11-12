import java.util.Random;

public class cau2 {
    static void bubbleSort(int arr[]) {
        int n = arr.length;
        int i, j;
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
//                    swap(arr[j], arr[j+1]);
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Random rd = new Random();
        int[] list = new int[1000];
        for(int i=0; i<1000; i++){
            list[i] = rd.nextInt(2000);
        }
        bubbleSort(list);
        for(int i =0; i< 1000; i++){
            System.out.println(list[i]);
        }
    }
}
