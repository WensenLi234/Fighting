import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Hashtable;

public class Game implements KeyListener {
    private Hashtable<String, Integer> keyBinds;
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

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
