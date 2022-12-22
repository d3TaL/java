import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class SwingOpenImage {
    public SwingOpenImage(String filepath){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame image = new JFrame("Your image");
                
                image.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                BufferedImage img = null;

                try{
                    img = ImageIO.read(new File(filepath));
                } catch (Exception e){
                    e.printStackTrace();
                }

                JLabel label = new JLabel(new ImageIcon(img));

                image.getContentPane().add(label, BorderLayout.CENTER);
                image.pack();
                image.setLocationRelativeTo(null);
                image.setVisible(true);
            }
        });
    }
    public static void main(String[] args) {
        new SwingOpenImage("C:\\Users\\belov\\OneDrive\\Изображения\\Frames\\1.jpg");
    }
}