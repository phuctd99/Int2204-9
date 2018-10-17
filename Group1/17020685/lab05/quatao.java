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
public class quatao extends Hoaqua{
    protected String color, taste;
    public quatao(){
        this.color = "xanh";
        this.taste = "chua";
    }
    public quatao(String name, String dateadd, int amount, int price, String color,String taste){
        super(name,dateadd,amount,price);
        this.color=color;
        this.taste=taste;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "quatao{" + "color=" + color + ", taste=" + taste + '}';
    }
    
}
