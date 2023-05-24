import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class GamePanel extends JPanel {
    private BufferedImage background;

    public GamePanel(int width, int height) {
        super();
        setPreferredSize(new Dimension(width, height));
        setBounds(width, height, 0, 0);
    }

    public void setBackground(BufferedImage image) {
        background = image;
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(background, 0, 0, null);
    }
}
