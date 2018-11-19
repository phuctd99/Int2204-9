
import java.util.ArrayList;

public class tuan11{
    public static <T extends Comparable<T>> void bubbleSort(T[] nameArray) {
	int n = nameArray.length;
	for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
		if (nameArray[i].compareTo(nameArray[j]) > 0) {
                    T temp = nameArray[j];
                    nameArray[j] = nameArray[i];
                    nameArray[i] = temp;
                }
            }
	}
    }
    public static <T extends Comparable<T>> void sx( ArrayList<T> arr) {
	int n = arr.size();
	for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
		if (arr.get(i).compareTo(arr.get(j)) > 0) {
                    T temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
	}
    }
    public static void main(String[] args) {
        tuan11 t = new tuan11();
	Integer[] intArray = { 1, 10, 8, 4, 5, 3 };
	Character[] charArray = { 'a', 'd', 'm', 'k', 'b', 'c'};
	bubbleSort(intArray);
	for(int i = 0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
        bubbleSort(charArray);
        for(int i = 0; i < charArray.length; i++){
            System.out.print(charArray[i] + " ");
        }
        System.out.println();
        ArrayList<PhanSo> ps = new ArrayList<>(3);
        ps.add(new PhanSo(1, 2));
        ps.add(new PhanSo(1, 10));
        ps.add(new PhanSo(9, 3));
        sx(ps);
        for(int i = 0; i < 3; i++){
            System.out.print(ps.get(i).toString()+ " ");
        }
    }
}