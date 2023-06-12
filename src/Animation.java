import java.awt.*;

public class Animation {
    Entity entity;
    ImageElement[] frames;
    public Animation(ImageElement[] frames) {
        this.frames = frames;
    }
    public ImageElement nextFrame() {
        for(int i = 0; i < frames.length - 1; i++) {
            if(frames[i] == entity.getSprite()) {
                return frames[i + 1];
            }
        }
        return frames[0];
    }
    public void setEntity(Entity entity) {
        this.entity = entity;
    }
}
