/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap5;

/**
 *
 * @author Hoang Vu Huong
 */
public class LAP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HoaQua hoaqua = new HoaQua("Qua Mit", "Thom", "ngot", "Trung quoc", "20-2-1999", 3);
        hoaqua.Print();
        QuaTao tao = new QuaTao(1, 12000, "vang", "Tao", "Thom", "ngot", "viet nam", "2-3-2000", 0.5f);
        System.out.println("gia:"+tao.GiaTien());
    }
    
}
