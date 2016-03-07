package com.mytestaddress;

import java.util.Scanner;
import static java.lang.System.*;

/**
 * Created by priora on 07.03.2016.
 */
public class Student extends Partaker {
    float averageMark;


    Student() {
        Scanner sc = new Scanner(in); // Создаем объект класса Scanner

        // Ввод имени студента
        boolean enterName = false;
        do {
            try {
                out.println("Введите имя студента: ");
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
                out.println("Введите возраст студента: ");
                String txt = sc.next();
                ageStudent = Integer.parseInt(txt);
                enterAge = editAge(ageStudent); // Возвращает истину если корректно ввели имя
            } catch (NumberFormatException e) {
                System.out.println("Повторите ввод");
                continue;
            }
        } while (!enterAge || ageStudent < 0 || ageStudent > 35);

        // Ввод среднего балла студента
        boolean enterAverageMark = false;
        float averageMarkStudent = 0;
        do {
            try {
                out.println("Введите средний балл студента: ");
                String txt = sc.next();
                averageMarkStudent = Float.parseFloat(txt);
                enterAverageMark = editAverageMark(averageMarkStudent); // Возвращает истину если корректно ввели средний балл
            } catch (NumberFormatException e) {
                System.out.println("Повторите ввод");
                continue;
            }
        } while (!enterAverageMark || averageMarkStudent < 0.0 || averageMarkStudent > 5.0);
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

    boolean editAverageMark(float aM) {
        System.out.println("Введенный средний балл: " + aM);
        return true;
    }
}
