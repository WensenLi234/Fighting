import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Character extends Entity{
    private ArrayList<Move> moveList;
    private BufferedImage sprite;
    public Character(String name, int health, ArrayList<Move> moveList, BufferedImage sprite) {
        super(name, health);
        this.moveList = moveList;
        this.sprite = sprite;
    }
}
