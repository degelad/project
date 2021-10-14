package org.degelad.lesson_1;

/**
 * Написать метод, которому в качестве параметра передается строка, обозначающая
 * имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
 * @author degelad
 */
public class Task_7 {

    public static void main(String[] args) {
        helloName("Denis");
    }

    public static void helloName(String name) {
        System.out.println("Привет, " + name + "!");
    }

}
