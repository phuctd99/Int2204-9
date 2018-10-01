import java.util.Scanner;

public class Motorbike {
    private String name, automaker, color;
    private int price;

    //Ham khoi tao Motorbike
    public Motorbike(){
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAutomaker(String automaker) {
        this.automaker = automaker;
    }

    public String getAutomaker() {
        return this.automaker;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    //Ham nhap thong tin Mortorbike

    public void inputMotorbikeInformation(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter to Name : ");
        this.setName(sc.nextLine());
        System.out.print("Enter to AutoMaker : ");
        this.setAutomaker(sc.nextLine());
        System.out.print("Enter to Color : ");
        this.setColor(sc.nextLine());
        System.out.print("Enter to Price : ");
        this.setPrice(sc.nextInt());
        System.out.println();
    }

    //Ham hien thi thong tin Motorbike

    public void displayMotorbikeInformation(){
        System.out.println("Name : " + this.getName());
        System.out.println("Automaker : " + this.getAutomaker());
        System.out.println("Color : " + this.getColor());
        System.out.println("Price : " + this.getPrice());
    }

    public static void main(String[] args){
        Motorbike m = new Motorbike();
        m.inputMotorbikeInformation();
        m.displayMotorbikeInformation();
    }
}
