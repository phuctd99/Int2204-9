import java.util.ArrayList;
import java.util.Scanner;

public class Layer {
        public boolean visible = true;
        public ArrayList<Shape> layer = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public void addShape()
    {
        int luachon;
        do {
            System.out.println("1: Triangle");
            System.out.println("2: Circle");
            System.out.println("3: Rectangle");
            System.out.println("4: Square");
            System.out.println("5: Hexagon");
            luachon = scanner.nextInt();
            switch (luachon)
            {
                case 1:
                {
                    Shape triangle = new Triangle();
                    layer.add(triangle);
                    break;
                }
                case 2:
                {
                    Shape circle = new Circle();
                    layer.add(circle);
                    break;
                }
                case 3:
                {
                    Shape rectangle = new Rectangle();
                    layer.add(rectangle);
                    break;
                }
                case 4:
                {
                    Shape square = new Square();
                    layer.add(square);
                    break;
                }
                case 5:
                {
                    Shape hexagon = new Hexagon();
                    layer.add(hexagon);
                    break;
                }
                case 6:
                {
                    luachon =6;
                    break;
                }
            }
            if(luachon == 5)
                break;

        }while (luachon>=1 && luachon <=6);
    }

    public void phanloaiShape(ArrayList<Shape>circle,ArrayList<Shape>triangle,ArrayList<Shape>rectangle,ArrayList<Shape>saquare,ArrayList<Shape>hexagon )
    {
        for(int i=0; i<layer.size(); i++)
        {
            if(layer.get(i) instanceof Circle)
                circle.add(layer.get(i));
            if(layer.get(i) instanceof Triangle)
                circle.add(layer.get(i));
            if(layer.get(i) instanceof Rectangle)
                circle.add(layer.get(i));
            if(layer.get(i) instanceof Square)
                circle.add(layer.get(i));
            if(layer.get(i) instanceof Hexagon)
                circle.add(layer.get(i));
        }
    }
    public void removeTriangle()
    {
        for(int i=0; i<layer.size(); i++)
        {
            if(layer.get(i) instanceof Triangle)
            {
                layer.remove(i);
                i--;
            }
        }
    }

    public void removeshape()
    {

    }

    public void print123()
    {
        for(int i=0; i<layer.size(); i++)
        {
            System.out.println(layer.get(i));
        }
    }
}
