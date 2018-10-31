/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08bai2;

/**
 *
 * @author hieu
 */
public class Arith {
    public static int Division() throws ArithmeticException{
        return 3/0;
    }
    
    public static void main(String[] args) {
       // Division();
        try{
            int D = Division();
        } catch(Exception e){
            System.out.println("loi ArithmeticException");
        }
    }
    
}
