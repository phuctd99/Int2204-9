/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan_5;

/**
 *
 * @author HP
 */
public class Tuan_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hoaqua hq = new Hoaqua("qua tao","nam dinh",50,2500);
        quacam qcam = new quacam("cam xanh","nam dinh",25,2500,"xanh");
        camcaophong ccphong = new camcaophong();
        camxanh cxanh = new camxanh();
        System.out.println(hq.toString());
        System.out.println(qcam.toString());
        System.out.println(ccphong.toString());
        System.out.println(cxanh.toString());
    }
}
