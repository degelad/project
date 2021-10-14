package org.degelad.lesson_1;

/**
 * * Написать метод, который определяет, является ли год високосным, и выводит
 * сообщение в консоль. Каждый 4-й год является високосным, кроме каждого
 * 100-го, при этом каждый 400-й – високосный.
 * @author degelad
 */
public class Task_8 {

    public static void main(String[] args) {
        checkingHighAccuracy(4);
    }

    public static void checkingHighAccuracy(int a) {

        int res1 = a % 100;
        int res2 = a % 400;
        int res3 = a % 4;

        if (res1 == 0) {
            if (res2 == 0) {
                System.out.println(a + " год високосный");
            } else {
                System.out.println(a + " год не високосный");
            };
        } else if (res3 == 0) {
            System.out.println(a + " год високосный");
        } else {
            System.out.println(a + " год не високосный");
        }
    }

}
