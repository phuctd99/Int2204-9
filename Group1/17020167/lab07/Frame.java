package newlab07;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Frame extends JFrame {

    public static int _width;
    public static int _height;
    public ArrayList<Layer> listLayer = new ArrayList<>();
    public JTabbedPane tp = new JTabbedPane();

    ;
    
    public Frame(int width, int height) {
        setTitle("Graphicshow");
        _width = width;
        _height = height;
        setSize(_width, _height);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        creMenu();
        getContentPane().add(tp);
        setVisible(true);
    }

    public void creMenu() {
        JMenuBar menuBar = new JMenuBar();

        JMenu menuAction = new JMenu("Menu");
        menuBar.add(menuAction);
        JMenuItem addLayer = new JMenuItem("Layer mới");
        menuAction.add(addLayer);
        addLayer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Layer layerAdd = new Layer();
                tp.addTab("Layer " + (tp.getTabCount() + 1), layerAdd);
                listLayer.add(layerAdd);
            }

        });

        this.setJMenuBar(menuBar);
    }


    public static void main(String[] args) {
        Frame f = new Frame(1000, 600);
    }
}
