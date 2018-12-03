package cau2;
/*
 * Strategy pattern (mẫu chiến lược).
    - Ý nghĩa thực sự của mẫu chiến lược là bạn tách rời phần xử lý một chức năng cụ thể ra khỏi đối tượng của bạn.
Sau đó tạo ra một tập hợp các thuật toán để xử lý chức năng đó và lựa chọn thuật toán nào mà bạn thấy đúng đắn nhất
khi thực thi chương trình. Mẫu thiết kế này thường được sử dụng để thay thế cho sự kế thừa,
khi bạn muốn chấm dứt việc theo dõi và chỉnh sửa một chức năng qua nhiều lớp con.

    -Strategy pattern cho thấy đôi khi nó sẽ được áp dụng tốt cho mục đích hướng chức năng. Và nó đặc biệt quan trọng
khi bạn muốn thực hiện công việc nâng cấp, bảo trì cho các đoạn mã dễ thay đổi của bạn một cách riêng biệt với
toàn bộ mã của chương trình, hoặc khi bạn muốn thay đổi thuật toán sử dụng khi chương trình được thực thi.
 */
// ---------------------------------------------  chức năng ---------------------------------------------
interface sortAlgorithm {
    public void sort(int[] A);
}
/*
InsertionSort
BubbleSort
MergeSort
QuickSort
CountingSort
 */
class selectionSort implements sortAlgorithm {

    @Override
    public void sort(int[] A) {
        for( int i=0; i<A.length; i++) {
            int index = i;
            for( int j = i+ 1; j<A.length; j++) {
                if ( A[j] < A[index]) {
                    index = j;
                }
            }

            int smallestNumber = A[index];
            A[index] = A[i];
            A[i] = smallestNumber;
        }
    }

}

class insertionSort implements sortAlgorithm {

    @Override
    public void sort(int[] A) {
        if(A.length < 2){
            return;
        }
        for ( int k = 1; k<A.length; k++) {
            int tmp = A[k];
            int j = k-1;
            while ( j >= 0 && tmp <= A[j]) {
                A[j+1] = A[j];
                j--;
            }
            A[j+1] = tmp;
        }
    }
}

class bubbleSort implements sortAlgorithm {

    @Override
    public void sort(int[] A) {
        for ( int i=0; i<A.length; i++) {
            for( int j = i+1; j< A.length; j++) {
                if ( A[i] > A[j]) {
                    int tmp = A[i];
                    A[i] = A[j] ;
                    A[j] = tmp ;
                }
            }
        }
    }
}

class mergeSort implements sortAlgorithm {
    static void merge(int[] A, int l, int m, int r) {
        int i, j, k;
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (i = 0; i < n1; i++) {
            L[i] = A[l+i];
        }
        for (j = 0; j<n2; j++){
            R[j] = A[m+1+j];
        }

        i = 0;
        j = 0;
        k = l;
        while( i<n1 && j<n2){
            if( L[i] <= R[j] ){
                A[k] = L[i];
                i++;
            }
            else{
                A[k] = R[j];
                j++;
            }
            k++;
        }

        while ( i<n1) {
            A[k] = L[i];
            i++;
            k++;
        }
        while ( j<n2 ) {
            A[k] = R[j];
            j++;
            k++;
        }

    }

    static void mergesort(int[] A , int l, int r) {
        if (l<r) {
            int m = l +( r -l)/2;

            mergesort(A,l,m);
            mergesort(A,m+1,r);

            merge(A,l,m,r);
        }
    }

    @Override
    public void sort ( int[] A){
        mergesort(A,0,A.length-1);
    }
}

class quickSort implements sortAlgorithm {

    static int partition( int[] A , int lo, int hi) {
        int pivot = A[hi];
        int i = lo;
        for ( int j= lo; j<= hi-1; j++) {
            if( A[j] < pivot ) {
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
                i++;
            }
        }
        int tmp = A[i];
        A[i] = A[hi];
        A[hi] = tmp;
        return i;
    }

    static void quicksort(int[] A, int lo, int hi) {
        if ( lo < hi) {
            int p = partition(A,lo,hi);
            quicksort(A,lo,p-1);
            quicksort(A,p+1,hi);
        }
    }

    @Override
    public void sort(int[] A) {
        quicksort(A,0,A.length-1);
    }
}

//---------------------------------------------------  đối tượng     --------------------------------
class sapxep {

    private sortAlgorithm sortalgorithm;

    public sapxep( sortAlgorithm sortalgorithm ) {
        this.sortalgorithm = sortalgorithm ;
    }

    public void sort(int[] A){
        sortalgorithm.sort(A);
    }
}

public class StrategyPatterm {
    public static void main(String[] args) {
        int[] A = new int[] {5,9,3,10,2,6,8,7};
        sapxep sx = new sapxep(new quickSort());
        sx.sort(A);
        for(int i=0; i<A.length; i++){
            System.out.println(A[i]);
        }

    }
}
