package test05;

import java.awt.*;

public class Draw extends Canvas {
    public void drawRec(Rectangle a, Graphics g){
       g.drawRect((int)a.getAx(), (int)a.getBy(), (int)a.getWidth(), (int)a.getLength());
//       if (a.getFilled() == true){
//           g.setColor(a.getColor());
//       }
    }

//    public void drawCi(Circle c){
//        Graphics g;
//
//   }
}
