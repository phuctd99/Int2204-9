
public class Square extends Shape{
    double doDaiCanh;
    public Square() {
        super();
        doDaiCanh = 100;
    }
    public Square(double doDaiCanh){
        super();
        this.doDaiCanh = doDaiCanh;
    }
    public Square(double vitriX, double vitriY, double kichthuocX, double kichthuocY, String color, double doDaiCanh) {
        super(vitriX, vitriY, kichthuocX, kichthuocY, color);
        this.doDaiCanh = doDaiCanh;
    }
    double diem1X = getVitriX();
    double diem1Y = getVitriY();

    double diem2X = getVitriX() + doDaiCanh;
    double diem2Y = getVitriY();

    double diem3X = getVitriX() + doDaiCanh;
    double diem3Y = getVitriY() + doDaiCanh;

    double diem4X = getVitriX();
    double diem4Y = getVitriY() + doDaiCanh;
}
