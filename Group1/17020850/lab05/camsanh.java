
import java.util.Scanner;


public class camsanh extends quacam{
    private String special;
    

    public String getSpecial() {
        return special;
    }
    camsanh()
    {
        new quacam();
        special = "";
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
        System.out.println("uu diem : "+ special);
        super.inthongtin();
        
    }
    public static void main(String[] args) {
        camsanh cs= new camsanh();
        cs.nhapThongTin();
        cs.inthongtin();
    }
}
