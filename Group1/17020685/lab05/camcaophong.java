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
public class camcaophong extends quacam{
    protected String origin;
    public camcaophong(){
        this.origin = "xuan truong";
    }
    public camcaophong(String name, String dateadd, int amount, int price, String color, String origin){
        super(name,dateadd,amount,price,color);
        this.origin=origin;
    }
    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "camcaophong{" + "origin= " + origin + '}';
    }
    
    
}
