package org.degelad.lesson_5;
/*
*    1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
*    2. Конструктор класса должен заполнять эти поля при создании объекта.
*    3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
*    4. Создать массив из 5 сотрудников.
* Пример:
* Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
* persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com",
* "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
* persArray[1] = new Person(...);
* ...
* persArray[4] = new Person(...);
*    5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
* @author degelad
*/
public class CreateEmployee {

    public static void main(String[] args) {

        Employee[] personArray = new Employee[5];
        personArray[0] = new Employee("Иванов Иван Иванович", "Главный инженер", "ivanov@gmail.ru", 89223334441L, 55000, 55);
        personArray[1] = new Employee("Петров Петр Петрович", "Ведущий инженер", "petrov@gmail.ru", 89223334442L, 45000, 45);
        personArray[2] = new Employee("Сидоров Сидор Сидорович", "Инженер 1 категории", "sidorov@gmail.ru", 89223334443L, 35000, 35);
        personArray[3] = new Employee("Михайлов Михаил Михайлович", "Инженер 2 категории", "mikhailov@gmail.ru", 89223334444L, 25000, 25);
        personArray[4] = new Employee("Адександров Александр александрович", "Инженер 3 категории", "aleksandrov@gmail.ru", 89223334445L, 15000, 20);

        for (int i = 0; i < personArray.length; i++) {
            if (personArray[i].age > 40) {
                personArray[i].infoEmployee();
            }
        }
    }
}
