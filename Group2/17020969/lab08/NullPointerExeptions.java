package cau2;
public class NullPointerExeptions {
    public String Arr (String [] s) throws NullPointerException {
        return s[s.length];
    }
    public static void main(String[] args) {
        NullPointerExeptions ee = new NullPointerExeptions();
        String[] s = null;
        try {
            System.out.println(ee.Arr(s));
        }
        catch(NullPointerException e){
            System.out.println(e);
        } 
    }
}
/*  NullPointerException là một RuntimeException.
    Trong Java, một giá trị null đặc biệt có thể được gán cho một tham chiếu đối tượng. 
    NullPointerException được ném khi chương trình cố gắng sử dụng một tham chiếu đối tượng có giá trị null.
*/