package com.mytestaddress;

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

        // Ввод имени преподавателя
        boolean enterName = false;
        do {
            try {
                out.println("Введите имя преподавателя: ");
                String nameStudent = sc.next();
                enterName = setName(nameStudent); // Возвращает истину если корректно ввели имя
            } catch (NumberFormatException e) {
                out.println( "Повторите ввод" + e.toString() );
                continue;
            }
        } while (!enterName);

        // Ввод возраста преподавателя
        boolean enterAge = false;
        do {
            try {
                out.println("Введите возраст преподавателя: ");
                String txt = sc.next();
                int ageStudent = Integer.parseInt(txt);
                enterAge = setAge(ageStudent); // Возвращает истину если корректно ввели имя
            } catch (NumberFormatException e) {
                System.out.println( "Повторите ввод " + e.toString() );
                continue;
            }
        } while (!enterAge);

        // Ввод среднего балла преподавателя
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
    boolean setName(String s) {
        name = s;
        return true;
    }

    @Override
    boolean setAge(int a) {
        if (a < 0 || a > 35) {
            System.out.println("Повторите ввод");
            return false;
        }
        age = a;
        return true;
    }

    boolean editExperience(int e) {
        if (e < 0 || e  > 40) {
            System.out.println("Повторите ввод");
            return false;
        }
        experience = e;
        return true;
    }
}
