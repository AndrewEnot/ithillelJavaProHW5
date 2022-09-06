package javapro.hw5.races.members;

import javapro.hw5.races.obstacles.Obstacle;

public abstract class Member implements Runnable, Jumpable {

    String name;
    int runLimit;
    int jumpLimit;

    public Member(String name, int runLimit, int jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }
    public void overcome(Obstacle[] obstacles) {
        int distanceFull = 0;
        for (Obstacle obstacle : obstacles) {
            if (obstacle.getLength() != 0) {
                if (obstacle.getLength() > this.runLimit) {
                    System.out.println(getName() + " dropped out of the competition");
                    break;
                }
                run(obstacle.getLength());
                distanceFull += obstacle.getLength();
                continue;
            } else if (obstacle.getHeight() > this.jumpLimit) {
                System.out.println(getName() + " dropped out of the competition");
                break;
            }
            jump(obstacle.getHeight());
        }
        System.out.println(getName() + " ran in total " + distanceFull + "\n");
    }
    @Override
    public void run(int distance) {
        System.out.println(this.name + " run for " + distance);
    }
    @Override
    public void jump(int height) {
        System.out.println(this.name + " jump at " + height);
    }
    public String getName() {
        return name;
    }
}
