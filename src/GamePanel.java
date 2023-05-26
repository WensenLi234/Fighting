import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class GamePanel extends JPanel {

    private BufferedImage background;

    private ArrayList<ImageElement> images;

    public GamePanel(int width, int height) {
        super();
        images = new ArrayList<>();
        setPreferredSize(new Dimension(width, height));
        setBounds(width, height, 0, 0);
    }
    public void setBackground(BufferedImage image) {
        background = image;
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(background, 0, 0, null);
        for(ImageElement image : images) {
            g2d.drawImage(image.getImage(), image.getX(), image.getY(), null);
        }
    }

    public void addImage(ImageElement image) {
        images.add(image);
    }
}
