package org.degelad.lesson_3;

import java.util.Random;
import java.util.Scanner;

/**
 ** Создать массив из слов
 *
 * String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
 * "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
 * "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper",
 * "pineapple", "pumpkin", "potato"}. При запуске программы компьютер загадывает
 * слово, запрашивает ответ у пользователя, сравнивает его с загаданным словом и
 * сообщает, правильно ли ответил пользователь. Если слово не угадано, компьютер
 * показывает буквы, которые стоят на своих местах. apple – загаданное apricot -
 * ответ игрока ap############# (15 символов, чтобы пользователь не мог узнать
 * длину слова) Для сравнения двух слов посимвольно можно пользоваться: String
 * str = "apple"; char a = str.charAt(0); - метод вернет char, который стоит в
 * слове str на первой позиции Играем до тех пор, пока игрок не отгадает слово.
 * Используем только маленькие буквы.
 *
 * @author degelad
 */
public class Task_2 {

    public static Scanner sc = new Scanner(System.in);
    public static Random rnd = new Random();
    public static int j, y;

    public static void main(String[] args) {
        guessArray();
        sc.close();

    }

    public static void guessArray() {
        int x;
        String q, z;
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape",
            "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        x = rnd.nextInt(words.length);
        q = words[x];
        System.out.println("Угадай, что за фрукт я загадал!");
        System.out.println("Подсказка, загаданное рандомом слово " + q); //Закомментируй строку, что бы не видеть ответ
        do {
            z = sc.nextLine();
            if (q.equals(z)) {
                System.out.println("Ты угадал!\nПравильно, это слово " + q);
                break;
            } else {
                System.out.println("Не угадал\nДавай еще раз");
                j = 0;
                y = 0;
                for (int i = 0; i < q.length() && i < z.length(); i++) {
                    if (q.charAt(i) == z.charAt(i)) {
                        System.out.print(q.charAt(i));
                        j++;
                    } else {
                        System.out.print("#");
                        y++;
                    }
                }
                for (int i = 0; i < (15 - (j + y)); i++) {
                    System.out.print("#");

                }
                System.out.println();
                if (j > 0) {
                    System.out.println("Но есть совпадения по буквам");

                }
            }
        } while (true);
    }

}
