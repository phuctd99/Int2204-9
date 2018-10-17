
public class Main {
    public static void main(String [] args){
        Diagram D = new Diagram();
        Layer L1 = new Layer();
        Layer L2 = new Layer();
        Rectangle R1 = new Rectangle("(1, 2)", 18, true, true, 2, 9);
        Rectangle R2 = new Rectangle("10, 20", 8, true, true, 2, 4);
        Square S1 = new Square("(1, 2)", 64, true, true, 8);
        Square S2 = new Square("(10, 20)", 16, true, true, 4);
        Triangle T1 = new Triangle("(1, 2)", 6, true, true, 3 , 4, 5);
        Triangle T2 = new Triangle("10, 20", 24, true, true, 6 , 8 ,10);
        Circle C1 = new Circle("(1, 2)", 18, true, true, 8);
        Circle C2 = new Circle("(10, 20)", 8, true, true, 2);

        L1.getShapes().add(R1);
        L1.getShapes().add(S1);
        L1.getShapes().add(T1);
        L1.getShapes().add(C1);

        L2.getShapes().add(R2);
        L2.getShapes().add(S2);
        L2.getShapes().add(T2);
        L2.getShapes().add(C2);

        D.getLayers().add(L1);
        D.getLayers().add(L2);

        D.removeCircle();
        D.getLayers().get(0).removeRectangle();
        D.getLayers().get(1).removeRectangle();
    }
}
