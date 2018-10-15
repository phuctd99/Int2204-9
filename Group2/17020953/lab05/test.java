/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import thuchanh5.Thuchanh5;

/**
 *
 * @author Admin
 */
public class test {
    public static void main(String [] agrs){
        hoaQua hQ = new hoaQua();
        hQ.in();
        quaTao a = new quaTao();
        a.in();
        quaCam c =new quaCam();
        c.nhap();
        c.in();
        camCaoPhong p = new camCaoPhong() ;
        p.inTenVung();
        camSanh s = new camSanh();
        s.nhapTenVung();
        s.inTenVung();
    }
}
