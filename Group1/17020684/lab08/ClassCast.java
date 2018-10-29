
package tuan_8b;

/**
 *
 * @author Pc
 */
public class ClassCast {
    public static void main(String[] args) throws ClassCastException{
        try{
            Object i = Integer.valueOf(42);
            String s = (String)i;
            System.out.println(s);
        } catch(Exception e) {
            System.out.println("loi truyen 1 integer den string ma string khong phai 1 phan lop cua integer");
        }
    }
}
