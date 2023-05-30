import java.awt.*;

public class Animation {
    Game game;
    Entity entity;
    ImageElement[] frames;
    double interval;
    public Animation(ImageElement[] frames, double interval, Entity entity, Game game) {
        this.frames = frames;
        this.interval = interval;
        this.entity = entity;
        this.game = game;
    }
    public void play(Graphics g) throws InterruptedException {
        for (ImageElement frame : frames) {
            entity.setSprite(frame);
            entity.getSprite().paint(g);
            game.repaint();
            Thread.sleep((long) (interval * 1000));
        }
    }
    public void setEntity(Entity entity) {
        this.entity = entity;
    }
    public double getInterval() {
        return interval;
    }
    public void setInterval(double interval) {
        this.interval = interval;
    }
}
