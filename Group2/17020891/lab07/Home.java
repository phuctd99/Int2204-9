package com.company;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;


public class Home extends  JFrame{

    private JButton addLayerButton;
    private JPanel background;
    private JPanel navigation;
    private JPanel bodyPane;
    private JPanel topPane;
    private JList listLayer;
    private JTable propertyTable;
    private JPanel leftPane;
    private JButton addShapeButton;
    private JComboBox chooseNewShape;
    private JList listShape;
    private JRadioButton layerVisibleRadioButton;
    private JButton removeDuplicateButton;
    private Diagram diagram;


    public Home() {
        init();
        addLayerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Layer newLayer = new Layer("Layer " + diagram.getLayerList().size());
                diagram.getLayerList().add(newLayer);
                System.out.println(diagram.getLayerList().size());
                refreshListLayer();
            }
        });

        addShapeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (chooseNewShape.getSelectedItem().equals("Rectangle")) {
                    diagram.getIndexLayer(listLayer.getSelectedIndex()).addShape(new Retangle(300, 300, 100, 50, 0, "Rectangle " + diagram.getIndexLayer(listLayer.getSelectedIndex()).countRectangle()));
                    System.out.println(diagram.getIndexLayer(listLayer.getSelectedIndex()).getNumberShape());
                } else if (chooseNewShape.getSelectedItem().equals("Circle")) {
                    diagram.getIndexLayer(listLayer.getSelectedIndex()).addShape(new Circle(200, 200, 50, "Circle " + diagram.getIndexLayer(listLayer.getSelectedIndex()).countCircle()));
                    System.out.println(diagram.getIndexLayer(listLayer.getSelectedIndex()).getNumberShape());
                } else if (chooseNewShape.getSelectedItem().equals("Square")) {
                    diagram.getIndexLayer(listLayer.getSelectedIndex()).addShape(new Square(100, 100, 50, 0, "Square " + diagram.getIndexLayer(listLayer.getSelectedIndex()).countSquare()));
                    System.out.println(diagram.getIndexLayer(listLayer.getSelectedIndex()).getNumberShape());
                } else if (chooseNewShape.getSelectedItem().equals("Hexagon")) {
                    diagram.getIndexLayer(listLayer.getSelectedIndex()).addShape(new Hexagon(100, 100, 50, 0, "Hexagon " + diagram.getIndexLayer(listLayer.getSelectedIndex()).countHexagon()));
                    System.out.println(diagram.getIndexLayer(listLayer.getSelectedIndex()).getNumberShape());
                } else if (chooseNewShape.getSelectedItem().equals("Triangle")) {
                    diagram.getIndexLayer(listLayer.getSelectedIndex()).addShape(new Triangle(0, 100, 60, 60, 90, 150, "Triangle " + diagram.getIndexLayer(listLayer.getSelectedIndex()).countTriangle()));
                    System.out.println(diagram.getIndexLayer(listLayer.getSelectedIndex()).getNumberShape());
                }
                refreshListShape();
                updatePropertyTable();
                background.repaint();
            }
        });
        listLayer.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int index = e.getLastIndex();
//                System.out.println("Chọn layer " + index);
                if (index >= 0) {
                    listShape.setListData(diagram.getIndexLayer(index).toList());
                    refreshListShape();
                    background.repaint();
                }

            }
        });


        listShape.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                updatePropertyTable();
            }
        });


        //Update properties when change value
        propertyTable.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    System.out.println("Nhan enter");
                    changeShapeProperties();
                    updatePropertyTable();
                }
            }
        });

        //Set visible Layer
        layerVisibleRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Layer curent = diagram.getLayerList().get(listLayer.getSelectedIndex());
                if (layerVisibleRadioButton.isSelected()) {
                    for (int i = 0; i < curent.getListShape().size(); i++) {
                        curent.getListShape().get(i).setVisible(true);
                    }
                    System.out.println("Hien layer");
                } else {
                    for (int i = 0; i < curent.getListShape().size(); i++) {
                        curent.getListShape().get(i).setVisible(false);
                    }
                    System.out.println("An layer");
                }
                background.repaint();
                repaint();
            }
        });

        //Remove duplicate shape in the same layer
        removeDuplicateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Layer curent = diagram.getLayerList().get(listLayer.getSelectedIndex());
                curent.removeDuplicate();
                refreshListShape();
                background.repaint();
            }
        });
    }

    //update properties table
    public void updatePropertyTable() {
        int index = listShape.getSelectedIndex();
        if (index >= 0) {
            Shape current = diagram.getLayerList().get(listLayer.getSelectedIndex()).getListShape().get(index);
            propertyTable.setModel(new DefaultTableModel(current.getPropertyTable(), new Object[]{"Properties", "Value"}));
        } else {
            propertyTable.setModel(new DefaultTableModel());
        }

    }


    public void refreshListShape() {
        int index = listLayer.getSelectedIndex();
        if (index >= 0)
            listShape.setListData(diagram.getLayerList().get(index).toList());
        int indexShape = diagram.getLayerList().get(index).getListShape().size() - 1;
        if (indexShape >= 0) {
            listShape.setSelectedIndex(indexShape);
        }

        background.repaint();

    }

    public void refreshListLayer() {
        int index = diagram.getLayerList().size() - 1;
        System.out.println(index);
        listLayer.setListData(diagram.toList());
        if (index >= 0) {
            listLayer.setSelectedIndex(index);
        }
        background.repaint();
    }

    public void changeShapeProperties() {
        ArrayList<String> propertiesValue = new ArrayList<String>();
        int numRows = propertyTable.getRowCount();
        for (int i = 0; i < numRows; i++) {
            Object value = propertyTable.getValueAt(i, 1);
            if (value instanceof Integer) {
                propertiesValue.add(Integer.toString((int)value));
            } else if(value instanceof Double) {
                propertiesValue.add(Double.toString((double)value));
            } else {
                propertiesValue.add((String)value);
            }
        }

        Shape current = getSelectedShape();
        if (current instanceof  Square) {
            System.out.println("Day la hinh chu nhat");
            current.setX(Integer.parseInt(propertiesValue.get(0)));
            current.setY(Integer.parseInt(propertiesValue.get(1)));
            ((Square) current).setWidth(Integer.parseInt(propertiesValue.get(2)));
            ((Square) current).setHeight(Integer.parseInt(propertiesValue.get(2)));
            current.setRotate(Double.parseDouble(propertiesValue.get(4)));
            current.setColor(Integer.parseInt(propertiesValue.get(5)), Integer.parseInt(propertiesValue.get(6)), Integer.parseInt(propertiesValue.get(7)));
        } else if (current instanceof Retangle) {
            current.setX(Integer.parseInt(propertiesValue.get(0)));
            current.setY(Integer.parseInt(propertiesValue.get(1)));
            ((Retangle) current).setWidth(Integer.parseInt(propertiesValue.get(2)));
            ((Retangle) current).setHeight(Integer.parseInt(propertiesValue.get(3)));
            current.setRotate(Double.parseDouble(propertiesValue.get(4)));
        } else if (current instanceof Circle) {
            current.setX(Integer.parseInt(propertiesValue.get(0)));
            current.setY(Integer.parseInt(propertiesValue.get(1)));
            ((Circle) current).setRadius(Integer.parseInt(propertiesValue.get(2)));
        }
        background.repaint();

    }

    public Layer getSelectedLayer() {
        return diagram.getLayerList().get(listLayer.getSelectedIndex());
    }

    public Shape getSelectedShape() {
        return getSelectedLayer().getListShape().get(listShape.getSelectedIndex());
    }


    public void init() {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 600);
        setLocation(300, 200);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(2, 3));

        //diagram set up
        diagram = new Diagram();

        background.add(diagram);
        repaint();

        add(background);
        setVisible(true);
    }



    public static void main(String[] args) {
        new Home();
    }

}
