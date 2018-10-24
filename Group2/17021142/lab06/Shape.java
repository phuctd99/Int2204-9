
public abstract class Shape {
    public Shape(){
        vitriY = 100;
        vitriX = 100;
        kichthuocY = 100;
        kichthuocX = 100;
        color = "CYAN";
    }
    public Shape(double vitriX, double vitriY, double kichthuocX, double kichthuocY, String color) {
        this.vitriX = vitriX;
        this.vitriY = vitriY;
        this.kichthuocX = kichthuocX;
        this.kichthuocY = kichthuocY;
        this.color = color;
    }

    public double getVitriX() {
        return vitriX;
    }
    public void setVitriX(double vitriX) {
        this.vitriX = vitriX;
    }
    public double getVitriY() {
        return vitriY;
    }
    public void setVitriY(double vitriY) {
        this.vitriY = vitriY;
    }
    public double getKichthuocX() {
        return kichthuocX;
    }
    public void setKichthuocX(double kichthuocX) {
        this.kichthuocX = kichthuocX;
    }
    public double getKichthuocY() {
        return kichthuocY;
    }
    public void setKichthuocY(double kichthuocY) {
        this.kichthuocY = kichthuocY;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setViTri(double vitriX, double vitriY){
        this.vitriX = vitriX;
        this.vitriY = vitriY;
    }
    public  void setKichThuoc(double kichthuocX, double kichthuocY){
        this.kichthuocX = kichthuocX;
        this.kichthuocY = kichthuocY;
    }


    double vitriX;
    double vitriY;
    double kichthuocX;
    double kichthuocY;
    String color;


}
