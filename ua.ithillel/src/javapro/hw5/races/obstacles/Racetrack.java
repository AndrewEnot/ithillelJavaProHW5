package javapro.hw5.races.obstacles;

public class Racetrack implements Obstacle {

    int length;

    @Override
    public int getLength() {
        return this.length;
    }
    @Override
    public int getHeight() {
        return 0;
    }
    public Racetrack(int length) {
        this.length = length;
    }
}
