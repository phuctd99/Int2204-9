/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baituan5;

/**
 *
 * @author CCNE
 */
public class Baituan5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hoa_qua hoaqua = new Hoa_qua("vietnam", 5000, "31",30 );
        qua_cam quacam = new qua_cam();
        qua_tao quatao = new qua_tao();
        cam_cao_phong camcaophong = new cam_cao_phong();
        cam_sanh camsanh = new cam_sanh();
        System.out.println(quacam.toString());
        System.out.println(hoaqua.toString());
    }
    
}
