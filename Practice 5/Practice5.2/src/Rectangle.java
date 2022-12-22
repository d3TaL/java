import java.awt.*;
import java.awt.geom.GeneralPath;

public class Rectangle {
    int x, y, width, height;

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.RED);
        g2d.fillRect(10, 100, 100, 100);
        g2d.setColor(Color.BLACK);
        g2d.drawRect(10, 100, 100, 100);
    }

}
