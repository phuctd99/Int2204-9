import java.util.ArrayList;
import java.util.Random;

public class Main_oop_11 {
    public static void main(String[] args) {


        Random random = new Random();
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0; i< 100; i ++) {
            integerArrayList.add( random.nextInt(1000) );
        }

        Integer maxValue = new Template_class<Integer>().lookingForMaxValue( integerArrayList);
        System.out.println("gia tri lon nhat la : " + maxValue );
        System.out.println();
        System.out.println("sap xep");
        new Template_class<Integer>().sort(integerArrayList );
        new Template_class<Integer>().printArrayList(integerArrayList);
        System.out.println("============================================================");
    }
}
