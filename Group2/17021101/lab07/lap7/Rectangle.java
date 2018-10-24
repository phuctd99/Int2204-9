/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap7;

import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 *
 * @author User
 */
public class Rectangle extends Shape{
    public Rectangle() {
        int[] a = {0,200,0,0,0,0};
        int[] b = {0,0,0,0,0,0};
        setX(a);
        setY(b);
        setx(100);
        sety(50);
        setColer("Color.BLACK");
        setName("rectangle");
        setPaint(true);
    }
        public void timToaDo(int[] x, int[] y,int a,int b) {
        x[2] = a*2 - x[0];
        y[2] = b*2 - y[0];
        x[3] = a*2 - x[1];
        y[3] = b*2 - y[1];
    }
}
