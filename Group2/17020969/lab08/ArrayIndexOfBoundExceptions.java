package cau2;
public class ArrayIndexOfBoundExceptions {
    public int ArrIndex (int arr) throws ArrayIndexOutOfBoundsException {
        return arr;
    }
    public static void main(String[] args) {
        ArrayIndexOfBoundExceptions s = new ArrayIndexOfBoundExceptions();
        int [] arr =  new int [10];
        try {
            arr[22] = 10;
            System.out.println(s.ArrIndex(arr[22]));
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
