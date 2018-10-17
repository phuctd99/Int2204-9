import java.util.Scanner;

public class Square extends Rectangle {
    public double side;
    public Square(){
        side = 0.0;
    }
    public Square(double side){
        super(side,side);
    }
    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    public double getSide() {
        return side;
    }
    public void nhap() {
        System.out.println("nhap mau sac");
        double side;
        Scanner s = new Scanner(System.in);
        side=  scan.nextDouble();
        this.setSide(side);

    }

    @Override
    public void setWidth(double side) {
        this.setSide(side);
    }
    @Override
    public void setLength(double side) {

        this.setSide(side);
    }

    public void InToado() {
        System.out.println( "Square{" +
                "side= " + side +
                '}');

    }
}