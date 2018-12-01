interface SortAlgorithm{
    void sort(int[] array);
}

class BubbleSort implements SortAlgorithm{
    public void sort(int[] array){
        System.out.println("--Bubble Sort--");
        int  temp;
        for(int i = 0; i < array.length-1; i++){
            for(int j = 0;j < array.length-1-i; j++) {
                if (array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}

class SelectionSort implements SortAlgorithm{
    public void sort(int[] array){
        System.out.println("--Selection Sort--");
        int position;
        for(int i = 0; i < array.length; i++){
            int j = i + 1;
            position = i;
            int temp = array [i];
            for (; j < array.length; j++){
                if (array[j] < temp) {
                    temp = array[j];
                    position = j;
                }
            }
            array[position] = array[i];
            array[i] = temp;
        }
    }
}

public class strategy{
    private SortAlgorithm sortAlgorithm;
    public void setSortAlgorithm(SortAlgorithm x){
        sortAlgorithm = x;
    }

    public static void main(String[] args){
        int[] a = {7, 2, 3, 6, 2, 7, 9, 8, 10, 1, 5};
        strategy s = new strategy();
        //s.setSortAlgorithm(new BubbleSort());
        s.setSortAlgorithm(new SelectionSort());
        s.sortAlgorithm.sort(a);
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
