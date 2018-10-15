
//package lab06;
package lab06;




public class Circle extends Shape {
    protected int radius;

    @Override
    public void input() {
        super.input();
        System.out.println("Nhap ban kinh: ");
        radius = super.scan.nextInt();
    }

    @Override
    public void output() {

        super.output();
        System.out.println("Ban kinh: " + radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


}
