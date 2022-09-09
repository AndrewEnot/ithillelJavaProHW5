package javapro.hw5.races.controller;

import javapro.hw5.races.model.members.Member;
import javapro.hw5.races.model.obstacles.DropOutException;
import javapro.hw5.races.model.obstacles.Obstacle;

public class RaceController {

    public static void start(Member[] members, Obstacle[] obstacles) {
        for (Member member : members) {
            int fullDistance = 0;
            for (Obstacle obstacle : obstacles) {
                try {
                    obstacle.overcome(member);
                } catch (DropOutException e) {
                    System.out.println(member.getName() + " dropped out of the competition");
                    break;
                }
                fullDistance += obstacle.getSize();
            }
            System.out.println(member.getName() + " ran and jump in total " + fullDistance + "\n");
        }
        System.out.println("Congratulations!!! Races are finished");
    }
}
