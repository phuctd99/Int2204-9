package DrawGraphics;


import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Diagram extends JPanel {
    List<Diagram> listDiagram;

    Diagram(){
        listDiagram = new ArrayList<Diagram>();
    }

//    public void shapeByLayer(){
//        for(int i = 0; i < listDiagram.size() - 1; i++){
//            for(int j = i + 1; j < listDiagram.size(); j++){
//                if(listDiagram.get(i).equals(listDiagram.get(j))){
//                    listDiagram.remove(listDiagram.get(j));
//                }
//            }
//        }
//    }


//    public void deleteCircle(){
//        for(int i = 0; i < listDiagram.size(); i++)
//        {
//            if(listDiagram.get(i) instanceof  Circle) {
//                listDiagram.remove((listDiagram.get(i)));
//            }
//        }
//    }

    public void deleteCircle(){
        for(int i = 0; i < listDiagram.size(); i++)
        {
            for(int j = 0; j < listDiagram.size(); j++)
            {
                if(listDiagram.get(j) instanceof Circle)
                {
//                    System.out.println( ((Circle)listLayer.get(i).listShape.get(j)).getRadius());
                    listDiagram.get(i).remove(j);
                }
            }
        }
    }
}
