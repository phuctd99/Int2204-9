package tuan12;


interface SortAlgorithm{
    void sort(int[] arr);
}

class BubbleSort implements SortAlgorithm{
    @Override
    public void sort(int[] arr){
        System.out.println("--Bubble Sort--");
        int  temp;
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0;j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

class SelectionSort implements SortAlgorithm{
    @Override
    public void sort(int[] arr){
        System.out.println("--Selection Sort--");
        for(int i = 0; i < arr.length; i++){
            int minArr = i;
            int temp = arr[i];
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < temp) {
                    temp = arr[j];
                    minArr = j;
                }
            }
            arr[minArr] = arr[i];
            arr[i] = temp;
        }
    }
}

public class tuan12_2 {
    private SortAlgorithm sortAlgorithm;
    public void setSortAlgorithm(SortAlgorithm S){
        sortAlgorithm = S;
    }

    public static void main(String[] args){
        int[] a = {74, 22, 33, 64, 52, 677, 798, 88, 10, 61, 45};
        tuan12_2 s = new tuan12_2();
        
        s.setSortAlgorithm(new BubbleSort());
        s.sortAlgorithm.sort(a);
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        
        System.out.println();
        s.setSortAlgorithm(new SelectionSort());
        s.sortAlgorithm.sort(a);
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}