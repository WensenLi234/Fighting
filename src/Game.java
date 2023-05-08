import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Hashtable;

public class Game extends JFrame implements KeyListener {
    private final Hashtable<String, Integer> keyBinds = new Hashtable<String, Integer>();
    private static BufferedReader reader;
    private JFrame frame;


    static {
        try {
            reader = new BufferedReader("src/Save");
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
        for(String i: keyBinds.keySet()) {
            if(key.equals(keyBinds.get(i))) {
                System.out.println("MY HEALTH IS BACK TO TIP TOP SHAPE");
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        Integer key = e.getKeyCode();
        for(String i: keyBinds.keySet()) {
            if(key.equals(keyBinds.get(i))) {
                System.out.println("DIEEEEEE");
            }
        }
    }
}
