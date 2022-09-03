package javapro.hw5.ex1.members;

public class Member {

    String name;
    int runLimit;
    int jumpLimit;

    public Member(String name, int runLimit, int jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    public String getName() {
        return name;
    }

    public int getRunLimit() {
        return runLimit;
    }

    public int getJumpLimit() {
        return jumpLimit;
    }

    public void run(int distance) {
        System.out.println(this.name + " run for " + distance);
    }
    public void jump(int height) {
        System.out.println(this.name + " jump at " + height);
    }
}
