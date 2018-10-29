import java.util.Scanner;

public class NullPointerExeptions {


    public static void main(String[] args) {
        String s = "adjasfa";
        try{
            System.out.println(s.subSequence(10,12));
        }
        catch(NullPointerException e)
        {
            System.err.println("đã xảy ra ngoại lệ NullPointerException");
        }


    }
}
