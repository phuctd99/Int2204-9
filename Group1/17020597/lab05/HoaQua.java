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
public class HoaQua {
    String color;
    private String roots;
    private int price;
    private int numbers;

    public void setColor(String color) {this.color = color; }
    public void setRoots(String roots) {this.roots = roots; }
    public void setPrice(int price) {this.price = price; }
    public void setNumbers(int numbers) {this.numbers = numbers; }
    public String getColor() {return this.color; }
    public String getRoots() {return this.roots; }
    public int getPrice() {return this.price; }
    public int getNumbers() {return this.numbers; }
    public HoaQua (String color, String roots, int price, int numbers) {
        this.color = color;
        this.roots = roots;
        this.price = price;
        this.numbers = numbers;
    }
    public void ThongTin() {
        System.out.println("Thông tin của loại quả : ");
        System.out.println(this.color +" "+ this.roots+ " " + this.numbers + " " + this.price);
    }
}
