import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.Random;

class Main extends JPanel {
    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }
    private void doDrawing(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;
        Random rand = new Random();
        for (int i = 0; i<20; i++){
        int choice = rand.nextInt(3);
        switch (choice){
            case (1):
                g2d.fillRect(rand.nextInt(10) + 20, rand.nextInt(200) + 20, 50, 50);
                g2d.setPaint(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
                break;
            case (2):
                g2d.fill(new Ellipse2D.Double(rand.nextInt(200) + 20, rand.nextInt(100) + 20, 80, 100));
                g2d.setPaint(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
                break;
            case(3):
                g2d.fillOval(rand.nextInt(100) + 20, rand.nextInt(100) + 20, 50, 50);
                g2d.setPaint(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
                break;
        }}
//        g2d.fillRect(30, 20, 50, 50);
//        g2d.fillRect(120, 20, 90, 60);
//        g2d.fillRoundRect(250, 20, 70, 60, 25, 25);
//
//        g2d.fill(new Ellipse2D.Double(10, 100, 80, 100));
//        g2d.fillArc(120, 130, 110, 100, 5, 150);
//        g2d.fillOval(270, 130, 50, 50);
    }

}
public class BasicShapesEx extends JFrame {

    public BasicShapesEx() {

        initUI();
    }

    private void initUI() {
        add(new Main());
        setTitle("Basic shapes");
        setSize(350, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                BasicShapesEx ex = new BasicShapesEx();
                ex.setVisible(true);
            }
        });
    }
}

