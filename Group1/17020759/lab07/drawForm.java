package com.Draw;

import com.Shape.Circle;
import com.Shape.Hexagon;
import com.Shape.Location;
import com.Shape.Rectangle;
import com.Shape.Shape;
import com.Shape.Square;
import com.Shape.Triangle;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author phixuanhoan
 */
public class drawForm extends javax.swing.JFrame {

    //Mảng layer
    public static ArrayList<JPanel> arrLayout = new ArrayList();
    public ArrayList<ArrayList<Shape>> arrDiagram = new ArrayList();

    public drawForm() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Layout");
        jMenu1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jMenuItem1.setText("New Layout");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jMenuItem8.setText("Delete Same Shape");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("    Shape");
        jMenu3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jMenuItem2.setText("new Ractangle");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jMenuItem3.setText("new Square");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jMenuItem4.setText("new Circle");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jMenuItem5.setText("new Hexagon");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jMenuItem6.setText("new Triangle");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //new Layout
    int countLayout = 0;
    public static int layout;
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        countLayout++;
        JPanel jPanel1 = new JPanel();
        jPanel1.setBackground(Color.WHITE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 900, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 700, Short.MAX_VALUE)
        );
        String title = "Layout " + countLayout;
        jTabbedPane1.addTab(title, jPanel1);
        int index = jTabbedPane1.indexOfTab(title);
        JPanel pnlTab = new JPanel(new GridBagLayout());
        pnlTab.setOpaque(false);
        JLabel lblTitle = new JLabel(title);
        JButton btnClose = new JButton("x");
        btnClose.setName((countLayout - 1) + "");
        btnClose.addActionListener(this::closeTabLayout);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1;

        pnlTab.add(lblTitle, gbc);

        gbc.gridx++;
        gbc.weightx = 0;
        pnlTab.add(btnClose, gbc);

        jTabbedPane1.setTabComponentAt(index, pnlTab);
        jPanel1.setName((countLayout - 1) + "");
        arrLayout.add(jPanel1);

        //Shape
        arrDiagram.add(new ArrayList<Shape>());
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    public void closeTabLayout(java.awt.event.ActionEvent evt) {
        JButton b = (JButton) evt.getSource();
        System.out.print(arrLayout.get(0).getName());
        for (int i = 0; i < arrLayout.size(); i++) {
            if (b.getName().equals(arrLayout.get(i).getName())) {
                jTabbedPane1.removeTabAt(i);
                arrLayout.remove(i);
                break;
            }
        }
    }

    // hình chữ nhật
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        layout = jTabbedPane1.getSelectedIndex();
        this.setSize(900, 709);
        drawRactangle d;
        d = new drawRactangle(new Location(200, 200), new Location(400, 200), new Location(400, 300), new Location(200, 0454), Color.BLUE);
        //add vào list shape
        arrDiagram.get(layout).add(d);
        arrLayout.get(layout).add(d.draw());
        this.setSize(900, 710);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        layout = jTabbedPane1.getSelectedIndex();
        this.setSize(900, 709);
        drawRactangle d = new drawRactangle(new Location(100, 100), new Location(200, 100), new Location(200, 200), new Location(0, 200), Color.yellow);
        arrDiagram.get(layout).add(d);
        arrLayout.get(layout).add(d.draw());
        this.setSize(900, 710);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        layout = jTabbedPane1.getSelectedIndex();
        this.setSize(900, 709);
        drawCircle d1 = new drawCircle(new Location(0, 0), 100, Color.red);
        arrDiagram.get(layout).add(d1);
        arrLayout.get(layout).add(d1.draw());
        this.setSize(900, 710);
    }//GEN-LAST:event_jMenuItem4ActionPerformed
    // lục giác
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        layout = jTabbedPane1.getSelectedIndex();
        this.setSize(900, 709);
        drawHexagon d1 = new drawHexagon(new Location(0, 0), 100, Color.red);
        arrDiagram.get(layout).add(d1);
        arrLayout.get(layout).add(d1.draw());
        this.setSize(900, 710);
    }//GEN-LAST:event_jMenuItem5ActionPerformed
    // Tam giác
    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        layout = jTabbedPane1.getSelectedIndex();
        this.setSize(900, 709);
        String x1;
        String x2;
        String x3;
        String y1;
        String y2;
        String y3;
        try {
            x1 = JOptionPane.showInputDialog(null, "Nhập x1 :");
            y1 = JOptionPane.showInputDialog(null, "Nhập y1 :");
            x2 = JOptionPane.showInputDialog(null, "Nhập x2 :");
            y2 = JOptionPane.showInputDialog(null, "Nhập y2 :");
            x3 = JOptionPane.showInputDialog(null, "Nhập x3 :");
            y3 = JOptionPane.showInputDialog(null, "Nhập y3 : ");
            drawTriangle d1 = new drawTriangle(new Location(Integer.parseInt(x1), Integer.parseInt(y1)),
                    new Location(Integer.parseInt(x2), Integer.parseInt(y2)),
                    new Location(Integer.parseInt(x3), Integer.parseInt(y3)),
                    Color.red);
            arrDiagram.get(layout).add(d1);
            arrLayout.get(layout).add(d1.draw());
            this.setSize(900, 710);
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Dữ liệu không hợp lệ");
        }

    }//GEN-LAST:event_jMenuItem6ActionPerformed
    int clickMove = 0;    public boolean sameShape(Shape s1, Shape s2) {
        if (s1 instanceof Circle && s2 instanceof Circle) {
            if (((Circle) s1).sameCircle((Circle) s2)) {
                return true;
            }
        }
        if (s1 instanceof Rectangle && s2 instanceof Rectangle) {
            if (((Rectangle) s1).sameRectangle((Rectangle) s2)) {
                return true;
            }
        }
        if (s1 instanceof Square && s2 instanceof Square) {
            if (((Square) s1).sameSquare((Square) s2)) {
                return true;
            }
        }
        if (s1 instanceof Triangle && s2 instanceof Triangle) {
            if (((Triangle) s1).sameTriangle((Triangle) s2)) {
                return true;
            }
        }
        if (s1 instanceof Hexagon && s2 instanceof Hexagon) {
            if (((Hexagon) s1).sameHexagon((Hexagon) s2)) {
                return true;
            }
        }
        return false;
    }
    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        layout = jTabbedPane1.getSelectedIndex();
        System.out.println(arrLayout.get(layout).getComponentCount());
        System.out.println(arrDiagram.get(layout).size());
        for (int i = 0; i < arrDiagram.get(layout).size(); i++) {
            for (int j = i + 1; j < arrDiagram.get(layout).size(); j++) {
                if (sameShape(arrDiagram.get(layout).get(i), arrDiagram.get(layout).get(j)) == true) {
                    arrLayout.get(layout).remove(j);
                    arrDiagram.get(layout).remove(j);
                    System.out.println(j);
                    j--;
                }
            }
        }
        System.out.println(arrLayout.get(layout).getComponentCount());
        System.out.println(arrDiagram.get(layout).size());
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(drawForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(drawForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(drawForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(drawForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new drawForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
