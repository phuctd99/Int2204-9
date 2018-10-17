public class Triangle extends Shape{
    private double canh1;
    private double canh2;
    private double canh3;

    public Triangle(String vitri, double kichthuoc, boolean tomau, boolean dichuyen, double canh1, double canh2, double canh3){
        super(vitri, kichthuoc, tomau, dichuyen);
        this.canh1 = canh1;
        this.canh2 = canh2;
        this.canh3 = canh3;
    }

    public double getCanh1() {
        return canh1;
    }

    public void setCanh1(double canh1) {
        this.canh1 = canh1;
    }

    public double getCanh2() {
        return canh2;
    }

    public void setCanh2(double canh2) {
        this.canh2 = canh2;
    }

    public double getCanh3() {
        return canh3;
    }

    public void setCanh3(double canh3) {
        this.canh3 = canh3;
    }
}
