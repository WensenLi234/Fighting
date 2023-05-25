import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;

public class InputHandler implements KeyListener {
    private final Hashtable<String, Integer> keyBinds = new Hashtable<String, Integer>();
    private ArrayList<Integer> inputs;
    private ArrayList<Integer> keysHeld;
    private BufferedReader keyBindReader;

    public InputHandler() throws IOException {
        keyBindReader = new BufferedReader(new FileReader("src/Save"));
        inputs = new ArrayList<>();
        keysHeld = new ArrayList<>();
        String[] keyBinds = keyBindReader.readLine().split(";");
        for(String bind : keyBinds) {
            this.keyBinds.put(bind.substring(0, bind.indexOf(":")), Integer.parseInt(bind.substring(bind.indexOf(":") + 1)));
        }
    }

    public Integer[] processInputs() {
        Integer[] recentInputs = inputs.toArray(new Integer[0]);
        inputs.clear();
        return recentInputs;
    }

    public int keyHeld(Integer key) {
        for(int i = 0; i < keysHeld.size(); i++) {
            if(keysHeld.get(i) == key.intValue()) {
                return i;
            }
        }
        return -1;
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        Integer key = e.getKeyCode();
        for(String i: keyBinds.keySet()) {
            if(keyHeld(key) < 0) {
                keysHeld.add(key);
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        Integer key = e.getKeyCode();
        int heldIndex = keyHeld(key);
        if(heldIndex >= 0) {
            keysHeld.remove(heldIndex);
        }
    }
}
