import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageComponent extends JComponent {
    private BufferedImage image;
    private int x;
    private int y;
    public ImageComponent(BufferedImage image, int x, int y) {
        this.image = image;
        this.x = x;
        this.y = y;
    }
    public ImageComponent(String fileName, int x, int y) throws IOException {
        this.image = ImageIO.read(new File(fileName));
        this.x = x;
        this.y = y;
    }
    public void paintComponent(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(image, x, y, null);
    }
}
