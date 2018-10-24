
package tuan_6;

/**
 * hoangdinh
 * @author Pc
 */
    public class Hexagon extends Shape{
    private int x1,y1,x2,y2,x3,y3,x4,y4,x5,y5;

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getX3() {
        return x3;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }

    public int getY3() {
        return y3;
    }

    public void setY3(int y3) {
        this.y3 = y3;
    }

    public int getX4() {
        return x4;
    }

    public void setX4(int x4) {
        this.x4 = x4;
    }

    public int getY4() {
        return y4;
    }

    public void setY4(int y4) {
        this.y4 = y4;
    }

    public int getX5() {
        return x5;
    }

    public void setX5(int x5) {
        this.x5 = x5;
    }

    public int getY5() {
        return y5;
    }

    public void setY5(int y5) {
        this.y5 = y5;
    }
    
    @Override
    public void input() {
        super.input();
        System.out.println("Nhap toa do x1: ");
        x1 = super.scan.nextInt();
        System.out.println("Nhap toa do y1: ");
        y1 = super.scan.nextInt();
        System.out.println("Nhap toa do x2: ");
        x2 = super.scan.nextInt();
        System.out.println("Nhap toa do y2: ");
        y2 = super.scan.nextInt();
        System.out.println("Nhap toa do x3: ");
        x3 = super.scan.nextInt();
        System.out.println("Nhap toa do y3: ");
        y3 = super.scan.nextInt();
        System.out.println("Nhap toa do x4: ");
        x4 = super.scan.nextInt();
        System.out.println("Nhap toa do y4: ");
        y4 = super.scan.nextInt();
        System.out.println("Nhap toa do x5: ");
        x5 = super.scan.nextInt();
        System.out.println("Nhap toa do y5: ");
        y5 = super.scan.nextInt();  
    }
    
    @Override
    public void output() {
        super.output();
        System.out.println("Toa do x1: " + x1);
        System.out.println("Toa do y1: " + y1);
        System.out.println("Toa do x2: " + x2);
        System.out.println("Toa do y2: " + y2);
        System.out.println("Toa do x3: " + x3);
        System.out.println("Toa do y3: " + y3);
        System.out.println("Toa do x4: " + x4);
        System.out.println("Toa do y4: " + y4);
        System.out.println("Toa do x5: " + x5);
        System.out.println("Toa do y5: " + y5);
    }
    
    public boolean sameHexagon(Hexagon h) {
        if (h.x1==x1&&h.x0==x0&&h.x2==x2&&h.x3==x3&&h.x4==x4&&h.x5==x5&&h.y0==y0&&h.y1==y1&&h.y2==y2&&h.y3==y3&&h.y4==y4&&h.y5==y5) {
            return true;
        }
        return false;
    }
}
