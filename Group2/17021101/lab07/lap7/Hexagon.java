/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap7;

/**
 *
 * @author User
 */
public class Hexagon extends Shape{
    public Hexagon() {
        int[] a = {50,150,200,150,50,0};
        int[] b = {0,0,86,172,172,86};
        setX(a);
        setY(b);
        setx(100);
        sety(86);
        setColer("Color.BLACK");
        setName("hexagon");
        setPaint(true);
    }
}
