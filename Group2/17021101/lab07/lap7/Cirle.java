/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap7;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
/**
 *
 * @author User
 */
public class Cirle extends Shape{
    private int r;//=(int) sqrt(pow(getX()[0]-getx(),2)+pow(getY()[0]-gety(),2));
    public Cirle(){
        int[] a = {0};
        int[] b = {0};
        setX(a);
        setY(b);
        setx(100);
        sety(100);
        setColer("Color.BLACK");
        setName("cirle");
        setPaint(true);
    }
        public int getR() {
        return (int) sqrt(pow(getX()[0]-getx(),2)+pow(getY()[0]-gety(),2));
    }

    public void setR(int r) {
        this.r = r;
    }
    
}
