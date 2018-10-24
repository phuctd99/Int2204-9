
public class Rectangle extends Shape {
    double w;
    double h;
    public Rectangle() {
        super();
        w =100;
        h =100;
    }

    public Rectangle(double vitriX, double vitriY, double kichthuocX, double kichthuocY, String color) {
        super(vitriX, vitriY, kichthuocX, kichthuocY, color);
    }
    public Rectangle(double w, double h){
        super();
        this.w = w;
        this.h = h;
    }
    public Rectangle(double vitriX, double vitriY, double kichthuocX, double kichthuocY, String color,double w, double h) {
        super(vitriX, vitriY, kichthuocX, kichthuocY, color);
        this.w = w;
        this.h = h;
    }

    double diem1X = getVitriX();
    double diem1Y = getVitriY();

    double diem2X = getVitriX() + w;
    double diem2Y = getVitriY();

    double diem3X = getVitriX() + w;
    double diem3Y = getVitriY() + h;

    double diem4X = getVitriX();
    double diem4Y = getVitriY() + h;
}
