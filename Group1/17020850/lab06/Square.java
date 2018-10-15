//package lab06;
package lab06;

//import java.util.Scanner;

public class Square extends Shape {
    protected int length;


    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public void input(){
        System.out.println("Thong tin cua hinh vuong");
        super.input();
        System.out.println("Nhap chieu dai canh: ");
        length = super.scan.nextInt();
    }

    @Override
    public void output(){
        super.output();
        System.out.println("Chieu dai canh: " + length);
    }


}
