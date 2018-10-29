package task2;

public class ArrayIndexOfBoundExceptionDemo {
    public void arrayIndex (int[] arr, int i) throws ArrayIndexOutOfBoundsException {
        if(i < 0 || i > arr.length) throw new ArrayIndexOutOfBoundsException();
        System.out.println(arr[i]);
    }

    public static void main(String[] args) {
        ArrayIndexOfBoundExceptionDemo tmp = new ArrayIndexOfBoundExceptionDemo();
        int[] arr = new int[5];
        try {
            tmp.arrayIndex(arr, 6);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex);
        }
    }
}
