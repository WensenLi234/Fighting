import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Character extends Entity{
    private ArrayList<Move> moveList;
    private boolean stunned;
    public Character(String name, int health, ArrayList<Move> moveList, ImageElement sprite) {
        super(name, health, sprite);
        this.moveList = moveList;
        this.stunned = false;
    }

}
