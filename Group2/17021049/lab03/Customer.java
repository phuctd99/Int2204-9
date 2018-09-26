import java.util.Scanner;

public class Customer {
    private int customerID, age;
    private String name, address;

    public Customer(){

    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
    public int getCustomerID() {
        return this.customerID;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public void inputCustomerInfomation(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter to CustomerID : ");
        this.setCustomerID(sc.nextInt());
        System.out.print("Enter to Name : ");
        sc.nextLine();
        this.setName(sc.nextLine());
        System.out.print("Enter to Address : ");
        this.setAddress(sc.nextLine());
        System.out.print("Enter to Age : ");
        this.setAge(sc.nextInt());
    }

    public void displayCustomerInfomation(){
        System.out.print("CustomerID : " + this.getCustomerID());
        System.out.print("Name : " + this.getName());
        System.out.print("Address : " + this.getAddress());
        System.out.print("Age : " + this.getAge());
    }

    public static void main(String[] args){
        Customer c = new Customer();
        c.inputCustomerInfomation();
        c.displayCustomerInfomation();
    }
}
