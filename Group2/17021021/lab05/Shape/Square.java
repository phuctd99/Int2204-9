package Shape;

public class Square extends Rectangle {

    //constructor
    public Square() {

    }

    public Square(double size) {
        length = size;
        width = size;
    }

    public Square(double size, String color, boolean filled) {
        super(size, size, color, filled);
    }


    //getter
    public double getSize() {
        return getWidth();
    }


    //setter
    public void setSize(double size) {
        width = size;
        length = size;
    }

    @Override
    public void setWidth(double size) {
        width = size;
        length = size;
    }

    @Override
    public void setLength(double size) {
        width = size;
        length = size;
    }

    @Override
    public String toString() {
        return "Square{" +
                "size=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
