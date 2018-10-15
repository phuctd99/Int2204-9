import java.util.ArrayList;
import java.util.Scanner;

public class Layer {
        public ArrayList<Shape> layer = new ArrayList<>();

            public boolean a;
            Scanner scanner = new Scanner(System.in);

 public void hinh()
    {
        int luachon;
        do {
            System.out.println("1: Triangle");
            System.out.println("2: Circle");
            System.out.println("3: Rectangle");
            System.out.println("4: Square");
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
                    luachon =5;
                    break;
                }
            }
            if(luachon == 5)
                break;

        }while (luachon>=1 && luachon <=5);
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
    public void print123()
    {
        for(int i=0; i<layer.size(); i++)
        {
            System.out.println(layer.get(i));
        }
    }
}
