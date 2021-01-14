package ru.geekbrains.homework.lesson1;

public class OvercomingObstaclesMain {
    public static void main(String[] args) {

        Movable[] movables = {
                new Human(2,6),
                new Cat(4,3),
                new Robot(10,5)
        };

        Obstacle[] obstacles = {
                new RunningTrack(2),
                new Wall(3),
                new Wall(5),
                new RunningTrack(10)
        };

        for (Movable m : movables)
            for (Obstacle o : obstacles) {
                o.block(m);
                if (!o.test(m)) {
                  break;
                }
            }
        }
}
