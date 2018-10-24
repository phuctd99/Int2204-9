import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.AffineTransform;
import java.util.*;
import java.util.List;

public class Diagram extends JPanel {

    public List<Layer> layers = new ArrayList<>();

    //constructor
    public Diagram() {
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
    }


    //getter
    public String[] toList(int index) {
        return layers.get(index).toList();
    }

    public String[] toList() {
        String[] result = new String[layers.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = "Layer " + Integer.toString(i + 1);
        }
        return result;
    }

    //function
    public void addLayer() {
        layers.add(new Layer());
    }

    public void deleteLayer(int index) {
        layers.remove(index);
    }

    public void addShape(int index, Shape shape) {
        layers.get(index).shapes.add(shape);
    }

    public void paintComponent(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D)graphics;
        AffineTransform transform = graphics2D.getTransform();
        for (int i = 0; i < layers.size(); i++) {
            for (int j = 0; j < layers.get(i).shapes.size(); j++) {
                if (!layers.get(i).isVisible)
                    continue;
                graphics2D.setColor(layers.get(i).shapes.get(j).getColor());
                graphics2D.rotate(Math.toRadians(layers.get(i).shapes.get(j).getRotate()),
                                  layers.get(i).shapes.get(j).getMiddleX(),
                                  layers.get(i).shapes.get(j).getMiddleY());
                graphics2D.fill(layers.get(i).shapes.get(j).getShape());
                graphics2D.setTransform(transform);
            }
        }
    }

    public void deleteEmptyLayer() {
        for (int i = 0; i < layers.size(); i++) {
            if (layers.get(i).shapes.isEmpty()) {
                layers.remove(i);
                i--;
            }
        }
    }

    public void sortShape() {
        while (layers.size() < 5) {
            addLayer();
        }
        //Shape order: 0-Rectangle ; 1-Square; 2-Circle; 3-Triangle; 4-Hexagon
        for (int layerIndex = 0; layerIndex < layers.size(); layerIndex++) {
            setVisible(layerIndex, true);
            for (int shapeIndex = 0; shapeIndex < layers.get(layerIndex).shapes.size(); shapeIndex++) {
                Shape temp = layers.get(layerIndex).shapes.get(shapeIndex);
                if (temp instanceof Rectangle && layerIndex != 0) {
                    layers.get(layerIndex).shapes.remove(temp);
                    layers.get(0).shapes.add(temp);
                } else if (temp instanceof Square && layerIndex != 1) {
                    layers.get(layerIndex).shapes.remove(temp);
                    layers.get(1).shapes.add(temp);
                } else if (temp instanceof Circle && layerIndex != 2) {
                    layers.get(layerIndex).shapes.remove(temp);
                    layers.get(2).shapes.add(temp);
                } else if (temp instanceof Triangle && layerIndex != 3) {
                    layers.get(layerIndex).shapes.remove(temp);
                    layers.get(3).shapes.add(temp);
                } else if (temp instanceof Hexagon && layerIndex != 4) {
                    layers.get(layerIndex).shapes.remove(temp);
                    layers.get(4).shapes.add(temp);
                } else {
                    shapeIndex++;
                }
                shapeIndex--;
            }
        }
        deleteEmptyLayer();
    }

    public void setVisible(int index, boolean isVisible) {
        layers.get(index).isVisible = isVisible;
    }

    public boolean getIsVisible(int index) {
        return layers.get(index).isVisible;
    }
}
