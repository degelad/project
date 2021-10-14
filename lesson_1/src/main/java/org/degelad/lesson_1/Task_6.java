package org.degelad.lesson_1;

/**
 * Написать метод, которому в качестве параметра передается целое число. Метод
 * должен вернуть true, если число отрицательное, и вернуть false если
 * положительное.
 * @author degelad
 */
public class Task_6 {

    public static void main(String[] args) {
        checkingByModuleReturn(4);
    }

    public static boolean checkingByModuleReturn(int a) {

        if (a >= 0) {
            return true;
        } else {
            return false;
        }
    }

}
