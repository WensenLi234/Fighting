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
    private GamePanel panel;
    private BufferedImage background;

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
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addKeyListener(this);
        frame.setResizable(false);
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
