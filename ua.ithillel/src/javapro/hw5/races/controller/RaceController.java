package javapro.hw5.races.controller;

import javapro.hw5.races.members.Member;
import javapro.hw5.races.obstacles.Obstacle;

public class RaceController {

    public static void start(Member[] members, Obstacle[] obstacles) {
        for (Member member : members) {
            member.overcome(obstacles);
        }
        System.out.println("Congratulations!!! Races are finished");
    }
}
