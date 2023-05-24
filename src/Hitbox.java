import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Hitbox extends GUIElement implements CollisionListener {
    private Rectangle2D rectangle;
    private int numHits;
    private int maxHits;
    public Hitbox(int x, int y, int width, int height, int maxHits) {
        super(x, y, width, height);

        rectangle = new Rectangle(x, y, width, height);
    }
    public Hitbox(Rectangle rectangle) {
        super(rectangle.width, rectangle.height, rectangle.x, rectangle.y);
        this.rectangle = rectangle;
    }
    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        g2D.setColor(Color.RED);
        g2D.draw(rectangle);
        g2D.fill(rectangle);
    }
}
