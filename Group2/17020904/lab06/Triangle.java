package Lab06;

public class Triangle extends Shape {
    private final double a, b, c;
    Location td1 = new Location();
    Location td2 = new Location();
    Location td3 = new Location();
    public Triangle() {
        this(1,1,1);
    }
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public void draw(){
        System.out.println("Ve Hinh Tam Giac");
    }

}