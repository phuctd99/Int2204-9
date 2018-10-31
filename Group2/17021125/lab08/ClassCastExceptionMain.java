import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class ClassCastExceptionMain {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        try {
            Queue<Integer> newList = (Queue)arrayList;
        } catch (ClassCastException e) {
            System.out.println(e);
            System.out.println("Khong hop le!");
        }
    }
}
