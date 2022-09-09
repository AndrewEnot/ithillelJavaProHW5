package javapro.hw5.races.model.obstacles;

import javapro.hw5.races.model.members.Member;

public interface Obstacle {

    int getSize();

    void overcome(Member member) throws DropOutException;
}
