//package lab06;
package lab06;

//import java.util.Scanner;

import java.awt.Graphics;


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
    public void draw(Graphics g)
    {
        if(this.isColor())
        {
            
            g.fillRect(this.getX(), this.getY(), this.getLength(), this.getLength());
        }
        else
        {
            g.drawRect(this.getX(), this.getY(), this.getLength(), this.getLength());
        }
    }


}
