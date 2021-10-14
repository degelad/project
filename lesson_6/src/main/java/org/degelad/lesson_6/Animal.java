package org.degelad.lesson_6;

public class Animal {
    private static int countAnimal;
    private String name;

    public Animal(String name) {
        this.name = name;
        countAnimal++;
    }

    public String getName() {
        return name;
    }
    
    public int getCountAnimal(){
    return countAnimal;
    }
   
    public void run(int obstacleLength) {
        System.out.println(" пробежал " + obstacleLength + " метров");

    }

    public void swim(int obstacleLength) {
        System.out.println(" проплыл " + obstacleLength + " метров");

    }
}
