/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author CCNE
 */
public class main {
    public static void main(String[] args) {
        hoaQua hQ = new hoaQua();
        hQ.setTen("Nhãn");
        hQ.setnguonGoc("Việt Nam");
        hQ.setsoLuong(100);
        hQ.inThongTin();
        quaTao a = new quaTao();
        a.setTen("Táo");
        a.setnguonGoc("Hà nội");
        a.setsoLuong(1000);
        a.inThongTin();
        quaCam c =new quaCam();
        c.setTen("Cam");
        c.inThongTin();
        camCaoPhong p = new camCaoPhong() ;
        p.inThongTin();
        camSanh s = new camSanh();
        s.inThongTin();
    }
}
