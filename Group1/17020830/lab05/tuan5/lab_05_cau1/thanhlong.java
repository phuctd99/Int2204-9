
package lab_05_cau1;

import java.util.Scanner;

public class thanhlong extends Hoaqua{
    Scanner input = new Scanner(System.in);
    private String ColorInside;

    public String getColorInside() {
        return ColorInside;
    }

    public void setColorInside(String ColorInside) {
        this.ColorInside = ColorInside;
    }
    
    public void nhapthongtin_thanhlong(){
        nhapthongtin();
        String color = input.next();
        this.setColorInside(color);
        
    }
    
    public void xuatthongtin_thanhlong(){
        xuatthongtin();
        System.out.println(this.getColorInside());
    }
    
    
}
