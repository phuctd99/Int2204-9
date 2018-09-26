package Object;

public class Flower {
    String name;
    boolean type;
    String place;
    double price;

    public Flower(String name, boolean type, String place, double price){
        this.name = name;
        this.type = type;
        this.place = place;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public boolean isType() {
        return type;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPlace() {
        return place;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void print(){
        System.out.println("Name: " + name);
        System.out.println("type: " + ((isType()) ? "fresh" : "dry") );
        System.out.println("place " + place);
        System.out.println("price: " + price);
    }
}
