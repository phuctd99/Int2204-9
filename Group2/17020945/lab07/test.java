import javax.swing.JFrame;
public class test extends JFrame {
    static int WIDTH = 500;
    static int HEIGHT = 500;
    
    public test() {
        setTitle("Main");
        setSize(WIDTH, HEIGHT);
        setVisible(true);
        setLocationRelativeTo(null);
        Hinh panel = new Hinh();
        add(panel);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new test();
        byte choose = 0;
        while (choose != 1) {
            Hinh.seLect();
            choose = Hinh.scan.nextByte();
        }    
    }
}