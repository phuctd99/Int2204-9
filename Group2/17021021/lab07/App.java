import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class App {


    private JFrame frame;
    private JPanel background;
    private JPanel leftPanel;
    private JPanel rightPanel;
    private JPanel middlePanel;
    private JPanel topPanel;
    private JList listLayer;
    private JList listShape;
    private JButton addLayerButton;
    private JButton deleteLayerButton;
    private JComboBox addShapeBox;
    private JRadioButton visibleRadioButton;
    private JTable propertiesTable;
    private JPanel toolTop;
    private JPanel toolBottom;
    private JButton deleteShapeButton;
    private JButton sortButton;
    private JPanel bottomPanel;
    private JPanel leftSpace;
    private JPanel rightSpace;
    private JButton deleteDulicateButton;
    private JButton colorButton;
    private JButton moveUpButton;
    private JButton moveDownButton;
    private JColorChooser colorChooser = new JColorChooser();

    private Diagram diagram = new Diagram();

    private int layerIndex = -1;
    private int shapeIndex = -1;

    private int mousePressed;
    private int mouseX;
    private int mouseY;

    public App() {
        createAndShow();

        //set diagram in the center of middlePanel
        diagram.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        middlePanel.add(diagram, BorderLayout.CENTER);


        //setup lists
        updateListLayer();


        //repaint frame
        frame.repaint();

        diagram.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                mouseX = e.getX();
                mouseY = e.getY();
                mousePressed = e.getButton();
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        diagram.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if (layerIndex >= 0 && shapeIndex >= 0) {
                    Shape shape = diagram.layers.get(layerIndex).shapes.get(shapeIndex);
                    if (mousePressed == MouseEvent.BUTTON1) {
                        shape.setPosi(shape.getX() + e.getX() - mouseX, shape.getY() + e.getY() - mouseY);
                    } else if (mousePressed == MouseEvent.BUTTON3) {
                        shape.setRotate(shape.getRotate() + (e.getY() - mouseY) / 5.0);
                    }
                    mouseX = e.getX();
                    mouseY = e.getY();
                    updatePropertiesTable();
                    frame.repaint();
                }
            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });

        listLayer.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                layerIndex = listLayer.getSelectedIndex();
                if (layerIndex >= 0) {
                    visibleRadioButton.setSelected(diagram.getIsVisible(layerIndex));
                }
                updateListShape();
            }
        });


        //Listener
        addLayerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                diagram.addLayer();
                updateListLayer();
                listLayer.setSelectedIndex(diagram.layers.size() - 1);
                layerIndex = listLayer.getSelectedIndex();
                updateListShape();
            }
        });

        deleteLayerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetIndex();
                if (layerIndex >= 0) {
                    diagram.deleteLayer(layerIndex);
                    updateListLayer();
                    updateListShape();
                    frame.repaint();
                }
                layerIndex = listLayer.getSelectedIndex();
            }
        });

        addShapeBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = (String)addShapeBox.getSelectedItem();
                resetIndex();
                if (layerIndex >= 0) {
                    if (temp.equals("Rectangle")) {
                        diagram.addShape(layerIndex, new Rectangle());
                    } else if (temp.equals("Square")) {
                        diagram.addShape(layerIndex, new Square());
                    } else if (temp.equals("Triangle")) {
                        diagram.addShape(layerIndex, new Triangle());
                    } else if (temp.equals("Circle")) {
                        diagram.addShape(layerIndex, new Circle());
                    } else if (temp.equals("Hexagon")) {
                        diagram.addShape(layerIndex, new Hexagon());
                    }
                    updateListShape();
                    listShape.setSelectedIndex(diagram.layers.get(layerIndex).shapes.size() - 1);
                    frame.repaint();
                }
                addShapeBox.setSelectedIndex(0);
            }
        });

        visibleRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetIndex();
                if (layerIndex >= 0) {
                    diagram.setVisible(layerIndex, visibleRadioButton.isSelected());
                }
                frame.repaint();
            }
        });

        listShape.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                updatePropertiesTable();
            }
        });

        propertiesTable.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    double[] properties = new double[propertiesTable.getRowCount()];
                    for (int i = 0; i < properties.length; i++) {
                        Object data = propertiesTable.getValueAt(i, 1);
                        if (data instanceof Integer) {
                            properties[i] = (Integer) data;
                        } else if (data instanceof Double) {
                            properties[i] = (Double) data;
                        } else if (data instanceof String) {
                            try {
                                properties[i] = Double.valueOf((String) data);
                            } catch (Exception exception) {
                                properties[i] = 0;
                            }
                        }
                    }
                    diagram.layers.get(layerIndex).shapes.get(shapeIndex).setProperties(properties);
                    updatePropertiesTable();
                    frame.repaint();
                }
            }
        });

        deleteShapeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetIndex();
                if (shapeIndex >= 0) {
                    diagram.layers.get(listLayer.getSelectedIndex()).shapes.remove(shapeIndex);
                }
                frame.repaint();
                updateListShape();
            }
        });

        sortButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                diagram.sortShape();
                updateListLayer();
                updateListShape();
                frame.repaint();
            }
        });
        deleteDulicateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n = listLayer.getSelectedIndex();
                if (n >= 0) {
                    diagram.layers.get(n).deleteDulicate();
                    updateListShape();
                    frame.repaint();
                }
            }
        });

        colorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n = listShape.getSelectedIndex();
                if (n >= 0) {
                    Shape shape = diagram.layers.get(listLayer.getSelectedIndex()).shapes.get(n);
                    Color color = colorChooser.showDialog(null, "Please select a color", shape.getColor());
                    if (color != null) {
                        shape.setColor(color);
                    }
                    updatePropertiesTable();
                    frame.repaint();
                }
            }
        });

        moveUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (shapeIndex >= 0) {
                    if (shapeIndex != 0) {
                        Layer tempLayer = diagram.layers.get(layerIndex);
                        Shape tempShape = tempLayer.shapes.get(shapeIndex);
                        tempLayer.shapes.set(shapeIndex, tempLayer.shapes.get(shapeIndex - 1));
                        tempLayer.shapes.set(shapeIndex - 1, tempShape);
                        int temp = shapeIndex;
                        updateListShape();
                        listShape.setSelectedIndex(temp - 1);
                        frame.repaint();
                    }
                } else if (layerIndex >= 1) {
                    Layer temp = diagram.layers.get(layerIndex);
                    diagram.layers.set(layerIndex, diagram.layers.get(layerIndex - 1));
                    diagram.layers.set(layerIndex - 1, temp);
                    listLayer.setSelectedIndex(layerIndex - 1);
                    resetIndex();
                    frame.repaint();
                }
            }
        });

        moveDownButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (shapeIndex >= 0 && shapeIndex < diagram.layers.get(layerIndex).shapes.size() - 1) {
                    Layer tempLayer = diagram.layers.get(layerIndex);
                    Shape tempShape = tempLayer.shapes.get(shapeIndex);
                    tempLayer.shapes.set(shapeIndex, tempLayer.shapes.get(shapeIndex + 1));
                    tempLayer.shapes.set(shapeIndex + 1, tempShape);
                    int temp = shapeIndex;
                    updateListShape();
                    listShape.setSelectedIndex(temp + 1);
                    frame.repaint();
                } else if (layerIndex >= 0 && layerIndex < diagram.layers.size() - 1) {
                    Layer temp = diagram.layers.get(layerIndex);
                    diagram.layers.set(layerIndex, diagram.layers.get(layerIndex + 1));
                    diagram.layers.set(layerIndex + 1, temp);
                    listLayer.setSelectedIndex(layerIndex + 1);
                    resetIndex();
                    frame.repaint();
                }
            }
        });
    }

    public void updateListLayer() {
        listLayer.setListData(diagram.toList());
    }

    public void updateListShape() {
        resetIndex();
        if (layerIndex >= 0) {
            listShape.setListData(diagram.toList(layerIndex));
        } else {
            listShape.setModel(new DefaultListModel());
        }
    }

    public void updatePropertiesTable() {
        resetIndex();
        if (shapeIndex >= 0) {
            Shape current = diagram.layers.get(listLayer.getSelectedIndex()).shapes.get(shapeIndex);
            propertiesTable.setModel(new DefaultTableModel(current.getProperties(), new Object[] {"Name", "Value"}) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    if (propertiesTable.getValueAt(row, column).equals("value")) {
                        return false;
                    }
                    return column != 0;
                }
            });
        } else {
            propertiesTable.setModel(new DefaultTableModel());
        }
    }

    public void resetIndex() {
        layerIndex = listLayer.getSelectedIndex();
        shapeIndex = listShape.getSelectedIndex();
    }

    public void createAndShow() {
        frame = new JFrame("DrawingApp");
        frame.setSize(1080, 720);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(background);
    }


    public static void main(String[] args) {
        new App();
    }
}
