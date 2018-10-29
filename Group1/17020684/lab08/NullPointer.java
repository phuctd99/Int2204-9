
package tuan_8b;

/**
 *
 * @author Pc
 */
public class NullPointer {

    public void setName(String name) {
        this.name = name;
    }
    private String name;
    public void print() {
        printString(name);
    }

    private void printString(String s) {
        System.out.println(s + " (" + s.length() + ")");
    }

    public static void main(String[] args) throws NullPointerException {
        try {
            NullPointer Nu = new NullPointer();
            Nu.print();
        } catch (Exception e){
            System.out.println("loi pointer");
        }
    }
}
