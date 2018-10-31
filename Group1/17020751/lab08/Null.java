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
public class Null {
    public static void add() throws NullPointerException{
        String s = null;
        System.out.println(s.length());
    }
    public static void main(String[] args) {
//         try{
//             add();
//    } catch(Exception n){
//             System.out.println("loi NullPointerException ");
//        }
        add();
    }
}