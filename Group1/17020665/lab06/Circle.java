public class Circle extends Shape {
    private double radium;
    private final double Pi = 3.14;
    public Circle(String vitri, double kichthuoc, boolean tomau, boolean dichuyen, double radium){
        super(vitri, kichthuoc, tomau, dichuyen);
        this.radium= radium;
    }

    public double getRadium() {
        return radium;
    }

    public void setRadium(double radium) {
        this.radium = radium;
    }

    public double getS(){
        return radium*radium*Pi;
    }

    public double getP(){
        return 2*radium*Pi;
    }
}
