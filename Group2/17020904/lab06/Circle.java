package Lab06;

public class Circle extends Shape {
    private final double radius;
    final double pi = Math.PI;
    Location a = new Location();
    public void setLocation (double x, double y){
        a.setX(x);
        a.setY(y);
    }

    public Circle() {
        this(1);
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public void draw(){
        System.out.println("Ve Hinh tron");
    }

}

