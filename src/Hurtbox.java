import java.awt.*;
import java.util.ArrayList;

public class Hurtbox extends Hitbox {
    private Entity entity;
    private static ArrayList<Hurtbox> activeHurtboxes = new ArrayList<>();
    public Hurtbox(int width, int height, int x, int y, Move move, Entity entity) {
        super(width, height, x, y);
        this.entity = entity;
        activeHurtboxes.add(this);
    }
    public static ArrayList<Hurtbox> getActiveHurtboxes() {
        return activeHurtboxes;
    }
    public static void addHurtbox(Hurtbox hurtbox) {
        activeHurtboxes.add(hurtbox);
    }
    public static void removeHurtbox(Hurtbox hurtbox) {
        activeHurtboxes.remove(hurtbox);
    }
    public void touched(Hitbox hitbox) {

    }
}
