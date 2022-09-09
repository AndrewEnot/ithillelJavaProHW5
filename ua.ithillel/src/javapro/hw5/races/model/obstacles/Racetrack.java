package javapro.hw5.races.model.obstacles;

import javapro.hw5.races.model.members.Member;

public class Racetrack implements Obstacle {

    int length;

    public Racetrack(int length) {
        this.length = length;
    }

    @Override
    public int getSize() {
        return this.length;
    }

    @Override
    public void overcome(Member member) throws DropOutException {
        if (getSize() <= member.getRunLimit()) {
            member.run(getSize());
        } else {
            throw new DropOutException();
        }
    }
}
