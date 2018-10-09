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
public class quacam extends Hoaqua{
    protected String color;
    public quacam(){
        this.color = "vang";
    }
    public quacam(String name, String dateadd, int amount, int price, String color){
        super(name,dateadd,amount,price);
        this.color=color;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "quacam{" + "color=" + color + '}';
    }
}
