/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;



public class hoaqua {
    private double cost;
    private String origin;
    private double amount;
    private String exday;
    hoaqua()
    {
        cost = 0;
        origin = "";
        amount = 0;
        exday = "";
    }
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getExday() {
        return exday;
    }

    public void setExday(String exday) {
        this.exday = exday;
    }
    public void nhapThongTin()
    {
        System.out.println("nhap gia :");
        Scanner s = new Scanner(System.in);
        cost = s.nextDouble();
        s.nextLine();
        System.out.println("nhap nguon goc : ");
         origin =s.nextLine();
        System.out.println("nhap so luong :");
        amount = s.nextDouble();
        System.out.println("ngay nhap :");
        exday = s.next();
        s.nextLine();
    }
    public void inthongTin()
    {
        System.out.println("--------------Thong tin san pham---------------");
        System.out.println("xuat xu : "+origin);
        System.out.println("gia : "+ cost);
        
        System.out.println("so luong : "+ amount );
        System.out.println("ngay nhap : "+ exday);
    }
    public static void main(String[] args) {
        
        hoaqua hq=new hoaqua ();
        hq.nhapThongTin();
        hq.inthongTin();
    }
    
}
