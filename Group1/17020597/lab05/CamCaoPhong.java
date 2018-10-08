/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

/**
 *
 * @author Admin
 */
public class CamCaoPhong extends Cam {
    
    public CamCaoPhong (String ten, String color, String roots, int price, int numbers) {
        super(ten, color, roots, price, numbers);
    }
    @Override
    public void ThongTin() {
        System.out.println("Lấy thông tin loại quả :");
        System.out.println(this.getName() + " "+this.getColor()+ " " + this.getRoots()+ " "
                + this.getPrice() + " " + this.getNumbers()); 
    }
}
