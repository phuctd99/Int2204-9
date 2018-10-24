package DrawGraphics;

import java.awt.*;

public class Square extends Rectangle{
    public Square(){

    }
    public Square(Color color, boolean filled, String name, int x1, int y1, int width, int height) {
        super(color, filled, name, x1, y1, width, height);
    }

    @Override
    public String toString() {
        return "Square{}";
    }

    private void doDrawing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
//        g2d.setPaint(new Color(150, 150, 150));

        RenderingHints rh = new RenderingHints(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        rh.put(RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY);

        g2d.setRenderingHints(rh);

        g2d.fillRect(20, 20, 50, 50);
        setForeground(color);
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }
}