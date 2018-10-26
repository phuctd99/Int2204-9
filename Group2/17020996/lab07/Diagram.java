import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.image.VolatileImage;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.ArrayList;

public class Diagram extends JFrame {
	public Diagram() {
		JFrame frm = new JFrame();
		Layer layer = new Layer();
		frm.add(layer);
		frm.setTitle("Vẽ hình");
		frm.setSize(600, 600);
		frm.setLocationRelativeTo(null); 
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
	}

	private ArrayList<Layer> listLayer = new ArrayList<>();

	public ArrayList<Layer> getListLayer() {
		return listLayer;
	}

	public void setListLayer(ArrayList<Layer> listLayer) {
		this.listLayer = listLayer;
	}

	public void removeAllCircle() {
		for (int i = listLayer.size() - 1; i >= 0; i--) {
			for (int j = listLayer.get(i).getListShape().size() - 1; j >= 0; j--) {
				if (listLayer.get(i).getListShape().get(j) instanceof Circle)
					listLayer.get(i).getListShape().remove(j);
			}
		}
	}

}