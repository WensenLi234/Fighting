import java.awt.*;
import java.awt.image.BufferedImage;

public class ImageComponent extends Component {
    private BufferedImage image;
    public ImageComponent(BufferedImage image) {
        this.image = image;
        paint(image.createGraphics());
    }
    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(image, 0, 0, null);
    }
}
