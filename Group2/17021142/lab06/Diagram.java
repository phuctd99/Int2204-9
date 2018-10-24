import java.util.ArrayList;

public class Diagram {
    ArrayList<Layer> diagram = new ArrayList<>();
    public void delateCircle(){
        for(int i=0; i<diagram.size(); i++){
            for(int j=0; j<diagram.get(i).layer.size(); j++){
                if(diagram.get(i).layer.get(i) instanceof Circle){
                    diagram.get(i).layer.remove(i);
                }
            }
        }
    }
    public void phanLoaiShape(){
        Layer shape = new Layer();
        Layer circle = new Layer();
        Layer triangle = new Layer();
        Layer square = new Layer();
        Layer rectangle = new Layer();
        Layer hexagon = new Layer();

        for(int i=0; i<diagram.size(); i++){
            for(int j=0; j<diagram.get(i).layer.size(); j++){
                if(diagram.get(i).layer.get(j) instanceof Circle){
                    circle.addShape(diagram.get(i).layer.get(j));
                }
                else{
                    if(diagram.get(i).layer.get(j) instanceof Triangle){
                        triangle.addShape(diagram.get(i).layer.get(j));
                    }
                    else{
                        if(diagram.get(i).layer.get(j) instanceof Square){
                            square.addShape(diagram.get(i).layer.get(j));
                        }
                        else{
                            if(diagram.get(i).layer.get(j) instanceof Rectangle){
                                rectangle.addShape(diagram.get(i).layer.get(j));
                            }
                            else{
                                if(diagram.get(i).layer.get(j) instanceof Hexagon){
                                    hexagon.addShape(diagram.get(i).layer.get(j));
                                }
                                else{
                                    shape.addShape(diagram.get(i).layer.get(j));
                                }
                            }
                        }
                    }
                }
            }
        }
        for(int i=0; i<diagram.size(); i++){
            diagram.remove(i);
        }
        diagram.add(shape);
        diagram.add(triangle);
        diagram.add(square);
        diagram.add(rectangle);
        diagram.add(hexagon);
        diagram.add(circle);
    }
}
