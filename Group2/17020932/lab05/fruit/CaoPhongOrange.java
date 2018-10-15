package fruit;

public class CaoPhongOrange extends orange {
    private double price;
    private String date;
    private int amount;

    public CaoPhongOrange(String name, String color, String shape, double weight, String origin, int type, double price, String date, int amount) {
        super(name, color, shape, weight, origin, type);
        this.price = price;
        this.date = date;
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return super.toString()  +
                ", price=" + price +
                ", date='" + date + '\'' +
                ", amount=" + amount ;
    }
}
