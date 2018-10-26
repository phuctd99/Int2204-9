/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OppLab7;

import java.awt.Graphics;
import javax.swing.*;

/**
 *
 * @author Admin
 */
public class Shape extends JPanel{
    private String color;
    private boolean filled;
    private ToaDo td;
    public void setColor (String color) {
        this.color = color;
    }
    public String getColor() {
        return this.color;
    }
    
    public void setFilled(boolean filled) {
        this.filled = filled;
        
    }
    public boolean IsFilled () {
        return this.filled;
    }
    
    public void setToaDo(ToaDo td) {
        this.td = td;
        
    }
    public ToaDo getToaDo() {
        return td;
    }
    public void drawing() {
        repaint();
    }
    
    public Shape(String color, boolean filled, ToaDo td) {
        this.color = color;
        this.filled = filled;
        this.td = td;
    }
    
}
