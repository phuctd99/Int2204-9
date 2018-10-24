
public class Circle extends Shape{
    double R;
    public Circle() {
        super();
        R = 50;
    }

    public Circle(double vitriX, double vitriY, double kichthuocX, double kichthuocY, String color, double R) {
        super(vitriX, vitriY, kichthuocX, kichthuocY, color);
        this.R = R;
    }

    public Circle(double R){
        this.R = R;
    }

}
