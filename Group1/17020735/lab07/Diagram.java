import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.border.EmptyBorder;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
public class Diagram extends JFrame {

    public static String selection = "";
    public static Color selectionColor = Color.BLACK;
    public static ArrayList<Layer> listLayer = new ArrayList<>();
    private final JPanel contentPane;

    Diagram() {

        Toolkit toolkit = this.getToolkit();
        this.setBounds(toolkit.getScreenSize().width / 4, toolkit.getScreenSize().height / 4,
                toolkit.getScreenSize().width / 2,toolkit.getScreenSize().height / 2);
//        this.setBounds(0,0,1600,900);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("Graphics App");
        this.setVisible(true);



        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu mnMenu = new JMenu("Menu");
        menuBar.add(mnMenu);


        JMenuItem mntmNew = new JMenuItem("New");
        mntmNew.addActionListener((ActionEvent arg0) -> {
            selection = "";
            listLayer.get(0).getListShape().clear();
            repaint();
        });
        mnMenu.add(mntmNew);

        JMenuItem mntmNew_2 = new JMenuItem("Exit");
        mntmNew_2.addActionListener((ActionEvent arg0) -> {
            System.exit(0);
        });
        mnMenu.add(mntmNew_2);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        contentPane.setBackground(Color.white);
        setContentPane(contentPane);

        JPanel selectionPanel = new JPanel();
        selectionPanel.setBackground(Color.darkGray);
        contentPane.add(selectionPanel, BorderLayout.NORTH);

        JButton pointButton = new JButton("Point");
        pointButton.addActionListener((ActionEvent arg0) -> {
            selection = "Point";
        });
        selectionPanel.add(pointButton);

        /*
         * Button selected draw Line
         */
        JButton lineButton = new JButton("Line");
        lineButton.addActionListener((ActionEvent e) -> {
            selection = "Line";
        });
        selectionPanel.add(lineButton);

        /*
         * Button selected draw Rectangle
         */
        JButton rectangleButton = new JButton("Rectangle");
        rectangleButton.addActionListener((ActionEvent arg0) -> {
            selection = "Rectangle";
        });
        selectionPanel.add(rectangleButton);



        /*
         * Button selected draw Square
         */
        JButton squareButton = new JButton("Square");
        squareButton.addActionListener((ActionEvent arg0) -> {
            selection = "Square";
        });
        selectionPanel.add(squareButton);

        /*
         * Button selected draw Triangle
         */
        JButton triangleButton = new JButton("Triangle");
        triangleButton.addActionListener((ActionEvent e) -> {
            selection = "Triangle";
        });
        selectionPanel.add(triangleButton);

        /*
         * Button selected draw Circle
         */
        JButton circleButton = new JButton("Circle");
        circleButton.addActionListener((ActionEvent arg0) -> {
            selection = "Circle";
        });
        selectionPanel.add(circleButton);

        /*
         * Button selected fill color to shape
         */
        JButton fillButton = new JButton("Fillcolor");
        fillButton.addActionListener((ActionEvent e) -> {
            selection = "Fill";
        });
        selectionPanel.add(fillButton);


        /*
         * Button move shape by mouse
         */
        JButton moveButton = new JButton("Move");
        moveButton.addActionListener((ActionEvent arg0) -> {
            selection = "Move";
        });
        selectionPanel.add(moveButton);

        /*
         * Button delete shape by mouse click
         */
        JButton deleteButton = new JButton("Delete");
        deleteButton.addActionListener((ActionEvent arg0) -> {
            selection = "Delete";
        });
        selectionPanel.add(deleteButton);

        JPanel colorPanel = new JPanel();
        colorPanel.setBackground(Color.darkGray);
        contentPane.add(colorPanel, BorderLayout.SOUTH);


        /*
         * Add another button color
         */
        Dimension SizeColorBox = new Dimension(20, 20);

        JButton redButton = new JButton();
        redButton.setPreferredSize(SizeColorBox);
        redButton.setBackground(Color.red);
        redButton.addActionListener((ActionEvent e) -> {
            selectionColor = Color.red;
        });
        colorPanel.add(redButton);


        /*
         * Add another button color
         */
        JButton blueButton = new JButton();
        blueButton.setPreferredSize(SizeColorBox);
        blueButton.setBackground(Color.blue);
        blueButton.addActionListener((ActionEvent e) -> {
            selectionColor = Color.blue;
        });
        colorPanel.add(blueButton);

        /*
         * Add another button color
         */
        JButton greenButton = new JButton();
        greenButton.setPreferredSize(SizeColorBox);
        greenButton.setBackground(Color.green);
        greenButton.addActionListener((ActionEvent e) -> {
            selectionColor = Color.green;
        });
        colorPanel.add(greenButton);

        /*
         * Add another button color
         */
        JButton cyanButton = new JButton();
        cyanButton.setPreferredSize(SizeColorBox);
        cyanButton.setBackground(Color.cyan);
        cyanButton.addActionListener((ActionEvent e) -> {
            selectionColor = Color.cyan;
        });
        colorPanel.add(cyanButton);

        /*
         * Add another button color
         */
        JButton darkGrayButton = new JButton();
        darkGrayButton.setPreferredSize(SizeColorBox);
        darkGrayButton.setBackground(Color.darkGray);
        darkGrayButton.addActionListener((ActionEvent e) -> {
            selectionColor = Color.darkGray;
        });
        colorPanel.add(darkGrayButton);

        /*
         * Add another button color
         */
        JButton orangeButton = new JButton();
        orangeButton.setPreferredSize(SizeColorBox);
        orangeButton.setBackground(Color.orange);
        orangeButton.addActionListener((ActionEvent e) -> {
            selectionColor = Color.orange;
        });
        colorPanel.add(orangeButton);

        /*
         * Add another button color
         */
        JButton pinkButton = new JButton();
        pinkButton.setPreferredSize(SizeColorBox);
        pinkButton.setBackground(Color.pink);
        pinkButton.addActionListener((ActionEvent e) -> {
            selectionColor = Color.pink;
        });
        colorPanel.add(pinkButton);

        /*
         * Add another button color
         */
        JButton lightGrayButton = new JButton();
        lightGrayButton.setPreferredSize(SizeColorBox);
        lightGrayButton.setBackground(Color.lightGray);
        lightGrayButton.addActionListener((ActionEvent e) -> {
            selectionColor = Color.lightGray;
        });
        colorPanel.add(lightGrayButton);

        JPanel paint = new JPanel();
        contentPane.add(new Paint(), BorderLayout.CENTER);
        validate();

    }


}
