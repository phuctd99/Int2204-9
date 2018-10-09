/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

public class Lab5_Bai1 {
    public static void main(String[] args) {
        HoaQua qua = new HoaQua("Đỏ", "Việt Nam", 3800, 20000);
        qua.getInfo();
        System.out.println("giá của 1 loại quả là "+ qua.getPrice());
        Cam cam = new Cam("cam", "xanh", "Việt Nam", 10000, 2130);
        cam.getInfo();
        System.out.println("nguồn gốc của quả cam là " + cam.getRoots());
        Tao tao = new Tao("đỏ", "Trung Quốc", 3000, 10000);
        tao.getInfo();
        System.out.println("số lượng quả táo là "+ tao.getNumbers());
        CamCaoPhong caophong = new CamCaoPhong("Cam cao phong", "xanh", "huyện Cao Phong", 25000, 3000);
        caophong.getInfo();
        System.out.println("Nguồn gốc của cam cao phong là "+ caophong.getRoots());
        CamSanh camsanh = new CamSanh("Cam sành", "xanh", "Việt Nam", 22000, 4000);
        camsanh.getInfo();
        
    }
    
    
}
