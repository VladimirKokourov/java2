package ru.geekbrains.homework.lesson1;

public class Human implements Movable{

    private int maxRun;
    private int maxJump;

    @Override
    public int getMaxRun() {
        return maxRun;
    }

    @Override
    public int getMaxJump() {
        return maxJump;
    }

    public Human(int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public String toString() {
        return "Human";
    }

    @Override
    public void run() {
        System.out.println("Human run");
    }

    @Override
    public void jump() {
        System.out.println("Human jump");

    }
}
