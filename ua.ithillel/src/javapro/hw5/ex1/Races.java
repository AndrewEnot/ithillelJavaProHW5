package javapro.hw5.ex1;

import javapro.hw5.ex1.members.Cat;
import javapro.hw5.ex1.members.Human;
import javapro.hw5.ex1.members.Member;
import javapro.hw5.ex1.members.Robot;
import javapro.hw5.ex1.obstacles.Obstacle;
import javapro.hw5.ex1.obstacles.Racetrack;
import javapro.hw5.ex1.obstacles.Wall;

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
        for (int i = 0; i < members.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
                if (obstacles[i] instanceof Racetrack) {
                    if (members[i].getRunLimit() < ((Racetrack) obstacles[i]).getLength()) {
                        System.out.println(members[i].getName() + " dropped out of the competition");
                        continue;
                    }
                    members[i].run(((Racetrack) obstacles[i]).getLength());
                    continue;
                }
                if (members[i].getJumpLimit() < ((Wall) obstacles[i]).getHeight()) {
                    System.out.println(members[i].getName() + " dropped out of the competition");
                    continue;
                }
                members[i].jump(((Wall) obstacles[i]).getHeight());
            }
            System.out.println(members[i].getName() + " get to the end of the Race!!!");
        }
        System.out.println("Congratulations!!! Races are finished");
    }
}
