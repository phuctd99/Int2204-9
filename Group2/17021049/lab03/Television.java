import java.util.Scanner;

public class Television {
    private String name, material;
    private int screen, price;

    //Ham khoi tao Television

    public Television(){
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setScreen(int screen) {
        this.screen = screen;
    }

    public int getScreen() {
        return this.screen;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    //Ham nhap thong tin Television

    public void inputTelevisionInformation(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter to Name : ");
        this.setName(sc.nextLine());
        System.out.print("Enter to Material : ");
        this.setMaterial(sc.nextLine());
        System.out.print("Enter to Screen : ");
        this.setScreen(sc.nextInt());
        System.out.print("Enter to Price : ");
        this.setPrice(sc.nextInt());
        System.out.println();
    }

    //Ham hien thi thong tin Television

    public void displayTelevisionInformation(){
        System.out.println("Name : " + this.getName());
        System.out.println("Material : " + this.getMaterial());
        System.out.println("Screen : " + this.getScreen());
        System.out.println("Price : " + this.getPrice());
    }

    public static void main(String[] args){
        Television t = new Television();
        t.inputTelevisionInformation();
        t.displayTelevisionInformation();
    }

}
