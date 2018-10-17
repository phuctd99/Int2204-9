import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Shape {
    protected int x;
    protected int y;
    Scanner scan = new Scanner(System.in);
    public void NhapToado(){
        System.out.println("Nhap toa do lan luot x va y:");
         x = scan.nextInt();
         y = scan.nextInt();
    }
    public void InToado(){
        System.out.println("Toa do x:" +x);
        System.out.println("Toa do y:" +y);
    }
    public void ToaDo(int x, int y){
        this.x = x;
        this.y =y;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}
