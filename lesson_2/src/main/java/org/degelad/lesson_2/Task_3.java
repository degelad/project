package org.degelad.lesson_2;

/**
 * Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему
 * циклом, и числа меньшие 6 умножить на 2;
 *
 * @author degelad
 */
public class Task_3 {

    public static void main(String[] args) {

        int[] array_3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        multiplicationValuesArray(array_3);
    }

    public static void multiplicationValuesArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 6) {
                a[i] = a[i] * 2;
            }
        }
    }

}
