package DrawGraphics;

import BaiTapTuan6.Shape;
import BaiTapTuan6.Triangle;

import java.util.ArrayList;

public class Layer extends Diagram {
    ArrayList<Shape> listShape;

    Layer(){
        listShape = new ArrayList<>();
    }

    public void deleteTriangle(){
        for(int i = 0; i < listShape.size(); i++)
        {
            if(listShape.get(i) instanceof Triangle)
            {
//                System.out.println(((Triangle) listShape.get(i)).edge1);
                listShape.remove(listShape.get(i));
            }
        }
    }
}
