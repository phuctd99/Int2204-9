import java.util.ArrayList;
import java.util.Scanner;

public class cau2 {
    public static <T extends Comparable> T max(ArrayList<T> arr) {
        int sz = arr.size();
        T Max = arr.get(0);
        for (int i = 1; i < sz; i++) {
            if (arr.get(i).compareTo(Max) > 0) {
                Max = arr.get(i);
            }
        }

        return Max;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < n; i++){
            list1.add(sc.nextInt());
        }
        System.out.println(max(list1));

        ArrayList<Character> list2 = new ArrayList<>();
        list2.add('m');
        list2.add('n');
        list2.add('p');
        list2.add('q');
        System.out.print(max(list2));


    }
}
