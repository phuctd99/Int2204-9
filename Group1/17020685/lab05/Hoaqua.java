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
public class Hoaqua {
    protected String name,dateadd;
    protected int amount,price;   
    public Hoaqua(){
        this.name = "qua cam";
        this.dateadd = "any where";
        this.amount= 15;
        this.price = 5000;
    }
    public Hoaqua(String name, String dateadd, int amount, int price) {
        this.name = name;
        this.dateadd = dateadd;
        this.amount = amount;
        this.price = price;
    } 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }  

    public String getDateadd() {
        return dateadd;
    }

    public void setDateadd(String dateadd) {
        this.dateadd = dateadd;
    }

    @Override
    public String toString() {
        return "Hoaqua{" + "name=" + name + ", dateadd=" + dateadd + ", amount=" + amount + ", price=" + price + '}';
    }
    
}
