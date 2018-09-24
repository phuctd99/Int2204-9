public class Pen {
    private double lenght;
    private String color;
    private int cost;

    public double getLenght() {
        return lenght;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean isExpensive(){
        if(this.cost > 20000) return true;
        else return false;
    }

    public void getInfor(){
        System.out.println("mau: "+this.color+" giá: "+this.cost+" do dai: "+this.lenght);
    }

}
