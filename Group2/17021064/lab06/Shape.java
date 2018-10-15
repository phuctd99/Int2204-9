public class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        this.color = "Red";
        this.filled = true;
    }

    public Shape(String colors, boolean filled) {
        this.color = colors;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String c) {
        this.color = c;
    }

    public boolean getFiller() {
        return this.filled;
    }

    public void setFiller(boolean f) {
        this.filled = f;
    }

    public String toString() {
        return "| Màu sắc: " + this.color + " | Filled: " + this.filled;
    }
}