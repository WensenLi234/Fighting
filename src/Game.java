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


    public Game() throws IOException {
        initializeGUI();
        run();
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
        validate();
        repaint();
        frame.setVisible(true);
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
        }
    }
}
