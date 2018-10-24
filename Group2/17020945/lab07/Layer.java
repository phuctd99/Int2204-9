import java.util.ArrayList;
public class Layer{
    ArrayList <Shape> shape = new ArrayList<>();
    boolean visible;
    public boolean isVisible() {
        return visible;
    }
    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    public Layer(boolean visible) {
        this.visible = visible;
    }
    public ArrayList<Shape> getShapes() {
        return shape;
    }
    public void setShapes(ArrayList<Shape> shape) {
        this.shape = shape;
    }
    
    // xoa hinh tam giac
    public ArrayList <Shape> removeTriangle (){
        for( int i = 0; i < shape.size(); i++){
            if(shape.get(i) instanceof Triangle){
                shape.remove(i);
                i--;
            }
        }
        return shape;
    }
    // xoa hinh tron
    public ArrayList <Shape> removeCircle (){
        for( int i = 0; i < shape.size(); i++){
            if(shape.get(i) instanceof Circle){
                shape.remove(i);
                i--;
            }
        }
        return shape;
    }

    // xoa hinh tron trung nhau
    public void xoaCircleTrungNhau() {
        ArrayList<Circle> list = new ArrayList<>();
        for (int i = 0; i < shape.size(); i++) {
            if (shape.get(i) instanceof Circle) {
                list.add((Circle) shape.get(i));
            }
        }
        for (int i = 0; i < shape.size(); i++) {
            if (shape.get(i) instanceof Circle) {
                shape.remove(i);
                i--;
            }
        }
        int ht = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).x == list.get(i + 1).x && list.get(i).radius == list.get(i + 1).radius
                && list.get(i).y == list.get(i + 1).y && list.get(i).color == list.get(i + 1).color) {
                list.remove(i);
                ht++;
                i--;
            }
        }
        System.out.println("So hinh tron trung nhau: " + (ht + 1));
        
        for (int i = 0; i < list.size(); i++) {
            shape.add(list.get(i));
        }
    }
}