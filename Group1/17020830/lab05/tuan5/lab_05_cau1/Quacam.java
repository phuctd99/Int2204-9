
package lab_05_cau1;

import java.util.Scanner;
public class Quacam extends Hoaqua{
    private String vitaminPro;

    public String getVitaminPro() {
        return vitaminPro;
    }

    public void setVitaminPro(String vitaminPro) {
        this.vitaminPro = vitaminPro;
    }

    public void nhapthongtin_cam() {
        nhapthongtin();
        Scanner input = new Scanner(System.in);
        String tenvi = input.next();
        this.setVitaminPro(tenvi);
    }
    public void xuatthongtin_cam() {
        xuatthongtin();
        System.out.println(this.getVitaminPro());
    }
    
    
}
