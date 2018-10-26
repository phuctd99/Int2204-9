import java.awt.Color;
public class Square extends Rectangle {
    public void setSide(int side) {
        this.width = this.height = side;
    }
    public int getSide() {
        return this.width;
    }
    // Constructor
    public Square(int side, int x, int y, Color color) {
        super(side, side, x, y, color);
    }
}