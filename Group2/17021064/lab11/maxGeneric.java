import java.util.ArrayList;

public class maxGeneric<T extends Comparable>{
    private ArrayList<T> list;
    public maxGeneric() {
        list = new ArrayList<>();
    }
    public void add(T t) {
        list.add(t);
    }

    public int size() {
        return list.size();
    }

    public T get(int i) {
        return list.get(i);
    }
    public T Max() {
        if (list.size() == 0)
            return null;
        else {
            T max = list.get(0);
            for(int i = 1; i < list.size(); i++) {
                if (list.get(i).compareTo(max) > 0) {
                    max = list.get(i);
                }
            }
            return max;
        }
    }
    public static void main(String[] args) {
        maxGeneric list = new maxGeneric<>();
        list.add(100);
        list.add(7);
        list.add(6);
        list.add(20);
        list.add(1);
        list.add(15);
        System.out.println("Max = " + list.Max());
    }
}
