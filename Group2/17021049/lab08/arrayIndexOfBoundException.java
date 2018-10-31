package bai2;

public class arrayIndexOfBoundException {
    private int[] array;
    private int n;

    public void array() throws ArrayIndexOutOfBoundsException {

        int[] a = {1,2,3,4};
        System.out.println(a[n]);
    }


    public static void main(String[] args){
        try {
            arrayIndexOfBoundException aI = new arrayIndexOfBoundException();
            aI.array();
        }
        catch (Exception e) {
            System.out.println("arrayIndexOfBoundException");
        }
    }
}
