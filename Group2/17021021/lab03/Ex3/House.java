public class House {

    private String address;
    private String color;
    private int floor;


    //constructor
    public House() {
        address = "";
        color = "";
        floor = 0;
    }

    public House(String address, String color, int floor) {
        this.address = address;
        this.color = color;
        this.floor = floor;
    }


    //getter
    public String getAddress() {
        return address;
    }

    public String getColor() {
        return color;
    }

    public int getFloor() {
        return floor;
    }


    //setter
    public void setAddress(String address) {
        this.address = address;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

}
