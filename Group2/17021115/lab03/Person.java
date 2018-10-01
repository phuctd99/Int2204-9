
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CCNE
 */
public class Person {
    private String name;
    private String diaChi;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        this.name = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        this.diaChi = sc.nextLine();
    }
}
