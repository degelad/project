package org.degelad.lesson_5;

public class Employee {
    String firstMiddleLastName, post, email;
    Long phoneNumber;
    int wages, age;

    public Employee(String a, String b, String c, Long d, int e, int f) {
        this.firstMiddleLastName = a;
        this.post = b;
        this.email = c;
        this.phoneNumber = d;
        this.wages = e;
        this.age = f;
    }

    public void infoEmployee() {
        System.out.println("Данные сотрудника :\n" +
                "Ф.И.О.             " + firstMiddleLastName + "\n"
                + "Должность          " + post + "\n"
                + "Почтовый адрес     " + email + "\n"
                + "Номер телефона     " + phoneNumber + "\n"
                + "Заработная плата   " + wages + "\n"
                + "Возраст            " + age);
    }

}
