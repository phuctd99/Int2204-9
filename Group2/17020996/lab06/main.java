/**
 * Created by CCNE on 15/10/2018.
 */
public class main {
    public static void main(String[] args) {
        Diagram diagram = new Diagram();
        Layer layer = new Layer();
        Shape s1 = new rectangle(3,2);
        Shape s2 = new square(3);
        Shape s3 = new circle(4);
        Shape s4 = new triangle(1,2,3);
        layer.shapes.add(s1);
        layer.shapes.add(s2);
        layer.shapes.add(s3);
        layer.shapes.add(s4);
        diagram.layers.add(layer);
        for(Shape i : layer.shapes){
            System.out.println(i.out());
        }
        diagram.reMoveCircle();
        layer.reMoveTriangle();
        s1.moveTo(1,1);
        s2.moveTo(3,2);
        System.out.println("----------------------------------------------");
        for(Shape i : layer.shapes){
            System.out.println(i.out());
        }
    }
}
