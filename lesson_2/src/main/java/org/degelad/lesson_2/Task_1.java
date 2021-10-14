package org.degelad.lesson_2;

/**
 * Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1,
 * 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на
 * 0;
 *
 * @author degelad
 */
public class Task_1 {

    public static void main(String[] args) {

        int[] array_1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        replacingValuesArray(array_1);

    }

    public static void replacingValuesArray(int a[]) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                a[i] = 0;
            } else if (a[i] == 0) {
                a[i] = 1;
            }
        }

    }
}
