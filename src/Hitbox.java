import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

public class Hitbox extends GUIElement implements CollisionListener{
    private static ArrayList<Hitbox> activeHitboxes = new ArrayList<>();
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
    public Rectangle getRectangle() {
        return rectangle;
    }
    public static ArrayList<Hitbox> getActiveHitboxes() {
        return activeHitboxes;
    }
    public static void removeHitbox(Hitbox hitbox) {
        activeHitboxes.remove(hitbox);
    }
    public static void addHitbox(Hitbox hitbox) {
        activeHitboxes.add(hitbox);
    }
    public void touched(Hitbox hitbox) {

    }
}
