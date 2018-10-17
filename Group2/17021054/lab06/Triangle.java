import java.util.Scanner;

public class Triangle extends Shape {
    private int a;
    private  int b;
    private int c;


    public void setA(int a){
        this.a = a;
    }
    public void setB(int b) {
        this.b = b;
    }
    public void setC(int c) {
        this.c = c;
    }
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public int getC() {
        return c;
    }
    public void setDoDaiCanh() {
        System.out.println("nhap toa do");
        int x,y,z;
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        y = s.nextInt();
        z = s.nextInt();
        this.setA(x);
        this.setB(y);
        this.setC(z);
    }

    public void InToado() {
        System.out.println( "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}');

    }

    public int getPerimeter(){
        return a+b+c;
    }
}
