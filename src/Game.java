import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Arrays;
import java.util.Hashtable;

public class Game extends JFrame implements Runnable{
    private InputHandler inputHandler;
    private JFrame frame;
    private GamePanel panel;

    public Game() throws IOException, InterruptedException {
        initializeGUI();
        //run();
    }

    private void initializeGUI() throws IOException, InterruptedException {
        inputHandler = new InputHandler();
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.addKeyListener(inputHandler);
        panel = new GamePanel(1000, 500);
        frame.add(panel);
        frame.pack();
        ImageElement img1 = new ImageElement(100, 100, ImageIO.read(new File("sprites/amongUsBLU.png")));
        ImageElement img2 = new ImageElement(100, 100, ImageIO.read(new File("sprites/img.png")));
        ImageElement[] baller = new ImageElement[2];
        baller[0] = img1;
        baller[1] = img2;
        Entity entity = new Entity("lol", 30, img1);
        Animation anims = new Animation(baller, 1, entity, this);
        panel.setBackground(ImageIO.read(new File("backgrounds/amongUsCharacters.png")));
        validate();
        repaint();
        frame.setVisible(true);
        anims.play(panel.getGraphics());
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            inputHandler.processInputs();
            panel.paint(panel.getGraphics());
        }
    }
}
