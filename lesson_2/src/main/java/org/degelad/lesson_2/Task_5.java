package org.degelad.lesson_2;

/**
 * ** Задать одномерный массив и найти в нем минимальный и максимальный
 * элементы (без помощи интернета);
 *
 * @author degelad
 */
public class Task_5 {

    public static void main(String[] args) {

        int[] array_5 = {11, 5, 3, 4, 1, 6, 7, 2, 15, 1};
        minMaxValuesArray(array_5);

    }

    public static void minMaxValuesArray(int a[]) {
        int min = a[0];
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            } else if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println("min = " + min + "\nmax = " + max);
    }

}
