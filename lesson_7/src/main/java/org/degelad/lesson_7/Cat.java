package org.degelad.lesson_7;

public class Cat {

    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;

    }

    public void eat(Plate p) {
        if (appetite < p.getFood()) {
            p.decreaseFood(appetite);
            satiety = true;
        } 
    }

    public void satiety(Cat name) {
        if (name.satiety == true) {
            System.out.println("Кот " + name.name + " сыт");
        } else {
            System.out.println("Кот " + name.name + " голодный");
        }
    }

}
