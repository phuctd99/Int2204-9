import java.awt.Color;
import javax.swing.JFrame;
public abstract class Shape extends JFrame {
    Color color;
    public Color getColorString() {
        return color;
    }
    public void setColorString(Color color) {
        this.color = color;
    }
    // Constructor
    public Shape(Color color) {
        this.color = color;
    }
    // Return info
    public abstract String getInfo();

}