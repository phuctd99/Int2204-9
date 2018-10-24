package com.company;

import javax.naming.event.ObjectChangeListener;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Diagram extends JPanel {

    private List<Layer> layerList = new ArrayList<Layer>();

    //constructor
    public Diagram() {
        setMaximumSize(new Dimension(400, 400));
        setMinimumSize(new Dimension(400, 400));
        setPreferredSize(new Dimension(400, 400));
    }

    //get List
    public List<Layer> getLayerList() {
        return layerList;
    }

    //get list in String[]
    public String[] toList() {
        String[] list = new String[layerList.size()];
        for (int i = 0; i < layerList.size(); i++) {
            list[i] = layerList.get(i).getName();
        }
        return list;
    }

    public Layer getIndexLayer(int index) {
        return layerList.get(index);
    }

    //draw all shape in diagram
    public void paint(Graphics graphics) {
        for (int i = 0; i < layerList.size(); i++) {
            layerList.get(i).paint(graphics);
        }
    }

    //delete all shape in choosed type
    public void detleteAllShapeInType(String type) {
            for (int i = 0; i < layerList.size(); i++) {
                layerList.get(i).removeAllShapeInType(type);
            }
    }

}
