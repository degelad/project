package org.degelad.lesson_7;
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
public class FeedTheCat {

    public static void main(String[] args) {

        Cat catBarsik = new Cat("Барсик", 3);
        Cat catVaska = new Cat("Васька", 5);
        Cat[] cat = new Cat[2];

        cat[0] = catBarsik;
        cat[1] = catVaska;
        Plate plate = new Plate(10);
        plate.info();

        for (Cat a : cat) {
            a.eat(plate);
        }

        catBarsik.satiety(catBarsik);
        catVaska.satiety(catVaska);
        plate.info();
        
        plate.setFood(15);
        plate.info();
    }
}
