import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Lab11<T extends Comparable<T>> {
    public void sort(ArrayList<T> arr) {
        for (int i = 0; i < arr.size();i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i).compareTo(arr.get(j)) > 0) {
                    Collections.swap(arr, i, j);
                }
            }
        }
    }

    public T max(ArrayList<T> a){
        T max = a.get(0);

        for (int i = 0; i< a.size(); i++){
            if (a.get(i).compareTo(max) > 0){
                max = a.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Lab11 l = new Lab11();

        // Sắp xếp
        ArrayList<Integer> a = new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i< 3; i++){
            a.add(rd.nextInt());
        }
        System.out.println("Sắp Xếp kiểu dữ liệu nguyên thuỷ:");

        for (int i = 0; i< a.size(); i++){
            System.out.println(a.get(i));
        }
        System.out.println();


        // Max
        ArrayList<String> b = new ArrayList<String>();
        System.out.println("Tìm Max");
        b.add("H");
        b.add("H1");
        b.add("H12");
        b.add("H123");
        System.out.println(l.max(b));
        System.out.println();

        // Sắp Xếp Phân số
        ArrayList<PhanSo> c = new ArrayList<PhanSo>();
        c.add(new PhanSo(14,25));
        c.add(new PhanSo(13,25));
        c.add(new PhanSo(16,25));
        System.out.println("Sắp Xếp Phân Số");
        l.sort(c);
        for (PhanSo p : c) {
            p.printPhanSo(p);
        }


    }

    


}
