public class Entity {
    private String name;
    private double health;
    private ImageElement sprite;
    int x;
    int y;
    public Entity(String name, double health, ImageElement sprite) {
        this.name = name;
        this.health = health;
        this.sprite = sprite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public ImageElement getSprite() {
        return sprite;
    }

    public void setSprite(ImageElement sprite) {
        this.sprite = sprite;
    }
}
