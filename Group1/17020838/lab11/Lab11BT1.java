package lab11bt1;
public class Lab11BT1 {
    public static <T extends Comparable> void Sort(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    T temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        String[] s = {"Khoa", "An", "Anh", "Linh", "Giang"};
        Sort(s);
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
        System.out.println();
        Integer[] a = {5, 9, -16, -7, 15, 0};
        Sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    
}
