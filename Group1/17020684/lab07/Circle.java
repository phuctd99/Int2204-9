
package tuan_6;


public class Circle extends Shape{
    private int radius;

    @Override
    public void input() {
        super.input();
        System.out.println("Nhap ban kinh: ");
        radius = super.scan.nextInt();
    }
    
    @Override
    public void output() {
        System.out.println("Hinh Tron");
        super.output();
        System.out.println("Ban kinh: " + radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    public boolean sameCircle(Circle c) {
        if (c.x0 == x0 && c.y0 == y0 && c.radius == radius) {
            return true;
        }
        return false;
    }  
    
}
