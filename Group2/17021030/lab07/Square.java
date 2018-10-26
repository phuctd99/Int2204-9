package lab07;

class Square extends Rectangle {
    // constructor
    public Square(Position vertex1, Position vertex2, Position vertex3, Position vertex4) {
        super(vertex1, vertex2, vertex3, vertex4);
    }
    
    public Square() {
    }
    // kiem tra hai hinh vuong trung nhau
    public boolean isTheSame(Square sqr) {
        boolean bool1 = sqr.getVertex1().equals(this.getVertex1());
        boolean bool2 = sqr.getVertex2().equals(this.getVertex2());
        boolean bool3 = sqr.getVertex3().equals(this.getVertex3());
        boolean bool4 = sqr.getVertex4().equals(this.getVertex4());
        return (bool1 && bool2 && bool3 && bool4);
    }
    // Override cac phuong thuc cua class Rectangle
    @Override
    public boolean isFilled() {
        return false;
    }

    @Override
    public boolean canBeMoved() {
        return true;
    }
    // kiem tra hai vuong co trung nhau khong
    @Override
    public boolean isTheSame(Object obj) {
        if (!(obj instanceof Square)) {
            return false;
        }
        Square sqr = (Square) obj;
        boolean bool1 = sqr.getVertex1().equals(this.getVertex1());
        boolean bool2 = sqr.getVertex2().equals(this.getVertex2());
        boolean bool3 = sqr.getVertex3().equals(this.getVertex3());
        boolean bool4 = sqr.getVertex4().equals(this.getVertex4());
        return (bool1 && bool2 && bool3 && bool4);
    }
}
