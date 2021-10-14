package org.degelad.lesson_2;

/**
 * Задать пустой целочисленный массив размером 8. С помощью цикла заполнить
 * его значениями 0 3 6 9 12 15 18 21;
 *
 * @author degelad
 */
public class Task_2 {

    public static void main(String[] args) {
        int[] array_2 = new int[8];
        enteringValuesArray(array_2);
    }

    public static void enteringValuesArray(int a[]) {
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = c;
            c += 3;
        }

    }

}
