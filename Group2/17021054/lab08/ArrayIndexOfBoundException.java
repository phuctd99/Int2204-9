public class ArrayIndexOfBoundException {
    public  void get() throws java.lang.ArithmeticException {
        int a[] = new int[5];
        a[10] =50;
    }
    public static void main(String[] args) {
        try{
            ArrayIndexOfBoundException nw;
            nw = new ArrayIndexOfBoundException();
            nw.get();
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
