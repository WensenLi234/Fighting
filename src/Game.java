import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Arrays;
import java.util.Hashtable;

public class Game extends JFrame {
    private InputHandler inputHandler;
    private JFrame frame;
    private GamePanel panel;


    public Game() throws IOException {
        initializeGUI();
    }

    private void initializeGUI() throws IOException {
        inputHandler = new InputHandler();
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.addKeyListener(inputHandler);
        panel = new GamePanel(1000, 500);
        frame.add(panel);
        frame.pack();
        panel.setBackground(ImageIO.read(new File("backgrounds/amongUsCharacters.png")));
        panel.repaint();
        frame.setVisible(true);
    }

    private void drawImage(BufferedImage image, int x, int y) {
        Graphics2D g2D = (Graphics2D) panel.getGraphics();
        g2D.drawImage(image, x, y, 300, 300, null);
    }

}
