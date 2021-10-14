package org.degelad.lesson_6;

public class Dog extends Animal {
private static int countDog;
    public Dog(String name) {
        super(name);
        countDog++;
    }

    public int getCountDog(){
    return countDog;
    }
        
    @Override
    public void run(int obstacleLength) {
        if (obstacleLength < 500) {
            System.out.print(super.getName());
            super.run(obstacleLength);
        } else {
            obstacleLength = 500;
            System.out.print(super.getName());
            super.run(obstacleLength);
        }
    }

    @Override
    public void swim(int obstacleLength) {
        if (obstacleLength < 10) {
            System.out.print(super.getName());
            super.swim(obstacleLength);
        } else {
            obstacleLength = 10;
            System.out.print(super.getName());
            super.swim(obstacleLength);
        }
    }
}
