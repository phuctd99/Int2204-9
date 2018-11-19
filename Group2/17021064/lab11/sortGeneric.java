import java.util.ArrayList;

public class sortGeneric<T extends Comparable> {

    private ArrayList<T> list;

    public sortGeneric() {
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
    public void sort(){
        T a;
        for(int i=0;i < list.size();i++){
            for(int j = i+1; j < list.size(); j++){
                if(list.get(i).compareTo(list.get(j)) > 0){
                    a = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, a);
                }
            }
        }
    }


    public static void main(String[] args) {
        //Kiểu dữ liệu nguyên thủy
        sortGeneric list= new sortGeneric();
        list.add(100);
        list.add(7);
        list.add(6);
        list.add(20);
        list.add(1);
        list.add(15);
        System.out.print("trước khi sắp xếp: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        list.sort();
        System.out.print("sau khi sắp xếp: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        //Phân số
        ArrayList<PS> listPS = new ArrayList<>();
        listPS.add(new PS(1, 1));
        listPS.add(new PS(1, 2));
        listPS.add(new PS(4, 3));
        listPS.add(new PS(3, 4));
        listPS.add(new PS(7, 8));
        System.out.println("trước khi sắp xếp: ");
        for (int i = 0; i < listPS.size(); i++){
            listPS.get(i).inPhanSo();
        }
        listPS.sort(PS::compareTo);
        System.out.println("sau khi sắp xếp: ");
        for (int i = 0; i < listPS.size(); i++){
            listPS.get(i).inPhanSo();
        }
    }

}