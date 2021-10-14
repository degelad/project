package org.degelad.lesson_1;

/**
 * Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий
 * результат,
 * где a, b, c, d – аргументы этого метода, имеющие тип float.
 * @author degelad
 */
public class Task_3 {

    public static void main(String[] args) {

        System.out.print(result(1.2f, 1.3f, 1.4f, 1.5f));

    }

    public static float result(float a, float b, float c, float d) {

        return a * (b + (c / d));

    }

}
