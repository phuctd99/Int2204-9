package lab07;

class Hexagon extends Shape {
    private Position vertex1;
    private Position vertex2;
    private Position vertex3;
    private Position vertex4;
    private Position vertex5;
    private Position vertex6;
    
    // constructor
    public Hexagon() {
    }

    public Hexagon(Position vertex1, Position vertex2, Position vertex3, Position vertex4, Position vertex5, Position vertex6) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.vertex3 = vertex3;
        this.vertex4 = vertex4;
        this.vertex5 = vertex5;
        this.vertex6 = vertex6;
    }
    
    // getter & setter

    public Position getVertex1() {
        return vertex1;
    }

    public void setVertex1(Position vertex1) {
        this.vertex1 = vertex1;
    }

    public Position getVertex2() {
        return vertex2;
    }

    public void setVertex2(Position vertex2) {
        this.vertex2 = vertex2;
    }

    public Position getVertex3() {
        return vertex3;
    }

    public void setVertex3(Position vertex3) {
        this.vertex3 = vertex3;
    }

    public Position getVertex4() {
        return vertex4;
    }

    public void setVertex4(Position vertex4) {
        this.vertex4 = vertex4;
    }

    public Position getVertex5() {
        return vertex5;
    }

    public void setVertex5(Position vertex5) {
        this.vertex5 = vertex5;
    }

    public Position getVertex6() {
        return vertex6;
    }

    public void setVertex6(Position vertex6) {
        this.vertex6 = vertex6;
    }
    
    // Override cac phuong thuc cua class Shape
    @Override
    public boolean isFilled() {
        return true;
    }

    @Override
    public boolean canBeMoved() {
        return true;
    }
    // kiem tra hai luc giac deu co trung nhau khong
    @Override
    public boolean isTheSame(Object obj) {
        if (!(obj instanceof Hexagon)) {
            return false;
        }
        Hexagon hex = (Hexagon) obj;
        boolean bool1 = hex.getVertex1().equals(this.getVertex1());
        boolean bool2 = hex.getVertex2().equals(this.getVertex2());
        boolean bool3 = hex.getVertex3().equals(this.getVertex3());
        boolean bool4 = hex.getVertex4().equals(this.getVertex4());
        boolean bool5 = hex.getVertex5().equals(this.getVertex5());
        boolean bool6 = hex.getVertex6().equals(this.getVertex6());
        return (bool1 && bool2 && bool3 && bool4 && bool5 && bool6);
    } 
   
    
    
    // lay ra do dai cac canh
    public double getE1() {
        double difX = vertex2.getX() - vertex1.getX();
        double difY = vertex2.getY() - vertex1.getY();
        return Math.sqrt(difX*difX + difY*difY);
    }
    
    public double getE2() {
        double difX = vertex3.getX() - vertex2.getX();
        double difY = vertex3.getY() - vertex2.getY();
        return Math.sqrt(difX*difX + difY*difY);
    }
    
    public double getE3() {
        double difX = vertex4.getX() - vertex3.getX();
        double difY = vertex4.getY() - vertex3.getY();
        return Math.sqrt(difX*difX + difY*difY);
    }
    
    public double getE4() {
        double difX = vertex5.getX() - vertex4.getX();
        double difY = vertex5.getY() - vertex4.getY();
        return Math.sqrt(difX*difX + difY*difY);
    }
    
    public double getE5() {
        double difX = vertex6.getX() - vertex5.getX();
        double difY = vertex6.getY() - vertex5.getY();
        return Math.sqrt(difX*difX + difY*difY);
    }
    
    public double getE6() {
        double difX = vertex1.getX() - vertex6.getX();
        double difY = vertex1.getY() - vertex6.getY();
        return Math.sqrt(difX*difX + difY*difY);
    }
    
    // tinh chu vi
    public double getPerimeter() {
        return getE1() + getE2() + getE3() + getE4() + getE5() + getE6();
    }
    
    // tinh dien tich
    public double getArea() {
        return ( (getE1()*getE1())*Math.sqrt(3)*3 )/2;
    }
}
