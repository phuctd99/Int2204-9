/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Draw extends JFrame{
    public static String selectShap = "";
	public static Color selectColor = Color.black;
	public static ArrayList<Paint> paint = new ArrayList<Paint>();
	private JPanel contentPane;
	public static Draw frame; 
        public static void main(String[] args) 
    {
    	try{
    		frame = new Draw();
    		frame.setVisible(true);
        }catch (Exception e) {
			e.printStackTrace();
		}
    }
    public Draw(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("DRAWSHAPE");
		setSize(1000, 600);
		setMinimumSize(getSize());
        
                // ve tren panel
                contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.setBackground(Color.white);
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel, BorderLayout.NORTH);
                
                //ve hcn
                JButton btnRect = new JButton("Rectangle");
		btnRect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				selectShap = "Rectangle";
			}
		});
		panel.add(btnRect);
                //ve hinh vuong
                JButton btnSquare = new JButton("Square");
		btnSquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				selectShap = "Square";
			}
		});
		panel.add(btnSquare);
                //ve tam giac
                JButton btnTri = new JButton("Triangle");
		btnTri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectShap = "Triangle";
			}
		});
		panel.add(btnTri);
                //ve luc giac
                JButton btnHex = new JButton("Hexagon");
		btnTri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectShap = "Hexagon";
			}
		});
		panel.add(btnHex);
                //ve hinh tron
                JButton btnCir = new JButton("Circle");
		btnCir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				selectShap = "Circle";
			}
		});
		panel.add(btnCir);
                // fill color 
                JButton btnFill = new JButton("Fillcolor");
		btnFill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectShap = "fill";
			}
		});
		panel.add(btnFill);
                //di chuyen
                JButton btnMove = new JButton("Move");
		btnMove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				selectShap = "move";
			}
		});
		panel.add(btnMove);
                //add color
                JPanel pnlColor = new JPanel();
		pnlColor.setSize(20, getHeight());
		contentPane.add(pnlColor, BorderLayout.SOUTH);
                Dimension SizeColorBox = new Dimension(20, 20);
		
		JButton btnC_Red = new JButton();
		btnC_Red.setPreferredSize(SizeColorBox);
		btnC_Red.setBackground(Color.red);
		btnC_Red.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectColor = Color.red;
			}
		});
		pnlColor.add(btnC_Red);
		//delete
                JButton btnDelete = new JButton("DeleteSameShape");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				selectShap = "Delete";
			}
		});
		panel.add(btnDelete);
		
		/*
		 * Add another button color
		 */
		JButton btnC_Blue = new JButton();
		btnC_Blue.setPreferredSize(SizeColorBox);
		btnC_Blue.setBackground(Color.blue);
		btnC_Blue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectColor = Color.blue;
			}
		});
		pnlColor.add(btnC_Blue);
		
		/*
		 * Add another button color
		 */
		JButton btnC_Green = new JButton();
		btnC_Green.setPreferredSize(SizeColorBox);
		btnC_Green.setBackground(Color.green);
		btnC_Green.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectColor = Color.green;
			}
		});
		pnlColor.add(btnC_Green);
		
		/*
		 * Add another button color
		 */
		JButton btnC_Cyan = new JButton();
		btnC_Cyan.setPreferredSize(SizeColorBox);
		btnC_Cyan.setBackground(Color.cyan);
		btnC_Cyan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectColor = Color.cyan;
			}
		});
		pnlColor.add(btnC_Cyan);
		
		/*
		 * Add another button color
		 */
		JButton btnC_DarkGray = new JButton();
		btnC_DarkGray.setPreferredSize(SizeColorBox);
		btnC_DarkGray.setBackground(Color.darkGray);
		btnC_DarkGray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectColor = Color.darkGray;
			}
		});
		pnlColor.add(btnC_DarkGray);
		
		/*
		 * Add another button color
		 */
		JButton btnC_Orange = new JButton();
		btnC_Orange.setPreferredSize(SizeColorBox);
		btnC_Orange.setBackground(Color.orange);
		btnC_Orange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectColor = Color.orange;
			}
		});
		pnlColor.add(btnC_Orange);
		
		/*
		 * Add another button color
		 */
		JButton btnC_Pink = new JButton();
		btnC_Pink.setPreferredSize(SizeColorBox);
		btnC_Pink.setBackground(Color.pink);
		btnC_Pink.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectColor = Color.pink;
			}
		});
		pnlColor.add(btnC_Pink);
		
		/*
		 * Add another button color
		 */
		JButton btnC_LightGray = new JButton();
		btnC_LightGray.setPreferredSize(SizeColorBox);
		btnC_LightGray.setBackground(Color.lightGray);
		btnC_LightGray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectColor = Color.lightGray;
			}
		});
		pnlColor.add(btnC_LightGray);
                //paint with mouse
                contentPane.add(new Paint_App(), BorderLayout.CENTER);
		validate();
    }
    
}
