import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập số lượng layer:");
        int n = scan.nextInt();

        Diagram Diagram = new Diagram();

        
            Layer Layer = new Layer();
            
			Layer.Shapes.add(new Rectangle("Trên", 3.2, true, false, 2.1, 3.2));
			Layer.Shapes.add(new Circle("Trên", 2.0, true, true, 2.3));
			Layer.Shapes.add(new Circle("Trên", 2.0, true, true, 1.3));
			Diagram.CircleRemove();
			System.out.println("There are " + Layer.Shapes.size() + "shape(s)");

        }
    }
}
