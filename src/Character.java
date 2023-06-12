import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Character extends Entity{
    private Move idle;
    private ArrayList<Move> specialMoveList;
    private int stun;
    public Character(String name, int health, ArrayList<Move> moves, ImageElement sprite) {
        super(name, health, sprite);
        this.specialMoveList = moves;
        this.stun = 0;
    }
    public void setIdle(Move idle) {
        this.idle = idle;
    }
    public void lessenStun() {
        stun --;
    }
}
