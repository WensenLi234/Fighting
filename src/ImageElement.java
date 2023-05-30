import java.awt.*;
import java.awt.image.BufferedImage;

public class ImageElement extends GUIElement {
    private BufferedImage image;
    public ImageElement(int x, int y, BufferedImage image) {
        super(x, y);
        this.image = image;
    }
    public BufferedImage getImage() {
        return image;
    }
    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(image, getX(), getY(), null);
    }
}
