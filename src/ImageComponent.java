import java.awt.*;
import java.awt.image.BufferedImage;

public class ImageComponent extends Component {
    private BufferedImage image;
    private int x;
    private int y;
    public ImageComponent(BufferedImage image, int x, int y) {
        this.image = image;
        this.x = x;
        this.y = y;
        paint(image.createGraphics());
    }
    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(image, x, y, null);
    }
}
