package javapro.hw5.exRaces;

import javapro.hw5.exRaces.members.Cat;
import javapro.hw5.exRaces.members.Human;
import javapro.hw5.exRaces.members.Member;
import javapro.hw5.exRaces.members.Robot;
import javapro.hw5.exRaces.obstacles.Obstacle;
import javapro.hw5.exRaces.obstacles.Racetrack;
import javapro.hw5.exRaces.obstacles.Wall;

public class Races {

    public static void main(String[] args) {

        Member[] members = {
                new Cat("Barsic", 200, 1),
                new Robot("Veider", 10000, 5),
                new Human("Ronald", 3000, 2)
        };
        Obstacle[] obstacles = {
                new Racetrack(200),
                new Wall(1),
                new Racetrack(150),
                new Wall(2),
                new Racetrack(2500),
                new Wall(3),
                new Racetrack(8000)
        };
        races(members, obstacles);
    }

    static void races(Member[] members, Obstacle[] obstacles) {
        for (Member member : members) {
            int fullDistance = 0;
            for (Obstacle obstacle : obstacles) {
                if (obstacle instanceof Racetrack) {
                    fullDistance += ((Racetrack) obstacle).getLength();
                    if (member.getRunLimit() < ((Racetrack) obstacle).getLength()) {
                        System.out.println(member.getName() + " dropped out of the competition");
                        break;
                    }
                    member.run(((Racetrack) obstacle).getLength());
                } else {
                    if (member.getJumpLimit() < ((Wall) obstacle).getHeight()) {
                        System.out.println(member.getName() + " dropped out of the competition");
                        break;
                    }
                    member.jump(((Wall) obstacle).getHeight());
                }
            }
            System.out.println(member.getName() + " ran in total " + fullDistance);
            System.out.println();
        }
        System.out.println("Congratulations!!! Races are finished");
    }
}