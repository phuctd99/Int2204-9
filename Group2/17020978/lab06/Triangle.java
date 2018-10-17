public class Triangle extends Shape{
    double canh1 = 3.0;
    double canh2 = 4.0;
    double canh3 = 6.0;

    Triangle(){}
    Triangle(double canh1, double canh2, double canh3 , String color, boolean filled)
    {
        super(color,filled);
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
    public double getAres()
    {
        double p = (canh1 + canh2 + canh3) /2;
        double ares = Math.sqrt(p*(p-canh1) * (p - canh2) * (p - canh3));
        return ares;
    }

    public double getPerimeter()
    {
        return canh1 + canh2 + canh3;
    }
    public String toString()
    {
        return "Color: " + this.color + " FILLED:" + this.filled + " Dien tich hinh tam giac:" + this.getAres() + " Chu vi hinh tam giac:" + this.getPerimeter();
    }
}
