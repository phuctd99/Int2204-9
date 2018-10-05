package Tuan4;

public class minArr {

    //Hàm tìm GTNN của một màng số nguyên
    public static int minArr( int[] arr) {
        int min = arr[0];
        int sizeArr = arr.length;
        for( int i=1; i<sizeArr; i++) {
            if( min > arr[i] )
                min = arr[i];
        }
        return min;
    }
}
