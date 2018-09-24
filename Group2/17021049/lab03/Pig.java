import java.util.Scanner;

public class Pig {
    private String category, sex;
    private int weigh, price;

    public Pig(){
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return this.category;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return this.sex;
    }

    public void setWeigh(int weigh) {
        this.weigh = weigh;
    }

    public int getWeigh() {
        return this.weigh;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public void inputPigInformation(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter to Category : ");
        this.setCategory(sc.nextLine());
        System.out.print("Enter to Sex : ");
        this.setSex(sc.nextLine());
        System.out.print("Enter to Weigh : ");
        this.setWeigh(sc.nextInt());
        System.out.print("Enter to Price : ");
        this.setPrice(sc.nextInt());
        System.out.println();
    }

    public void displayPigInformation(){
        System.out.println("Category : " + this.getCategory());
        System.out.println("Sex : " + this.getSex());
        System.out.println("Weigh : " + this.getWeigh() + " Kg");
        System.out.println("Price : " + this.getPrice() + " VND");
        System.out.println();
    }

    public void buyPork(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter to amount you want to buy (Kg): ");
        int t = sc.nextInt();
        int m = t * (this.getPrice()/this.getWeigh());
        System.out.println("You must pay : " + m + " VND");
    }

    public static void main(String[] args){
        Pig p = new Pig();
        p.inputPigInformation();
        p.displayPigInformation();
        p.buyPork();
    }
}
