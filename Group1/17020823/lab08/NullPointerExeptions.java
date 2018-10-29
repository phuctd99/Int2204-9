/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau2;

/**
 *
 * @author Hoang Vu Huong
 */
public class NullPointerExeptions {

    int x;

    public static void InGiaTri(NullPointerExeptions a) throws NullPointerException {

        System.out.println(a.x);

    }

    public static void main(String[] args) {
        try {
            NullPointerExeptions a = null;
            InGiaTri(a);
        } catch (NullPointerException a) {
            System.err.println("Chua khoi tao doi tuong");
        }
    }
}
