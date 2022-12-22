import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.io.File;
import java.util.Random;

public class ImageViewer {

    JPanel gui;
    /** Displays the image. */
    JLabel imageCanvas;

    /** Set the image as icon of the image canvas (display it). */
    public void setImage(Image image) {
        imageCanvas.setIcon(new ImageIcon(image));
    }

    public void initComponents() {
        if (gui==null) {
            gui = new JPanel(new BorderLayout());
            gui.setBorder(new EmptyBorder(5,5,5,5));
            imageCanvas = new JLabel();

            JPanel imageCenter = new JPanel(new GridBagLayout());
            imageCenter.add(imageCanvas);
            JScrollPane imageScroll = new JScrollPane(imageCenter);
            imageScroll.setPreferredSize(new Dimension(300,100));
            gui.add(imageScroll, BorderLayout.CENTER);
        }
    }

    public Container getGui() {
        initComponents();
        return gui;
    }

    public static void main(String[] args) throws Exception {
        String path = "C:\\Users\\belov\\OneDrive\\Изображения\\Frames\\";
        final int[] counter = {0};
        Runnable r = new Runnable() {
            @Override
            public void run() {
                JFrame f = new JFrame("Image Viewer");
                // TODO Fix kludge to kill the Timer
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                final ImageViewer viewer = new ImageViewer();
                f.setContentPane(viewer.getGui());

                f.pack();
                f.setLocationByPlatform(true);
                f.setVisible(true);

                ActionListener animate = new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent arg0) {
                        counter[0] +=1;
                        BufferedImage img = null;
                        if (counter[0] >59){
                            throw new IllegalArgumentException();
                        }
                        try{
                            img = ImageIO.read(new File(path + Integer.toString(counter[0]) + ".jpg"));
                        } catch (Exception e){
                            e.printStackTrace();
                        }
                        viewer.setImage(new ImageIcon(img).getImage());
                    }
                };
                Timer timer = new Timer(16,animate);
                timer.start();
                if (counter[0]>59){
                    timer.stop();
                }
            }
        };
        SwingUtilities.invokeLater(r);
    }
}
