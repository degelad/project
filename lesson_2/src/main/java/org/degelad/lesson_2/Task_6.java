package org.degelad.lesson_2;

/**
 * ** Написать метод, в который передается не пустой одномерный целочисленный
 * массив, метод должен вернуть true, если в массиве есть место, в котором сумма
 * левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2,
 * || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана
 * символами ||, эти символы в массив не входят.
 *
 * @author degelad
 */
public class Task_6 {

    public static void main(String[] args) {
        int[] array_6 = {1, 1, 1, 3};
        System.out.println(leftEqualRigth(array_6));
    }
    public static boolean leftEqualRigth(int a[]) {
        int leftSumm = 0;
        int rigthSumm = 0;
        for (int i = 0; i < a.length; i++) {
            leftSumm += a[i];
            rigthSumm = 0;
            for (int j = i+1; j < a.length; j++) {
                rigthSumm += a[j];
            }
            if (leftSumm == rigthSumm) {
                break;
            } else {
                continue;
            }
        }
        return leftSumm == rigthSumm;
    }
}
