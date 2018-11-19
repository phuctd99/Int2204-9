import java.util.ArrayList;
import java.util.Random;

public class Test_char {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Character> arrayList = new ArrayList<>();
        for (int i = 0; i< 100; i ++) {
            arrayList.add( new Character((char) random.nextInt(127))   );
        }

        Character maxValue = new Template_class<Character>().lookingForMaxValue( arrayList);
        System.out.println("gia tri lon nhat la : " + maxValue );
        System.out.println();
        System.out.println("sap xep");
        new Template_class<Integer>().sort(arrayList );
        new Template_class<Integer>().printArrayList(arrayList);
        System.out.println("============================================================");
    }
}
