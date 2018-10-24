package Tuan7;

import java.util.ArrayList;


public class diagram {
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public diagram() {}

    public diagram(int width, int height) {
        this.width = width;
        this.height = height;
    }

    private ArrayList<layer> listLayer = new ArrayList<>();

    public ArrayList<layer> getListLayer() {
        return listLayer;
    }

    public void setListLayer(ArrayList<layer> listLayer) {
        this.listLayer = listLayer;
    }

    //xóa tất cả các hình là hình tròn
    public void removeAllCircle() {
        int sizeListLayer = listLayer.size();
        for (int i = 0; i < sizeListLayer; i++) {
            for (int j = listLayer.get(i).getListShape().size()-1; j >= 0; j--) {
                if (listLayer.get(i).getListShape().get(j) instanceof circle)
                    listLayer.get(i).getListShape().remove(j);
            }
        }
        System.out.println("Xóa thành công");
    }

    //chuyển từng loại hình vẽ vào từng layer
    public static void resetLayer(ArrayList<layer> listLayer) {
        int sizeListLayer = listLayer.size();
        ArrayList<shape> hexagonList = new ArrayList<>();
        ArrayList<shape> circleList = new ArrayList<>();
        ArrayList<shape> retangleList = new ArrayList<>();
        ArrayList<shape> squareList = new ArrayList<>();
        ArrayList<shape> triangleList = new ArrayList<>();
        for (int i = 0; i < sizeListLayer; i++) {
            for (int j=0; j <= listLayer.get(i).getListShape().size()-1; j++) {
                if (listLayer.get(i).getListShape().get(j) instanceof circle) {
                    circleList.add(listLayer.get(i).getListShape().get(j));
                }
                else if (listLayer.get(i).getListShape().get(j) instanceof hexagon) {
                    hexagonList.add(listLayer.get(i).getListShape().get(j));
                }
                else if (listLayer.get(i).getListShape().get(j) instanceof rectangle) {
                    retangleList.add(listLayer.get(i).getListShape().get(j));
                }
                else if (listLayer.get(i).getListShape().get(j) instanceof square) {
                    squareList.add(listLayer.get(i).getListShape().get(j));
                }
                else if (listLayer.get(i).getListShape().get(j) instanceof triangle) {
                    triangleList.add(listLayer.get(i).getListShape().get(j));
                }
            }
        }
        if( sizeListLayer==5) {
            listLayer.get(0).setListShape(circleList);
            listLayer.get(1).setListShape(hexagonList);
            listLayer.get(2).setListShape(retangleList);
            listLayer.get(3).setListShape(squareList);
            listLayer.get(4).setListShape(triangleList);
        }
        else if( sizeListLayer==4) {
            listLayer.get(0).setListShape(circleList);
            listLayer.get(1).setListShape(hexagonList);
            listLayer.get(2).setListShape(retangleList);
            listLayer.get(3).setListShape(squareList);
            layer layer = new layer();
            layer.setListShape(triangleList);
            listLayer.add(4, layer);
        }
        else if( sizeListLayer==3) {
            listLayer.get(0).setListShape(circleList);
            listLayer.get(1).setListShape(hexagonList);
            listLayer.get(2).setListShape(retangleList);
            layer layer1 = new layer();
            layer1.setListShape(squareList);
            listLayer.add(4, layer1);

            layer layer2 = new layer();
            layer2.setListShape(triangleList);
            listLayer.add(4, layer2);
        }
        else if( sizeListLayer==2) {
            listLayer.get(0).setListShape(circleList);
            listLayer.get(1).setListShape(hexagonList);
            layer layer1 = new layer();
            layer1.setListShape(retangleList);
            listLayer.add(4, layer1);

            layer layer2 = new layer();
            layer2.setListShape(squareList);
            listLayer.add(4, layer2);

            layer layer3 = new layer();
            layer3.setListShape(triangleList);
            listLayer.add(4, layer3);
        }
        else if( sizeListLayer==1) {
            listLayer.get(0).setListShape(circleList);

            layer layer1 = new layer();
            layer1.setListShape(hexagonList);
            listLayer.add(4, layer1);

            layer layer2 = new layer();
            layer2.setListShape(retangleList);
            listLayer.add(4, layer2);

            layer layer3 = new layer();
            layer3.setListShape(squareList);
            listLayer.add(4, layer3);

            layer layer4 = new layer();
            layer4.setListShape(triangleList);
            listLayer.add(4, layer4);
        }
    }

    //xóa hai hình trùng nhau
    public void deleteShape(ArrayList<layer> listLayer) {
        resetLayer(listLayer);
        for( int i=0; i<listLayer.size(); i++) {
            if( i==0 ) {
                ArrayList<shape> listCircle = listLayer.get(i).getListShape();
                for( int j=0; j<listCircle.size()-1; i++) {
                    for( int k=j+1; k<listCircle.size()-1; k++) {
                        if( ((circle) listCircle.get(k)).getCenter().getY() == ((circle) listCircle.get(j)).getCenter().getY()
                            && ((circle) listCircle.get(k)).getCenter().getX() == ((circle) listCircle.get(j)).getCenter().getX()
                            && ((circle) listCircle.get(k)).getRadius() == ((circle) listCircle.get(j)).getRadius())
                        {
                            listCircle.remove(k);
                            listLayer.get(i).getListShape().remove(k);
                            k--;
                        }
                    }
                }
            }

            if( i==1) {
                ArrayList<shape> hexagonList = listLayer.get(i).getListShape();

            }

            if( i==2) {
                ArrayList<shape> rectangleList = listLayer.get(i).getListShape();
                for( int j=0; j<rectangleList.size()-1; j++) {
                    for( int k=0; k<rectangleList.size()-1; k++) {
                        if( ((rectangle) rectangleList.get(j)).getTop_left().getY() == ((rectangle) rectangleList.get(k)).getTop_left().getY()
                        && ((rectangle) rectangleList.get(j)).getTop_left().getX() == ((rectangle) rectangleList.get(k)).getTop_left().getX()
                                && ((rectangle) rectangleList.get(j)).getBot_right().getX() == ((rectangle) rectangleList.get(k)).getBot_right().getX()
                                && ((rectangle) rectangleList.get(j)).getBot_right().getY() == ((rectangle) rectangleList.get(k)).getBot_right().getY() )
                        {
                            rectangleList.remove(k);
                            listLayer.get(i).getListShape().remove(k);
                            k--;
                        }
                    }
                }
            }

            if( i==3) {
                ArrayList<shape> squareList = listLayer.get(i).getListShape();
                for( int j=0; j<squareList.size()-1; j++) {
                    for( int k=0; k<squareList.size()-1; k++) {
                        if( ((square) squareList.get(j)).getTop_left().getY() == ((square) squareList.get(k)).getTop_left().getY()
                                && ((square) squareList.get(j)).getTop_left().getX() == ((square) squareList.get(k)).getTop_left().getX()
                        && ((square) squareList.get(j)).getBot_right().getY() == ((square) squareList.get(k)).getBot_right().getY()
                        && ((square) squareList.get(j)).getBot_right().getX() == ((square) squareList.get(k)).getBot_right().getX() )
                        {
                            squareList.remove(k);
                            listLayer.get(i).getListShape().remove(k);
                            k--;
                        }
                    }
                }
            }

            if( i==4) {
                ArrayList<shape> triangleList = listLayer.get(i).getListShape();
                for( int j=0; j<triangleList.size()-1; j++) {
                    for( int k=0; k<triangleList.size()-1; k++) {
                        if( ((triangle) triangleList.get(j)).getP1().getY() == ((triangle) triangleList.get(k)).getP1().getY()
                        && ((triangle) triangleList.get(j)).getP1().getX() == ((triangle) triangleList.get(k)).getP1().getX()
                        && ((triangle) triangleList.get(j)).getP2().getY() == ((triangle) triangleList.get(k)).getP2().getY()
                        && ((triangle) triangleList.get(j)).getP2().getX() == ((triangle) triangleList.get(k)).getP2().getX()
                        && ((triangle) triangleList.get(j)).getP3().getY() == ((triangle) triangleList.get(k)).getP3().getY()
                        && ((triangle) triangleList.get(j)).getP3().getX() == ((triangle) triangleList.get(k)).getP3().getX())
                        {
                            triangleList.remove(k);
                            listLayer.get(i).getListShape().remove(k);
                            k--;
                        }
                    }
                }
            }
        }
    }


}
