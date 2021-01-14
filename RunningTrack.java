package ru.geekbrains.homework.lesson1;

public class RunningTrack implements Obstacle{

    private int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    @Override
    public int getDistance() {
        return length;
    }

    @Override
    public void block(Movable m) {
        System.out.println(m.toString() + " is against the Running track");
        m.run();
    }

    @Override
    public boolean test(Movable m) {
        if(m.getMaxRun() >= getDistance()){
            System.out.println("Success!");
            return true;
        } else {
            System.out.println("Fail!");
            return false;
        }
    }
}
