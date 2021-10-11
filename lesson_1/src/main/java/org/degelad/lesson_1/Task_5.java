package org.degelad.lesson_1;

/**
 *
 * @author degelad
 */
public class Task_5 {

    public static void main(String[] args) {
        checkingByModulePrint(0);
    }

    public static void checkingByModulePrint(int a) {

        if (a >= 0) {
            System.out.println("Число " + a + " , переданное в качестве аргумента, положительное" + "\n");
        } else {
            System.out.println("Число " + a + " , переданное в качестве аргумента, отрицательное" + "\n");
        }
    }
}
