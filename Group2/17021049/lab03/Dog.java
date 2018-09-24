import java.util.Scanner;

public class Dog {
    private String name, hairColor, category;
    //Ham khoi tao khong chua tham so

    public Dog(){
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getHairColor() {
        return this.hairColor;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return this.category;
    }

    //Ham nhap thong tin con cho

    public void inputDogInformation(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter to Name : ");
        this.setName(sc.nextLine());
        System.out.print("Enter to HairColor : ");
        this.setHairColor(sc.nextLine());
        System.out.print("Enter to Category : ");
        this.setCategory(sc.nextLine());
        System.out.println();
    }

    //Ham hien thi thong tin con cho

    public void displayDogInformation(){
        System.out.println("Name : " + this.getName());
        System.out.println("HairColor : " + this.getHairColor());
        System.out.println("Category : " + this.getCategory());
    }

    public static void main(String[] args){
        Dog d = new Dog();
        d.inputDogInformation();
        d.displayDogInformation();
    }
}
