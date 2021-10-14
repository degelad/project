package org.degelad.lesson_2;

/**
 ***** Написать метод, которому на вход подается одномерный массив и число n
 * (может быть положительным, или отрицательным), при этом метод должен сместить
 * все элементы массива на n позиций. Элементы смещаются циклично. Для
 * усложнения задачи нельзя пользоваться вспомогательными массивами. Примеры: [
 * 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2
 * (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете
 * выбирать сами.
 *
 * @author degelad
 */
public class Task_7 {

    public static void main(String[] args) {
        int[] array_7 = {1};
        int stepShift = 2;
        shiftValueArray(array_7, stepShift);
        for (int a : array_7) {
            System.out.print(a);
        }
    }

    public static void shiftValueArray(int a[], int b) {
        int c = a.length - 1;

        if (b > 0 && a.length - 1 != 0) {
            for (int q = 0; q < b; q++) {
                int buffer_1 = a[0];
                int buffer_2 = a[c];
                for (int i = a.length - 2, j = a.length - 1; j > 0; i--, j--) {
                    a[j] = a[i];
                }
                a[0] = buffer_2;
                a[1] = buffer_1;
            }
        }
        if (b < 0 && a.length - 1 != 0) {
            for (int q = 0; q < b * -1; q++) {
                int buffer_1 = a[0];
                int buffer_2 = a[c];
                for (int i = 1, j = 0; j < a.length - 2; i++, j++) {
                    a[j] = a[i];
                }
                a[c] = buffer_1;
                a[c - 1] = buffer_2;
            }
        }
    }

}
