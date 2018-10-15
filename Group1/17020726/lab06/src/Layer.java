import java.util.ArrayList;

public class Layer
{
    ArrayList<Shape> layer = new ArrayList<Shape>();

    public void inputLayer()
    {
        Shape shape = new Rectangle();
        layer.add(shape);
        shape = new Square();
        layer.add(shape);
        shape = new Triangle();
        layer.add(shape);
        shape = new Circle();
        layer.add(shape);
    }

    public ArrayList<Shape> removeTriangle()
    {
        for (int i = layer.size() - 1; i >= 0; i--)
        {
            if (layer.get(i) instanceof Triangle)
            {
                layer.remove(i);
            }
        }
        return layer;
    }

    public ArrayList<Shape> removeCircle()
    {
        for (int i = 0; i < layer.size(); i++)
        {
            if (layer.get(i) instanceof Circle)
            {
                layer.remove(i);
            }
        }
        return layer;
    }

    void printOut()
    {
        for (Shape s : layer)
        {
            System.out.println( s.toString() );
        }
    }
}
