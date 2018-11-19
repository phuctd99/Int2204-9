
import java.util.ArrayList;
import java.util.Random;


public class Sort<T extends Comparable> {

    private  ArrayList<T> listData;

    public Sort() {
        listData = new ArrayList<>();
    }

    public void add(T t) {
        listData.add(t);
    }

    public int size() {
        return listData.size();
    }

    public T get(int i) {
        return listData.get(i);
    }
    public void sort(){
        T a;
        for(int i=0;i < listData.size();i++){
            for(int j = i+1; j < listData.size(); j++){
                if(listData.get(i).compareTo(listData.get(j)) > 0){
                     a = listData.get(i);
                    listData.set(i, listData.get(j));
                    listData.set(j, a);
                }
            }
        }
    }


    public static void main(String[] args) {
        Sort a = new Sort<>();
        for (int i = 0; i < 10; i++) {
            a.listData.add(new Random().nextInt());
        }
//        a.listData.add("a");
//        a.listData.add("c");
//        a.listData.add("b");
//        a.listData.add("f");
        a.sort();
        for (int i = 0; i < a.listData.size(); i++) {
            System.out.println(a.listData.get(i));
        }
    }

}
