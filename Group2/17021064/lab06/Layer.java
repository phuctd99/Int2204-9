import java.util.ArrayList;

public class Layer {
    private ArrayList<Shape> shapeArrayList = new ArrayList<>();

    public ArrayList<Shape> getShapeArrayList() {
        return shapeArrayList;
    }

    public void setShapeArrayList(ArrayList<Shape> shapeArrayList) {
        this.shapeArrayList = shapeArrayList;
    }

    public void delete() {
        for(int i= getShapeArrayList().size() -1 ; i >=0;i--){
            if(getShapeArrayList().get(i) instanceof Triangle ){
                getShapeArrayList().remove(i);
            }
        }
    }
}