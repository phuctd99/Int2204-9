
public class Hexagon extends Shape{
    double doDaiCanh;
    public Hexagon(double vitriX, double vitriY, double kichthuocX, double kichthuocY, String color) {
        super(vitriX, vitriY, kichthuocX, kichthuocY, color);
    }
    public Hexagon(double doDaiCanh){
        super();
        this.doDaiCanh = doDaiCanh;
    }
    public Hexagon(double vitriX, double vitriY, double kichthuocX, double kichthuocY, String color,double doDaiCanh) {
        super(vitriX, vitriY, kichthuocX, kichthuocY, color);
        this.doDaiCanh = doDaiCanh;
    }
    final double ngang = 2*doDaiCanh*Math.cos(Math.PI/6);
    final double doc = doDaiCanh;

    double diem1X = getVitriX();
    double diem1Y = getVitriY();

    double diem2X = getVitriX() + ngang/2;
    double diem2Y = getVitriY() - doc/2;

    double diem3X = getVitriX() + ngang;
    double diem3Y = getVitriY();

    double diem4X = getVitriX() + ngang;
    double diem4Y = getVitriY() + doc;

    double diem5X = getVitriX() + ngang/2;
    double diem5Y = getVitriY() + doc*3/2;

    double diem6X = getVitriX();
    double diem6Y = getVitriY() + doc;


}
