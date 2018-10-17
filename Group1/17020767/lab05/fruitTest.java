/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab05.Fruit;

/**
 *
 * @author admin
 */
import java.util.*;
public class fruitTest {
    public static void main (String[] args ){
        QuaCam loCam1 = new QuaCam();
        CamCaoPhong camCaoPhongA = new CamCaoPhong();
        fruit lo01 = new fruit();
        camCaoPhongA.setGiaCamCaoPhong(50000);
        camCaoPhongA.setHuongVi("Ngot");
        camCaoPhongA.setMauSac("xanh");
        System.out.println(camCaoPhongA.getHuongVi());
        System.out.println(camCaoPhongA.getMauSac());
        System.out.println(camCaoPhongA.getGiaCamCaoPhong());
        
    }
    
}
