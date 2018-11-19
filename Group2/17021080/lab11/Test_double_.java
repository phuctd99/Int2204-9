import java.util.ArrayList;
import java.util.Random;

public class Test_double_ {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Double> arrayList = new ArrayList<>();
        for (int i = 0; i< 100; i ++) {
            arrayList.add( random.nextDouble() );
        }

        Double maxValue = new Template_class<Double>().lookingForMaxValue( arrayList);
        System.out.println("gia tri lon nhat la : " + maxValue );
        System.out.println();
        System.out.println("sap xep");
        new Template_class<Integer>().sort(arrayList );
        new Template_class<Integer>().printArrayList(arrayList);
        System.out.println("============================================================");
    }
}
