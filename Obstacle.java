package ru.geekbrains.homework.lesson1;

public interface Obstacle {

    void block(Movable m);
    int getDistance();
    boolean test(Movable m);

}
