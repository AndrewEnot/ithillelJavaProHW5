package javapro.hw5.races.obstacles;

public class Wall implements Obstacle {

    int height;

    @Override
    public int getHeight() {
        return this.height;
    }
    @Override
    public int getLength() {
        return 0;
    }
    public Wall(int height) {
        this.height = height;
    }
}
