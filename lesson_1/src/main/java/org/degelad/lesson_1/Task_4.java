package org.degelad.lesson_1;

/**
 *
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
