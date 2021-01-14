package ru.geekbrains.homework.lesson1;

public class Wall implements Obstacle{

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public int getDistance() {
        return height;
    }

    @Override
    public void block(Movable m) {
        System.out.println(m.toString() + " is against the Wall");
        m.jump();
    }

    @Override
    public boolean test(Movable m) {
        if(m.getMaxJump() >= getDistance()){
            System.out.println("Success!");
            return true;
        } else {
            System.out.println("Fail!");
            return false;
        }
    }
}
