import java.util.ArrayList;
import java.util.Random;

public class TestPhan {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Phan_so> arrayList = new ArrayList<>();
        for (int i = 0; i< 10; i ++) {
            arrayList.add( new Phan_so(random.nextInt(1000), (random.nextInt(999) +1)) );
        }

        Phan_so maxValue = new Template_class<Phan_so>().lookingForMaxValue( arrayList);
        System.out.println("gia tri lon nhat la : " + maxValue );
        System.out.println();
        System.out.println("sap xep");
        new Template_class<Phan_so>().sort(arrayList );
        new Template_class<Phan_so>().printArrayList(arrayList);
        System.out.println("============================================================");
    }
}
