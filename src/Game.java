import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Arrays;
import java.util.Hashtable;

public class Game extends JFrame implements KeyListener {
    private final Hashtable<String, Integer> keyBinds = new Hashtable<String, Integer>();
    private static BufferedReader reader;
    private JFrame frame;
    private ImageComponent background;

    static {
        try {
            reader = new BufferedReader(new FileReader("src/Save"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public Game() throws IOException {
        String[] keyBinds = reader.readLine().split(";");
        for(String bind : keyBinds) {
            this.keyBinds.put(bind.substring(0, bind.indexOf(":")), Integer.parseInt(bind.substring(bind.indexOf(":") + 1)));
        }
        initializeGUI();
    }
    private void initializeGUI() throws IOException {
        frame = new JFrame();
        frame.setSize(1000, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addKeyListener(this);
        frame.setResizable(false);
        frame.setVisible(true);
        background = new ImageComponent("backgrounds/amongUsCharacters.png", 0, 0);
        frame.add(background);
        frame.setVisible(true);
        frame.add(new Hitbox(0, 0, 300, 300));
        paintComponents(frame.getGraphics());
    }
    private void paintImage(BufferedImage image, int x, int y) {
        ImageComponent component = new ImageComponent(image, x, y);

        frame.add(component);
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        Integer key = e.getKeyCode();
        for(String i: keyBinds.keySet()) {
            if(key.equals(keyBinds.get(i))) {
                System.out.println(i);
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        Integer key = e.getKeyCode();
        for(String i: keyBinds.keySet()) {
            if(key.equals(keyBinds.get(i))) {

            }
        }
    }
}
