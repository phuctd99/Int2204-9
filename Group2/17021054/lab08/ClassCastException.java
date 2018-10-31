public class ClassCastException {
    //cố gắng truyền một đối tượng đến một lớp con mà nó không phải là một cá thể.
    public static void cast(){
        Object i = Integer.valueOf(42);
        String s = (String)i;
    }
    public static void main(String[] args) {
        try{
            cast();
        } catch (java.lang.ClassCastException e){
            System.out.println(e);
        }
    }
}
