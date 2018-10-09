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
public class Cam extends HoaQua {
    private String name;
    public Cam(String name, String color, String roots, int price, int numbers) {
        super(color, roots, price, numbers);
        this.name = "Cam";
    }

    
    public void setName (String name) {
		this.name = name; }
    public String getName () {
		return this.name; 
	}

    public void getInfo() {
        System.out.println("Thông tin của loại quả : ");
        System.out.println(this.name + this.getColor()+ " "+ this.getRoots()+
                " "+ this.getPrice()+ " "+ this.getNumbers() + " " + this.name);
    }
}
