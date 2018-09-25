package Object;

public class Computer {
    String brand;
    String code;
    int time;
    double price;
    public Computer(String brand, String code, int time, double price){
        this.brand = brand;
        this.code = code;
        this.time = time;
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public void print(){
        System.out.println("brand: " + brand);
        System.out.println("code: " +code);
        System.out.println("time: " + time);
        System.out.println("price: " + price);
    }

}
