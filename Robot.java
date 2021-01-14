package ru.geekbrains.homework.lesson1;

public class Robot implements Movable{

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

    public Robot(int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public String toString() {
        return "Robot";
    }

    @Override
    public void run() {
        System.out.println("Robot run");
    }

    @Override
    public void jump() {
        System.out.println("Robot jump");

    }

}
