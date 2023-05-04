import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Hashtable;

public class Game extends JFrame implements KeyListener {
    private final Hashtable<String, Integer> keyBinds = new Hashtable<String, Integer>();
    private static FileReader reader;

    static {
        try {
            reader = new FileReader("src/Save");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public Game() {

    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        Integer key = e.getKeyCode();
        for(String i : keyBinds.keySet()) {
            if(keyBinds.get(i).equals(key)) {
                // lol
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
