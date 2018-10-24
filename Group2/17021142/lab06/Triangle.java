
public class Triangle extends Shape{
    double diem1X ;
    double diem1Y ;

    double diem2X ;
    double diem2Y ;

    double diem3X ;
    double diem3Y ;

    public Triangle() {
        super();
        this.diem1X = 0;
        this.diem1Y = 0;

        this.diem2X = 100;
        this.diem2Y = 0;

        this.diem3X = 0;
        this.diem3Y = 100;
    }

    public Triangle(double diem1X , double diem1Y , double diem2X , double diem2Y , double diem3X , double diem3Y) {
        super();
        this.diem1X = diem1X;
        this.diem1Y = diem1Y;

        this.diem2X = diem2X;
        this.diem2Y = diem2Y;

        this.diem3X = diem3X;
        this.diem3Y = diem3Y;
    }

    public Triangle(double vitriX, double vitriY, double kichthuocX, double kichthuocY, String color,
                  double diem1X , double diem1Y , double diem2X , double diem2Y , double diem3X , double diem3Y) {
        super(vitriX, vitriY, kichthuocX, kichthuocY, color);
        this.diem1X = diem1X;
        this.diem1Y = diem1Y;

        this.diem2X = diem2X;
        this.diem2Y = diem2Y;

        this.diem3X = diem3X;
        this.diem3Y = diem3Y;
    }
}
