import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class GamePanel extends JPanel {

    private BufferedImage background;

    private ArrayList<GUIElement> elements;

    private boolean hitboxVisible;
    public GamePanel(int width, int height) {
        super();
        hitboxVisible = false;
        elements = new ArrayList<>();
        setPreferredSize(new Dimension(width, height));
        setBounds(width, height, 0, 0);
    }
    public void setHitboxVisible(boolean bool) {
        hitboxVisible = bool;
    }
    public void setBackground(BufferedImage image) {
        background = image;
    }

    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(background, 0, 0, null);
        for(GUIElement element : elements) {
            if(!(element instanceof Hitbox) || hitboxVisible == true) {
                element.paint(g);
            }
        }
    }

    public void addElement(GUIElement element) {
        elements.add(element);
    }
}
