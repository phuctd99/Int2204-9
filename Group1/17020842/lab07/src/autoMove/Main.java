/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoMove;

/**
 *
 * @author CACLV
 */

import javax.swing.JFrame;

/**
 *
 * @author CACLV
 */
public class Main {
    public static void main(String[] args) {
        drawCircle c = new drawCircle();
       // drawCircle c1 = new drawCircle();
        
        JFrame jf = new JFrame();
        jf.add(c);
        //jf.add(c1);
        //MovingAdapter ma = new MovingAdapter();
        jf.setVisible(true);
        jf.setSize(600, 400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
