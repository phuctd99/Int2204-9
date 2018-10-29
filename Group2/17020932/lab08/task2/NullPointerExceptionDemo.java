package task2;

public class NullPointerExceptionDemo {
    public void compare(String str1, String str2) throws NullPointerException{
//        if(str1 == null || str2 == null) throw new NullPointerException();

        if(str1.equals(str2)) System.out.println("Same");
        else System.out.println("Not Same");
    }

    public static void main(String[] args) {
        NullPointerExceptionDemo tmp = new NullPointerExceptionDemo();
        String str1 = null;
        String str2 = "";
        try {
            tmp.compare(str1, str2);
        }catch (NullPointerException ex) {
            System.out.println(ex);
        }
    }
}
