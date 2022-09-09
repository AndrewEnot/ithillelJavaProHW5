package javapro.hw5.races.model.obstacles;

import javapro.hw5.races.model.members.Member;

public class Wall implements Obstacle {

    int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public int getSize() {
        return this.height;
    }

    @Override
    public void overcome(Member member) throws DropOutException {
        if (getSize() <= member.getJumpLimit()) {
            member.jump(getSize());
        } else {
            throw new DropOutException();
        }
    }
}
