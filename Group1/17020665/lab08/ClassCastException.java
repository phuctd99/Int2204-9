import java.util.Scanner;

public class ClassCastException {

    public static void changeFormat(Object i){
        try {
            int a = (int) i;
            System.out.println();
        } catch(java.lang.ClassCastException e){
            System.out.print("ERROR");
        }
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        double i = sc.nextDouble();
        changeFormat(i);
    }

}
