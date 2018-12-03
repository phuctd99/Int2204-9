import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
        Context context = new Context(new BubbleSort());
        context.executeStrategy(arr);
        Context context1 = new Context(new SelectionSort());
        context.executeStrategy(arr);
    }
}
