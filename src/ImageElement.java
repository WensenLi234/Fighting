import java.awt.image.BufferedImage;

public class ImageElement extends GUIElement {
    private BufferedImage image;
    public ImageElement(int x, int y, BufferedImage image) {
        super(x, y);
        this.image = image;
    }
    public BufferedImage getImage() {
        return image;
    }
}
