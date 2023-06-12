import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

public class Game extends JFrame implements Runnable{
    private InputHandler inputHandler;
    private JFrame frame;
    private GamePanel panel;

    private Character player1;
    private Character player2;
    public Game() throws IOException, InterruptedException {
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
        BufferedImage image = ImageIO.read(new File("sprites/img.png"));
        ImageElement entitySprite = new ImageElement(0, 0, image);
        ImageElement[] frames = {entitySprite, entitySprite, entitySprite, entitySprite, entitySprite, entitySprite, entitySprite, new ImageElement(0, 0, ImageIO.read(new File("sprites/amongUsBLU.png")))};
        Animation animation = new Animation(frames);
        Hitbox box = new Hitbox(100, 200, 0, 0);
        Hitbox[] boxes = {box};
        Move move = new Move(boxes, animation);
        player1 = new Character("Player1", 100, new ArrayList<>(), entitySprite);
        frame.add(panel);
        frame.pack();
        panel.setBackground(ImageIO.read(new File("backgrounds/amongUsCharacters.png")));
        validate();
        repaint();
        frame.setVisible(true);
    }
    private void processHits() {

    }
    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(16);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Integer[] inputs = inputHandler.processInputs();
            if(inputHandler.inputHeld("Down")) {

            }
            if(inputHandler.inputHeld("Left")) {
                player1.setX(player1.getX() - 10);
            }
            if(inputHandler.inputHeld("Right")) {
                player1.setX(player1.getX() + 10);
            }
            if(inputHandler.inputHeld("Up")) {

            }
            panel.paint(panel.getGraphics());
            repaint();
        }
    }
}
