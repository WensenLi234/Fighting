import java.util.ArrayList;

public class Character {
    private String name;
    private int health;
    private ArrayList<Move> moveList;
    private ImageComponent sprite;
    public Character(String name, int health, ArrayList<Move> moveList, ImageComponent sprite) {
        this.name = name;
        this.health = health;
        this.moveList = moveList;
        this.sprite = sprite;
    }
}
