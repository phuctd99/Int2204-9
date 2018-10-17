public class main {

    public static void main(String[] args) {
        Diagram diagramg = new Diagram();
        Layer lay1 = new Layer();
        Layer lay2 = new Layer();
        Location A = new Location(0, 0);
        Location B = new Location(0, 1);
        Location C = new Location(1, 1);
        Location D = new Location(1, 0);
        Circle cr = new Circle(2, A, "red", true);
        Rectangle rec = new Rectangle(A, B, C, D, "blue", true);
        Square sq = new Square(A, B, C, D, "yellow", true);
        Triangle tri = new Triangle(A, B, C, "green", true);
        lay1.getShapeArrayList().add(cr);
        lay1.getShapeArrayList().add(rec);
        lay1.getShapeArrayList().add(sq);
        lay1.getShapeArrayList().add(tri);

        lay2.getShapeArrayList().add(sq);
        lay2.getShapeArrayList().add(rec);

        diagramg.getLayerArrayList().add(lay1);
        diagramg.getLayerArrayList().add(lay2);
        diagramg.delete();
        lay1.delete();

        for (int i = 0; i < diagramg.getLayerArrayList().size(); i++) {
            for (int j = 0; j < diagramg.getLayerArrayList().get(i).getShapeArrayList().size(); j++)
                System.out.println(diagramg.getLayerArrayList().get(i).getShapeArrayList().get(j).toString());
        }
    }
}