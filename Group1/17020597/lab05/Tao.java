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
public class Tao extends HoaQua {
    private String ten = "Táo";
    public Tao(String color, String roots, int price, int numbers) {
        super(color, roots, price, numbers);
    }
    public void ThongTin () {
        System.out.println("Thông tin của loại quả : ");
        System.out.println(this.getColor()+ " " + this.getRoots()+ " " 
                + this.getPrice() + " "+ this.ten);
    }
    public void setTen(String ten) {this.ten = ten; }
    public String getTen() {return this.ten; }
}
