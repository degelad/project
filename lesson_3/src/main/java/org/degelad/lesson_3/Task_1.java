package org.degelad.lesson_3;

import java.util.Random;
import java.util.Scanner;

/**
 *Написать программу, которая загадывает случайное число от 0 до 9 и
 * пользователю дается 3 попытки угадать это число. При каждой попытке компьютер
 * должен сообщить, больше ли указанное пользователем число, чем загаданное, или
 * меньше. После победы или проигрыша выводится запрос – «Повторить игру еще
 * раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
 * @author degelad
 */
public class Task_1 {

    public static Scanner sc = new Scanner(System.in);
    public static Random rnd = new Random();
    public static int y;

    public static void main(String[] args) {
        guessNumber();
        sc.close();
    }

    public static void guessNumber() {
        int x, z;
        do {
            x = rnd.nextInt(10);
            System.out.println("Подсказка, ответ " + x); //Расскоментируй что бы видеть ответ
            System.out.println("Я загадал число от 0 до 9\nПопробуй угадай его\nУ тебя три попытки!");
            for (int i = 0; i < 3; i++) {
                z = sc.nextInt();
                if (z == x) {
                    System.out.println("Угадал(а)!\nчисло " + z + " верное!\nПоиграем еще разок?\nВведи 1 - это да, 0 - это нет\nвводи только число, я еще не разобрался в ексепшенах");
                    do {
                        y = sc.nextInt();
                        if (y == 1 || y == 0) {
                            break;
                        } else {
                            System.out.println("Я просил ввести 1 - это да, 0 - это нет\nВведи еще раз\nвводи только число, я еще не разобрался в ексепшенах");
                        }
                    } while (y != 1 || y != 0);
                    break;
                } else if (i < 2) {
                    if (z > x) {
                        System.out.println("Твое число больше, попробуй еще раз!");
                    } else {
                        System.out.println("Твое число меньше, попробуй еще раз!");
                    }
                } else {
                    if (z > x) {
                        System.out.println("Твое число больше, в этот раз не повезло...\nПоиграем еще разок?\nВведи 1 - это да, 0 - это нет\nвводи только число, я еще не разобрался в ексепшенах");
                        do {
                            y = sc.nextInt();
                            if (y == 1 || y == 0) {
                                break;
                            } else {
                                System.out.println("Я просил ввести 1 - это да, 0 - это нет\nВведи еще раз\nвводи только число, я еще не разобрался в ексепшенах");
                            }
                        } while (y != 1 || y != 0);
                        break;
                    } else {
                        System.out.println("Твое число меньше, в этот раз не повезло...\nПоиграем еще разок?\nВведи 1 - это да, 0 - это нет\nвводи только число, я еще не разобрался в ексепшенах");
                        do {
                            y = sc.nextInt();
                            if (y == 1 || y == 0) {
                                break;
                            } else {
                                System.out.println("Я просил ввести 1 - это да, 0 - это нет\nВведи еще раз\nвводи только число, я еще не разобрался в ексепшенах");
                            }
                        } while (y != 1 || y != 0);
                        break;
                    }
                }
            }
        } while (y == 1);
        if (y == 0) {
            System.out.println("Жаль, что так быстро уходишь.");
        }
    }
}
