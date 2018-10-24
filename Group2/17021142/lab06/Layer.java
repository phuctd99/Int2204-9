import java.util.ArrayList;

public class Layer {
    ArrayList<Shape> layer = new ArrayList<>();
    boolean visiable;
    // xóa tam giác
    public void deleteTriangle() {
        for (int i = 0; i < layer.size(); i++) {
            if (layer.get(i) instanceof Triangle) {
                layer.remove(i);
            }
        }
    }
    // xóa trùng
    public void deleteTrung(){
        for(int i=0; i<layer.size(); i++){
            for(int j=i+1; j<layer.size(); j++){
                if( layer.get(i).equals(layer.get(j))){
                    layer.remove(j);
                }
            }
        }
    }
    // thêm, sử dụng để thêm khi
    public void addShape( Shape shape){
        layer.add(shape);
    }
}
