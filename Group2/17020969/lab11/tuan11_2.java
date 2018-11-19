import java.util.ArrayList;
import java.util.Scanner;
public class tuan11_2 {
    public <T extends Comparable<T>> T max( ArrayList<T> arr) {
        int n = arr.size();
        if(arr == null || n == 0){
            return null;
        }
        T max = arr.get(0);
        for(int i = 0; i < n; i++){
            if(max.compareTo(arr.get(i))<0){
                max = arr.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // Create object
	tuan11_2 mt = new tuan11_2(); 
	ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            int value = sc.nextInt();
            arr.add(value);
        }
        
	 System.out.println(mt.max(arr));
    }
}
