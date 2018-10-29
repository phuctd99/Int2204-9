
package tuan_8b;


public class test1 {
     public static void main(String[] args) throws ArithmeticException {
         try{
             double value = 10/0;
             System.out.println("value" + "  "+value);
         }catch(Exception e) {
             System.out.println("loi chia cho khong");
         }
     }
}
