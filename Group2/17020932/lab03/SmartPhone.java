package Object;

public class SmartPhone{
    String brand;
    String name;
    String code;
    int year;
    double price;
    public SmartPhone(String brand,String name, String code, int year, double price){
        this.brand = brand;
        this.name = name;
        this.code = code;
        this.year = year;
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public void print(){
        System.out.println("brand: " + brand);
        System.out.println("name: " + name);
        System.out.println("code: " +code);
        System.out.println("year: " + year);
        System.out.println("price: " + price);
    }

}
