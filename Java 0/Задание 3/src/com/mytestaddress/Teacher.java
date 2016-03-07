package com.mytestaddress;

import java.util.Scanner;

import java.util.Scanner;
import static java.lang.System.*;

/**
 * Created by priora on 07.03.2016.
 */
public class Teacher extends Partaker {
    int experience;
    static int countTeacher = 0;

    Teacher() {
        countTeacher++;
        out.println("Количество преподавателей " + countTeacher);

        Scanner sc = new Scanner(in); // Создаем объект класса Scanner

        // Ввод имени студента
        boolean enterName = false;
        do {
            try {
                out.println("Введите имя преподавателя: ");
                String nameStudent = sc.next();
                enterName = editName(nameStudent); // Возвращает истину если корректно ввели имя
            } catch (NumberFormatException e) {
                out.println( "Повторите ввод" + e.toString() );
                continue;
            }
        } while (!enterName);

        // Ввод возраста студента
        boolean enterAge = false;
        do {
            try {
                out.println("Введите возраст преподавателя: ");
                String txt = sc.next();
                int ageStudent = Integer.parseInt(txt);
                enterAge = editAge(ageStudent); // Возвращает истину если корректно ввели имя
            } catch (NumberFormatException e) {
                System.out.println( "Повторите ввод " + e.toString() );
                continue;
            }
        } while (!enterAge);

        // Ввод среднего балла студента
        boolean enterExperience = false;
        do {
            try {
                out.println("Введите стаж работы: ");
                String txt = sc.next();
                int experience = Integer.parseInt(txt);
                enterExperience = editExperience(experience); // Возвращает истину если корректно ввели средний балл
            } catch (NumberFormatException e) {
                System.out.println( "Повторите ввод " + e.toString() );
                continue;
            }
        } while (!enterExperience);
    }

    @Override
    void editing() {
    }

    @Override
    boolean editName(String s) {
        name = s;
        System.out.println("Введенное имя студента: " + s);
        return true;
    }

    @Override
    boolean editAge(int a) {
        if (a < 0 || a > 35) {
            System.out.println("Повторите ввод");
            return false;
        }
        age = a;
        System.out.println("Введенный возраст студента: " + a);
        return true;
    }

    boolean editExperience(int e) {
        if (e < 0 || e  > 40) {
            System.out.println("Повторите ввод");
            return false;
        }
        experience = e;
        System.out.println("Введенный стаж работы: " + e);
        return true;
    }
}
