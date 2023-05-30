import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Character extends Entity{
    private ArrayList<Move> moveList;
    private BufferedImage sprite;
    private boolean stunned;
    public Character(String name, int health, ArrayList<Move> moveList, BufferedImage sprite) {
        super(name, health);
        this.moveList = moveList;
        this.sprite = sprite;
        this.stunned = false;
    }
}
