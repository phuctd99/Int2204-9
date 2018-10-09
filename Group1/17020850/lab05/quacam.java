import java.util.Scanner;
public class quacam extends hoaqua{
    private String name;
    private String color;
    quacam()
    {
        new hoaqua();
        name ="";
        color = "";
    }
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
        System.out.println("nhap mau sac : ");
        color=s.nextLine();
    }
    public void inthongtin()
    {
        super.inthongTin();
        System.out.println("ten : "+ name);
        System.out.println("mau sac : "+ color);
        
    }
    public static void main(String[] args) {
        quacam c= new quacam();
        c.nhapThongTin();
        c.inthongtin();
    }
    
}
