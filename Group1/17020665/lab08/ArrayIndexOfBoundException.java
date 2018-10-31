import java.util.Scanner;

public class ArrayIndexOfBoundException {

    public static void Arr(int [] arr, int i) {
        try {

                    System.out.println("Value: " + arr[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Loi truy cap ngoai mang");
        }
    }

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int [] a = {1, 2, 3, 4, 5};
        Arr(a, i);
        }
}


