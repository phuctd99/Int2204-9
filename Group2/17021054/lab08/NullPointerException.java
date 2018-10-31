public class NullPointerException {
    public  void print() throws java.lang.NullPointerException {
        int[] a = null;
        System.out.println(a.length);
    }

    public static void main(String[] args) {
        try{
            new NullPointerException().print();

        } catch (java.lang.NullPointerException e){
            System.out.println(e);
        }
    }
}
