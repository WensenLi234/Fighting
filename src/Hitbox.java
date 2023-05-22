import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Hitbox extends JComponent {
    private Rectangle2D rectangle;
    public Hitbox(int x, int y, int width, int height) {
        rectangle = new Rectangle(x, y, width, height);
    }
    public Hitbox(Rectangle rectangle) {
        this.rectangle = rectangle;

    }
    public void paintComponent(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        g2D.setColor(Color.RED);
        g2D.draw(rectangle);
    }
}
