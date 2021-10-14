package org.degelad.lesson_6;

public class Cat extends Animal {

    private static int countCat;

    public Cat(String name) {
        super(name);
        countCat++;
    }

    public int getCountCat() {
        return countCat;
    }

    @Override
    public void run(int obstacleLength) {
        if (obstacleLength < 200) {
            System.out.print(super.getName());
            super.run(obstacleLength);
        } else {
            obstacleLength = 200;
            System.out.print(super.getName());
            super.run(obstacleLength);
        }
    }

    @Override
    public void swim(int obstacleLength) {
        System.out.println(super.getName() + " не умеет плавать");
    }
}
