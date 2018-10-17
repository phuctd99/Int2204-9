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
    
    public CamCaoPhong (String name, String color, String roots, int price, int numbers) {
        super(name, color, roots, price, numbers);
    }
    @Override
    public void getInfo() {
        System.out.println("Thông tin về loại quả :");
        System.out.println(this.getName() + " "+this.getColor()+ " " + this.getRoots()+ " "
                + this.getPrice() + " " + this.getNumbers()); 
    }
}
