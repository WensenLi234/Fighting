import java.awt.*;

public class Move extends Animation{
    Hitbox[] hitbox;
    public Move(Entity entity, ImageElement[] frames, Hitbox[] hitbox, double interval, Game game) {
        super(frames, interval, entity, game);
        this.hitbox = hitbox;
    }
    @Override
    public void play(Graphics g) {
        for(int i = 0; i < frames.length; i++) {

        }
    }
}
