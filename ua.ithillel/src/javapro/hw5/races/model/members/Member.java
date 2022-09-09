package javapro.hw5.races.model.members;

public abstract class Member implements Runnable, Jumpable {

    String name;
    int jumpLimit;
    int runLimit;

    public Member(String name, int runLimit, int jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
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

    public int getJumpLimit() {
        return jumpLimit;
    }

    public int getRunLimit() {
        return runLimit;
    }
}
