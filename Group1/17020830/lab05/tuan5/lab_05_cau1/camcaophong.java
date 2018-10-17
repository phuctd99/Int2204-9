
package lab_05_cau1;

import java.util.Scanner;

public class camcaophong extends Quacam{
    
    private String color;
    Scanner input = new Scanner(System.in);

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void nhapthongtin_caophong(){
        nhapthongtin_cam();
        String clr = input.next();
        this.setColor(clr);    
    }
    public void xuatthongtin_caophong(){
        xuatthongtin();
        System.out.println(this.getColor());
    }
            
    
    
    
    
}
