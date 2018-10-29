package cau2;
public class ClassCastExceptions {
    public void chuyenDoi(Object i, String s)throws ClassCastException{
        i = Integer.valueOf(25);
        s = (String)i;
        System.out.println(s);
    }
    public static void main(String[] args){
        ClassCastExceptions se = new ClassCastExceptions();
        Object i = Integer.valueOf(25);
        String s = "abc";
        try{
            se.chuyenDoi(i, s);
        }
        catch(ClassCastException e){
            System.out.println("Loi khi chuyen doi");
        }
    }
}
/*
    Bất kỳ nỗ lực nào cast(tức là chuyển đổi) một đối tượng sang một lớp khác mà lớp gốc 
    không phải là một thừa kế từ sẽ dẫn đến ClassCastException.
    Ví dụ:
    Khi cố gắng truyền Integer đến một String, String không phải là một phân lớp của Integer, 
    vì vậy một ClassCastException sẽ bị ném.
*/