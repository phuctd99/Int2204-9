import javax.swing.JFrame;
public class testmain extends JFrame {
    public static int WIDTH = 400;
    public static int HEIGHT = 400;
    public testmain() {
        setTitle("Shapes");
        setSize(WIDTH, HEIGHT);
        setVisible(true);
        setLocationRelativeTo(null);
        Paint panel = new Paint();
        add(panel);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        testmain test = new testmain();
        byte choose = 0;
        while (choose != 1) {
            Paint.seLect();
            System.out.println("Ket thuc. Chon Yes: 1 or No: 0");
            choose = Paint.scan.nextByte();
        }    
    }
}