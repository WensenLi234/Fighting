import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Hashtable;

public class Player extends Character {
    private Hashtable<Move, String> moveInputs;
    public Player(String name, int health, ArrayList<Move> moveList, ArrayList<String> inputs, ImageElement sprite) {
        super(name, health, moveList, sprite);
        moveInputs = new Hashtable<>();
        for(int i = 0; i < moveList.size(); i++) {
            moveInputs.put(moveList.get(i), inputs.get(i));
        }
    }
    public Hashtable<Move, String> getMoveInputs() {
        return moveInputs;
    }
}
