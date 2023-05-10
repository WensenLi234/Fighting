import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;

public class Game extends JFrame implements KeyListener {
    private final Hashtable<String, Integer> keyBinds = new Hashtable<String, Integer>();
    private static BufferedReader reader;
    private JFrame frame;


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
        frame = new JFrame();
        frame.setSize(500, 500);
        frame.addKeyListener(this);
        frame.setVisible(true);
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
