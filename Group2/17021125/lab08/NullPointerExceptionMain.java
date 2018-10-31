public class NullPointerExceptionMain {
    public static void main(String[] args) {
        int[] a = null;
        try {
            System.out.println(a.length);
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}
