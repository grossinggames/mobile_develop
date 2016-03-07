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
        do {
            try {
                out.println("Введите возраст студента: ");
                String txt = sc.next();
                int ageStudent = Integer.parseInt(txt);
                enterAge = editAge(ageStudent); // Возвращает истину если корректно ввели имя
            } catch (NumberFormatException e) {
                System.out.println("Повторите ввод");
                continue;
            }
        } while (!enterAge);

        // Ввод среднего балла студента
        boolean enterAverageMark = false;
        do {
            try {
                out.println("Введите средний балл студента: ");
                String txt = sc.next();
                float averageMarkStudent = Float.parseFloat(txt);
                enterAverageMark = editAverageMark(averageMarkStudent); // Возвращает истину если корректно ввели средний балл
            } catch (NumberFormatException e) {
                System.out.println( "Повторите ввод" + e.toString() );
                continue;
            }
        } while (!enterAverageMark);
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
        System.out.println("Введенный возраст студента: " + age);
        return true;
    }

    boolean editAverageMark(float aM) {
        if (aM < 0.0 || aM > 5.0) {
            System.out.println("Повторите ввод");
            return false;
        }
        averageMark = aM;
        System.out.println("Введенный средний балл: " + aM);
        return true;
    }
}
