package org.degelad.lesson_4;

import java.util.Random;
import java.util.Scanner;

/**
 *1. Полностью разобраться с кодом, попробовать переписать с нуля, стараясь не
 * подглядывать в методичку.
 * 2. Переделать проверку победы, чтобы она не была
 * реализована просто набором условий, например, с использованием циклов.
 * 3. *
 * Попробовать переписать логику проверки победы, чтобы она работала для поля
 * 5х5 и количества фишек 4. Очень желательно не делать это просто набором
 * условий для каждой из возможных ситуаций;
 * 4. *** Доработать искусственный
 * интеллект, чтобы он мог блокировать ходы игрока.
 * @author degelad
 */
public class Task_1_2_3_4 {
    public static final char SIGN_X = 'x';
    public static final char SIGN_O = 'o';
    public static int size = 5;
    public static int q = 0;
    public static char[][] map;
    public static char theVoid = '*';
    public static Scanner sc = new Scanner(System.in);
    public static Random rnd = new Random();

    public static void main(String[] args) {
        initMap(size, size);
        printMap(map);
        while (true) {
            humanMove();
            printMap(map);
            if (chekingWin(SIGN_X)) {
                System.out.println("Вы победили!");
                break;
            }
            if (chekingDraw()) {
                System.out.println("Ничья");
                break;
            }
            aiMove();
            printMap(map);
            if (chekingWin(SIGN_O)) {
                System.out.println("Победил искусственный интелект!");
                break;
            }
            if (chekingDraw()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    public static void initMap(int x, int y) {
        map = new char[x][y];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = theVoid;
            }
        }
    }

    public static void printMap(char a[][]) {
        for (int i = 0; i < a.length + 1; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void humanMove() {
        int x, y;
        int j = 0;
        do {
            if (j > 0) {
                System.out.println("Смотри внимательно, координаты уже заняты!");
                printMap(map);
            }
            System.out.println("Введите координаты в формате X и Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
            j++;
        } while (chekingCard(x, y));
        map[y][x] = SIGN_X;
    }

    public static boolean chekingCard(int x, int y) {
        if (x < 0 || x > size || y < 0 || y > size) {
            return true;
        }
        if (map[y][x] == theVoid) {
            return false;
        }
        return true;
    }

    public static boolean chekingDraw() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (map[i][j] == theVoid) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void aiMove() {
        int i, j;
        System.out.println("Ход искусственного интелекта");
        // Проверяет диагональ слева направо
        do {
            int q = 0;
            for (i = 0, j = 0; i < map.length && j < map.length; i++, j++) {
                if (map[i][j] == SIGN_X) {
                    q++;
                }
            }
            if (q == size - 1) {
                for (i = 0, j = 0; i < map.length && j < map.length; i++, j++) {
                    if (map[i][j] == theVoid) {
                        map[i][j] = SIGN_O;
                        break;
                    }
                }
            }
            break;
        } while (true);
        // Проверяет диагональ справа налево
        do {
            int q = 0;
            for (i = map.length - 1, j = 0; i < map.length && j < map.length; i--, j++) {
                if (map[i][j] == SIGN_X) {
                    q++;
                }
            }
            if (q == size - 1) {
                for (i = map.length - 1, j = 0; i < map.length && j < map.length; i--, j++) {
                    if (map[i][j] == theVoid) {
                        map[i][j] = SIGN_O;
                        return;
                    }
                }
            }
            break;
        } while (true);
        // Проверяет 1 вертикаль
        do {
            int q = 0;
            for (i = 0; i < 1; i++) {
                for (j = 0; j < map.length; j++) {
                    if (map[j][i] == SIGN_X) {
                        q++;
                    }
                }
            }
            if (q == size - 1) {
                for (i = 0; i < 1; i++) {
                    for (j = 0; j < map.length; j++) {
                        if (map[j][i] == theVoid) {
                            map[j][i] = SIGN_O;
                            return;
                        }
                    }
                }
            }
            break;
        } while (true);
// Проверяет 2 вертикаль
        do {
            int q = 0;
            for (i = 1; i < 2; i++) {
                for (j = 0; j < map.length; j++) {
                    if (map[j][i] == SIGN_X) {
                        q++;
                    }
                }
            }
            if (q == size - 1) {
                for (i = 1; i < 2; i++) {
                    for (j = 0; j < map.length; j++) {
                        if (map[j][i] == theVoid) {
                            map[j][i] = SIGN_O;
                            return;
                        }
                    }
                }
            }
            break;
        } while (true);
// Проверяет 3 вертикаль
        do {
            int q = 0;
            for (i = 2; i < 3; i++) {
                for (j = 0; j < map.length; j++) {
                    if (map[j][i] == SIGN_X) {
                        q++;
                    }
                }
            }
            if (q == size - 1) {
                for (i = 2; i < 3; i++) {
                    for (j = 0; j < map.length; j++) {
                        if (map[j][i] == theVoid) {
                            map[j][i] = SIGN_O;
                            return;
                        }
                    }
                }
            }
            break;
        } while (true);
// Проверяет 4 вертикаль
        do {
            int q = 0;
            for (i = 3; i < 4; i++) {
                for (j = 0; j < map.length; j++) {
                    if (map[j][i] == SIGN_X) {
                        q++;
                    }
                }
            }
            if (q == size - 1) {
                for (i = 3; i < 4; i++) {
                    for (j = 0; j < map.length; j++) {
                        if (map[j][i] == theVoid) {
                            map[j][i] = SIGN_O;
                            return;
                        }
                    }
                }
            }
            break;
        } while (true);
// Проверяет 5 вертикаль
        do {
            int q = 0;
            for (i = 4; i < 5; i++) {
                for (j = 0; j < map.length; j++) {
                    if (map[j][i] == SIGN_X) {
                        q++;
                    }
                }
            }
            if (q == size - 1) {
                for (i = 4; i < 5; i++) {
                    for (j = 0; j < map.length; j++) {
                        if (map[j][i] == theVoid) {
                            map[j][i] = SIGN_O;
                            return;
                        }
                    }
                }
            }
            break;
        } while (true);
//           Проверяет 1 горизонталь
        do {
            int q = 0;
            for (i = 0; i < map.length; i++) {
                for (j = 0; j < 1; j++) {
                    if (map[j][i] == SIGN_X) {
                        q++;
                    }
                }
            }
            if (q == size - 1) {
                for (i = 0; i < map.length; i++) {
                    for (j = 0; j < 1; j++) {
                        if (map[j][i] == theVoid) {
                            map[j][i] = SIGN_O;
                            return;
                        }
                    }
                }
            }
            break;
        } while (true);
//           Проверяет 2 горизонталь
        do {
            int q = 0;
            for (i = 0; i < map.length; i++) {
                for (j = 1; j < 2; j++) {
                    if (map[j][i] == SIGN_X) {
                        q++;
                    }
                }
            }
            if (q == size - 1) {
                for (i = 0; i < map.length; i++) {
                    for (j = 1; j < 2; j++) {
                        if (map[j][i] == theVoid) {
                            map[j][i] = SIGN_O;
                            return;
                        }
                    }
                }
            }
            break;
        } while (true);
//           Проверяет 3 горизонталь
        do {
            int q = 0;
            for (i = 0; i < map.length; i++) {
                for (j = 2; j < 3; j++) {
                    if (map[j][i] == SIGN_X) {
                        q++;
                    }
                }
            }
            if (q == size - 1) {
                for (i = 0; i < map.length; i++) {
                    for (j = 2; j < 3; j++) {
                        if (map[j][i] == theVoid) {
                            map[j][i] = SIGN_O;
                            return;
                        }
                    }
                }
            }
            break;
        } while (true);
//           Проверяет 4 горизонталь
        do {
            int q = 0;
            for (i = 0; i < map.length; i++) {
                for (j = 3; j < 4; j++) {
                    if (map[j][i] == SIGN_X) {
                        q++;
                    }
                }
            }
            if (q == size - 1) {
                for (i = 0; i < map.length; i++) {
                    for (j = 3; j < 4; j++) {
                        if (map[j][i] == theVoid) {
                            map[j][i] = SIGN_O;
                            return;
                        }
                    }
                }
            }
            break;
        } while (true);
//           Проверяет 5 горизонталь
        do {
            int q = 0;
            for (i = 0; i < map.length; i++) {
                for (j = 4; j < 5; j++) {
                    if (map[j][i] == SIGN_X) {
                        q++;
                    }
                }
            }
            if (q == size - 1) {
                for (i = 0; i < map.length; i++) {
                    for (j = 4; j < 5; j++) {
                        if (map[j][i] == theVoid) {
                            map[j][i] = SIGN_O;
                            return;
                        }
                    }
                }
            }
            break;
        } while (true);
        int x, y;
        do {
            x = rnd.nextInt(size);
            y = rnd.nextInt(size);
        } while (chekingCard(x, y));
        map[y][x] = SIGN_O;
    }

    public static boolean chekingWin(char a) {
        int q = 0;
        for (int i = 0, j = 0; i < map.length && j < map.length; i++, j++) {
            if (map[i][j] == a) {
                q++;
            }
        }
        if (q == size) {
            return true;
        }
        q = 0;
        for (int i = map.length - 1, j = 0; i < map.length && j < map.length; i--, j++) {
            if (map[i][j] == a) {
                q++;
            }
        }
        if (q == size) {
            return true;
        }
        for (int i = 0; i < map.length; i++) {
            q = 0;
            for (int j = 0; j < map.length; j++) {
                if (map[i][j] == a) {
                    q++;
                }
            }
            if (q == size) {
                return true;
            }
        }
        for (int i = 0; i < map.length; i++) {
            q = 0;
            for (int j = 0; j < map.length; j++) {
                if (map[j][i] == a) {
                    q++;
                }
            }
            if (q == size) {
                return true;
            }
        }
        return false;
    }
}
