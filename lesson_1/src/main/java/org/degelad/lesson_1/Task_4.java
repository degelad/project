package org.degelad.lesson_1;

/**
 * Написать метод, принимающий на вход два целых числа и проверяющий, что их
 * сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в
 * противном случае – false.
 * @author degelad
 */
public class Task_4 {

    public static void main(String[] args) {

        resultExpressionTask4(2, 10);
    }

    public static boolean resultExpressionTask4(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }

    }
}
