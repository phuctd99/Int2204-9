package Object;

public class Car{
    String brand;
    int year;
    String make;
    double speed;
    int price;


    public Car(String brand, int year, String make, double speed, int price){
        this.brand = brand;
        this.year = year;
        this.make = make;
        this.speed = speed;
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public int getYear(){
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }
    public String getMake(){
        return make;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
    public double getSpeed() {
        return speed;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }

    public void printParameter(){
        System.out.println("Brand: " + brand);
        System.out.println("Year of manufacture: " + year);
        System.out.println("Place of manufacture" + make);
        System.out.println("Speed: " + speed);
        System.out.println("Price: " + price);
    }

    public double time(double s){
        return (s/speed);
    }


}
