package com.mytestaddress;

import java.util.Scanner;

import java.util.Scanner;
import static java.lang.System.*;

/**
 * Created by priora on 07.03.2016.
 */
public class Teacher extends Partaker {
    int experience;


    Teacher() {
        Scanner sc = new Scanner(in); // Создаем объект класса Scanner

        // Ввод имени студента
        boolean enterName = false;
        do {
            try {
                out.println("Введите имя преподавателя: ");
                String nameStudent = sc.next();
                enterName = editName(nameStudent); // Возвращает истину если корректно ввели имя
            } catch (NumberFormatException e) {
                out.println("Повторите ввод");
                continue;
            }
        } while (!enterName);

        // Ввод возраста студента
        boolean enterAge = false;
        int ageStudent = 0;
        do {
            try {
                out.println("Введите возраст преподавателя: ");
                String txt = sc.next();
                ageStudent = Integer.parseInt(txt);
                enterAge = editAge(ageStudent); // Возвращает истину если корректно ввели имя
            } catch (NumberFormatException e) {
                System.out.println("Повторите ввод");
                continue;
            }
        } while (!enterAge || ageStudent < 0 || ageStudent > 35);

        // Ввод среднего балла студента
        boolean enterExperience = false;
        int experience = 0;
        do {
            try {
                out.println("Введите стаж работы: ");
                String txt = sc.next();
                experience = Integer.parseInt(txt);
                enterExperience = editExperience(experience); // Возвращает истину если корректно ввели средний балл
            } catch (NumberFormatException e) {
                System.out.println("Повторите ввод");
                continue;
            }
        } while (!enterExperience || experience < 0 || experience  > 40);
    }

    @Override
    void editing() {
    }

    @Override
    boolean editName(String s) {
        System.out.println("Введенное имя студента: " + s);
        return true;
    }

    @Override
    boolean editAge(int a) {
        System.out.println("Введенный возраст студента: " + a);
        return true;
    }

    boolean editExperience(int e) {
        System.out.println("Введенный стаж работы: " + e);
        return true;
    }
}
