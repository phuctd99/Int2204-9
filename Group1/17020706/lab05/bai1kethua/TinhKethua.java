/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhkethua;

/**
 *
 * @author Nguyễn Giang
 */
public class TinhKethua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QuaCam cam = new QuaCam("Xanh", "Thái nguyên", 5, 10, 20);
        cam.getInfo();
        QuaTao tao = new QuaTao("Đỏ", "Táo iphone", "Mỹ", 3, 50, 10);
        tao.getInfo();
        CamSanh csanh = new CamSanh("Chua", "Xanh", "Hải Dương", 1, 2, 3);
        csanh.getInfo();
        CamCaoPhong caophong = new CamCaoPhong("Ngọt", "Vàng", "Cao phong", 3, 5, 9);
        caophong.getInfo();
    }
    
}
