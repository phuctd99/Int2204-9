public class ArrayIndexOfBoundExceptionMain {
    public static void main(String[] args) {
        int[] arr = {0, 1};
        try {
            arr[3] = 3;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
