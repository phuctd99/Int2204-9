public class ArrayIndexOfBoundException {
    public static void print() throws java.lang.ArrayIndexOutOfBoundsException {
        int[] a = {2,3,4};
        System.out.println(a[4]);
    }
    public static void main(String[] args) {

        try {
            print();
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
