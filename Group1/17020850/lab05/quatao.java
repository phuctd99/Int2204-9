

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class quatao extends hoaqua {
    private String name;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void nhapThongTin()
    {
        super.nhapThongTin();
        System.out.println("nhap ten : ");
        Scanner s = new Scanner(System.in);
        name = s.nextLine();
        s.nextLine();
        color=s.nextLine();
    }
    public void inthongtin()
    {
        super.inthongTin();
        System.out.println("ten : "+ name);
        System.out.println("mau sac : " + color);
    }
    public static void main(String[] args) {
        quatao qt= new quatao();
        qt.nhapThongTin();
        qt.inthongtin();
    }
    
}
