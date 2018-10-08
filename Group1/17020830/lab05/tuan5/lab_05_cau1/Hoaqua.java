
package lab_05_cau1;

import java.util.Scanner;

public class Hoaqua {
    private double giaban;
    private String xuatxu;

    public double getGiaban() {
        return giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

    public String getXuatxu() {
        return xuatxu;
    }

    public void setXuatxu(String xuatxu) {
        this.xuatxu = xuatxu;
    }
   
    
    public void nhapthongtin(){
        Scanner input = new Scanner(System.in);
        double gb = input.nextDouble();
        String xx = input.next();
        this.setGiaban(gb);
        this.setXuatxu(xx);
        
        
    }
    public void xuatthongtin(){
        System.out.println(this.getGiaban());
        System.out.println(this.getXuatxu()); 
    }
    
    
    
}
