package Tuan4;

public class maxMin {
    //Hàm tìm GTLN của hai số nguyên
    public static int max( int a, int b) {
        if( a > b )
            return a;
        return b;
    }

    //Hàm tìm GTNN của một màng số nguyên
    public static int minOfArr( int[] arr) {
        int min = arr[0];
        int sizeOfArr = arr.length;
        for( int i=1; i<sizeOfArr; i++) {
            if( min > arr[i] )
                min = arr[i];
        }
        return min;
    }
}
