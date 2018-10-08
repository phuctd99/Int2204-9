 
import java.util.Scanner;


public class camcaophong extends quacam {
    private String special;

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }
    public void nhapThongTin() 
    {
        super.nhapThongTin();
        System.out.println("nhap uu diem : ");
        Scanner s = new Scanner(System.in);
        special = s.nextLine();
    }
    public void inthongtin()
    {
        super.inthongtin();
        System.out.println("uu diem : "+ special);
        
        
    }
    public static void main(String[] args) {
        camcaophong cp= new camcaophong();
        cp.nhapThongTin();
        cp.inthongtin();
    }
    
}
