package test05;

public class Trialgle extends Shape {
    protected double canh1;
    protected double canh2;
    protected double canh3;
    protected double Ax;
    protected double Ay;
    protected double Bx;
    protected double By;
    protected double Cx;
    protected double Cy;
    protected double area;
    protected double perimeter;

    public double getAx() {
        return Ax;
    }

    public void setAx(double ax) {
        Ax = ax;
    }

    public double getAy() {
        return Ay;
    }

    public void setAy(double ay) {
        Ay = ay;
    }

    public double getBx() {
        return Bx;
    }

    public void setBx(double bx) {
        Bx = bx;
    }

    public double getBy() {
        return By;
    }

    public void setBy(double by) {
        By = by;
    }

    public double getCx() {
        return Cx;
    }

    public void setCx(double cx) {
        Cx = cx;
    }

    public double getCy() {
        return Cy;
    }

    public void setCy(double cy) {
        Cy = cy;
    }

    public double getCanh2() {
        return canh2;
    }

    public void setCanh2() {
        this.canh2 = Math.sqrt((Cx - Bx)*(Cx - Bx) + (Cy - By)*(Cy - By));
    }

    public double getCanh3() {
        return canh3;
    }

    public void setCanh3() {
        this.canh3 = Math.sqrt((Ax - Cx)*(Ax - Cx) + (Ay - Cy)*(Ay - Cy));
    }

    public double getCanh1() {
        return canh1;
    }

    public void setCanh1() {
        this.canh1 = Math.sqrt((Ax - Bx)*(Ax - Bx) + (Ay - By)*(Ay - By));
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public Trialgle(){
        this.canh1= 0;
        this.canh2= 0;
        this.canh3= 0;
        this.color = "red";
        this.filled = true;
        this.area = 0;
        this.perimeter = 0;
    }

    public Trialgle(double canh1, double canh2, double canh3, String color, boolean filled, double area, double perimeter,
                    double ax, double ay, double bx, double by, double cx, double cy){
        this.canh1 = canh1;
        this.canh2 = canh2;
        this.canh3 = canh3;
        this.color = color;
        this.filled = filled;
        this.area = area;
        this.perimeter = perimeter;
    }


    public void cs(Trialgle tg){
        tg.setArea(tg.getCanh1() + tg.getCanh2() + tg.getCanh3());
        double p = tg.getArea() / 2;
        tg.setPerimeter(Math.sqrt(p*(p - getCanh1())*(p - getCanh2())*(p - getCanh3())));
    }

    @Override
    public String toString() {
        return "Trialgle{" +
                "canh1" + canh1 +
                "canh2" + canh2 +
                "canh3" + canh3 +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", color='" + color +
                ", filled=" + filled +
                '}';
    }
}
