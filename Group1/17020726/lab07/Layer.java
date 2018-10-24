import java.util.ArrayList;

public class Layer {
    private boolean visible = true;
    private ArrayList<Shape> List = new ArrayList<Shape>();

    //Setter, getter
    public ArrayList<Shape> getList() {
        return List;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setListShapes(ArrayList<Shape> list) {
        this.List = list;
    }

    //Them mot hinh vao Layer
    public void add(Shape shape){
        List.add(shape);
    }

    //Xoa hinh
    public void removeSame(){
        for (int i = 0 ; i<List.size(); i++)
            for (int j = i+1;j<List.size();j++){
                if (List.get(i).equals(List.get(j)))
                    List.remove(j--);
            }
    }

    public void removeTriangle(){
        for (int i=0;i<List.size();i++) {
            if (List.get(i) instanceof  Triangle )
                List.remove(i--);

        }
    }

    public void removeCircle(){
        for (int i =0;i<List.size();i++) {
            if (List.get(i) instanceof Circle )
                List.remove(i--);
        }
    }

    @Override
    public String toString(){
        String s="";
        for (Shape shape:List) s+=shape.toString();
        return s+"\n";
    }
}

