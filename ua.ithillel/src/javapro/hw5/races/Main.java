package javapro.hw5.races;

import javapro.hw5.races.controller.RaceController;
import javapro.hw5.races.members.Cat;
import javapro.hw5.races.members.Human;
import javapro.hw5.races.members.Member;
import javapro.hw5.races.members.Robot;
import javapro.hw5.races.obstacles.Obstacle;
import javapro.hw5.races.obstacles.Racetrack;
import javapro.hw5.races.obstacles.Wall;

public class Main {
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
                new Racetrack(8000),
        };
        RaceController.start(members, obstacles);
    }
}
