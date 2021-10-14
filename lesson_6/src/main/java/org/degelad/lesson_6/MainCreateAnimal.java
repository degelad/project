package org.degelad.lesson_6;
/*
* 1. Создать классы Собака и Кот с наследованием от класса Животное. 
* 2. Все животные могут бежать и плыть. В качестве параметра каждому методу
*    передается длина препятствия. Результатом выполнения действия будет печать
*    в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
* 3. У каждого животного есть ограничения на действия
*    (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать,
*    собака 10 м.). 
* 4. * Добавить подсчет созданных котов, собак и животных.
* @author degelad
*/
public class MainCreateAnimal {

    public static void main(String[] args) {
        Cat catVaska = new Cat("Васька");
        Cat catBarsik = new Cat("Барсик");
        Dog dogBobik = new Dog("Бобик");
        catVaska.run(300);
        catVaska.swim(1);
        catBarsik.run(100);
        catBarsik.swim(1);
        dogBobik.run(100);
        dogBobik.swim(15);
        System.out.println("Котов всего " + catVaska.getCountCat());
        System.out.println("Собак всего " + dogBobik.getCountDog());
        System.out.println("Животных всего " + catVaska.getCountAnimal());

    }
}
