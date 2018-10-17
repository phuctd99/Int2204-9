package Lab06;

public class Rectangle extends Shape {
    private final double width, length;
    Location a = new Location();

    public Rectangle() {
        this(1,1);
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    @Override
    public void draw(){
        System.out.println("Ve chu nhat");
    }

}