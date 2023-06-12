import java.awt.*;

public class Move {
    private Hitbox[] hitboxes;
    private Animation animation;
    public Move(Hitbox[] hitboxes, Animation animation) {
        this.animation = animation;
        this.hitboxes = hitboxes;
    }
    public ImageElement nextFrame(int x, int y) {
        for(int i = 0; i < hitboxes.length - 1; i++) {
            if(hitboxes[i] != null && Hitbox.getActiveHitboxes().contains(hitboxes[i])) {
                hitboxes[i].setX(x);
                hitboxes[i].setY(y);
                Hitbox.removeHitbox(hitboxes[i]);
                Hitbox.addHitbox(hitboxes[i + 1]);
            }
        }
        return animation.nextFrame();
    }
}
