import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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
        if(inputs.size() > 0 && keysHeld.size() <= 0) {
            inputs.remove(0);
        }
        return recentInputs;
    }
    public boolean inputHeld(int key) {
        for(int i = 0; i < keysHeld.size(); i++) {
            if(keysHeld.get(i) == key) {
                return true;
            }
        }
        return false;
    }
    public boolean inputHeld(String input) {
        int key = keyBinds.get(input);
        return inputHeld(key);
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        Integer key = e.getKeyCode();
        for(String i: keyBinds.keySet()) {
            if(keyBinds.get(i).equals(key)) {
                if(!inputHeld(key)) {
                    keysHeld.add(key);
                    inputs.add(key);
                }
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        Integer key = e.getKeyCode();
        keysHeld.remove(key);
    }
}
