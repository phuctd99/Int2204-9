/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagram;

import java.awt.Color;

public class Hexagon extends Shape{
    
    public Hexagon(int _x, int _y, String name, Color color) {
        super(100, 86, "Hexagon", Color.YELLOW);
        int[] a = {50,150,200,150,50,0};
        int[] b = {0,0,86,172,172,86};
        setX(a);
        setY(b);
        
    }

    

    
    
}
