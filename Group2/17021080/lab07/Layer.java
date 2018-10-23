package Bai_tap;

import java.util.ArrayList;

public class Layer {
    private ArrayList<Hinh_hoc > layer = new ArrayList<>();
    private int count = layer.size();
    private boolean visible = true;

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public ArrayList<Hinh_hoc> getLayer() {
        return layer;
    }

    public void setLayer(ArrayList<Hinh_hoc> layer) {
        this.layer = layer;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


    public Hinh_hoc get( int i) {
        return layer.get(i);
    }

    public void reset() {
        int size = layer.size();
        for (int i = 0; i<size; i++) {
            for (int j = i+1; j< size; j++ ) {
                if ( layer.get(i).hinhTrungNhau( layer.get(j)  )  ) {
                    layer.remove(j);
                    size--;
                }
            }
        }
    }

    public void add( Hinh_hoc hinh_hoc ) {
        layer.add(hinh_hoc);
    }

    public Layer chonHinhVuong() {
        Layer newLayer = new Layer();
        for (int i =0; i< layer.size(); i++) {
            if( layer.get(i).isHinhVuong() ) newLayer.add( layer.get(i) );
        }
        return newLayer;
    }

    public Layer chonHinhTron() {
        Layer newLayer = new Layer();
        for (int i =0; i< layer.size(); i++) {
            if( layer.get(i).isHinhTron() ) newLayer.add( layer.get(i) );
        }
        return newLayer;
    }

    public Layer chonHinhTamGiac() {
        Layer newLayer = new Layer();
        for (int i =0; i< layer.size(); i++) {
            if( layer.get(i).isHinhTamGiac() ) newLayer.add( layer.get(i) );
        }
        return newLayer;
    }

    public Layer chonHinhChuNhat() {
        Layer newLayer = new Layer();
        for (int i =0; i< layer.size(); i++) {
            if( layer.get(i).isHinhChuNhat() ) newLayer.add( layer.get(i) );
        }
        return newLayer;
    }

}
