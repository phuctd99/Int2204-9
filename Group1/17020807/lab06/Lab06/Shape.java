abstract class Shape extends Layer {

    private String Address;
    private double Size;
    private boolean Movable;
    private boolean Filled;

    public Shape(String address, double size, boolean movable, boolean filled) {
        Address = address;
        Size = size;
        Movable = movable;
        Filled = filled;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public double getSize() {
        return Size;
    }

    public void setSize(double size) {
        Size = size;
    }

    public boolean isMovable() {
        return Movable;
    }

    public void setMovable(boolean Movable) {
        Movable = Movable;
    }

    public boolean isFilled() {
        return Filled;
    }

    public void setFilled(boolean filled) {
        Filled = filled;
    }
}
