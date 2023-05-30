import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Hitbox extends GUIElement implements CollisionListener {
    private Rectangle rectangle;
    public Hitbox(int width, int height, int x, int y) {
        super(x, y);
        rectangle = new Rectangle(x, y, width, height);
    }
    public Hitbox(Rectangle rectangle) {
        super(rectangle.width, rectangle.height);
        this.rectangle = rectangle;
    }
    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        g2D.draw(rectangle);
    }

    @Override
    public boolean touches(Rectangle rectangle1, Rectangle rectangle2) {
        return false;
    }
}
