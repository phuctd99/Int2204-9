/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 *
 * @author CACLV
 */
public class bt01Main {
    
    public static void main(String[] args) {
        HoaQua hoaQua = new HoaQua("Việt Nam", 0.0 , 500, "02/10/2018", "màu tùy loại", "tùy loại quả");
        QuaCam quaCam = new QuaCam("Tuyên Quang", 0.0, 400, "02/10/2018", "màu tùy loại", "chia múi", "tùy loại");
        QuaTao quaTao = new QuaTao("Bắc Ninh", 20.7, 100, "02/10/2018", "xanh", "đặc");
        CamSanh camSanh = new CamSanh("Tuyên Quang", 35.5, 200, "02/10/2018", "xanh", "chia múi", "sần");
        CamCaoPhong camCaoPhong = new CamCaoPhong("Tuyên Quang", 40.5, 200, "02/10/2018", "xanh", "chia múi", "nhẵn");
        System.out.println( "Hoa Quả: " + hoaQua.toString() + "\n");
        System.out.println(quaTao.toString());
        System.out.println(quaCam.toString());
        System.out.println("\t" + camSanh.toString());
        System.out.println("\t" + camCaoPhong.toString());
        
    }
        
}
