package org.degelad.lesson_2;

/**
 * Создать квадратный двумерный целочисленный массив (количество строк и
 * столбцов одинаковое) и с помощью цикла(-ов) заполнить его диагональные
 * элементы единицами;
 *
 * @author degelad
 */
public class Task_4 {

    public static void main(String[] args) {

        int[][] array_4 = new int[10][10];
        diagonalValuesArray(array_4);

    }

    public static void diagonalValuesArray(int a[][]) {
        for (int i = 0, j = 0; i < a.length && j < a.length; i++, j++) {
            a[i][j] = 1;
        }
        for (int i = a.length - 1, j = 0; i < a.length && j < a.length; i--, j++) {
            a[i][j] = 1;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print("\n");
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j]);
            }
        }

    }

}
