public class cau1 {
    public static <T extends Comparable> void sort(T[] arr){
        int sz = arr.length;
        for (int i = 0; i < sz; i++) {
            for (int j = i + 1; j < sz; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    T tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    public static void main (String[] args){
        Integer[] a = {1, 2, 4, 3, 6, 9};
        sort(a);
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();

        Double[] doubles = {1.2, 2.2, 0.2};
        sort(doubles);
        for (int i = 0; i < doubles.length; i++){
            System.out.print(doubles[i] + " ");
        }
        System.out.println();

    }

}
