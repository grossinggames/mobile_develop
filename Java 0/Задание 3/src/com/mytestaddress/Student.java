package com.mytestaddress;

import java.util.InputMismatchException;
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
                enterName = setName(nameStudent); // Возвращает истину если корректно ввели имя
            } catch (InputMismatchException e) {
                out.println("Повторите ввод");
                continue;
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
                enterAge = setAge(ageStudent); // Возвращает истину если корректно ввели имя
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
            } catch (InputMismatchException e) {
                out.println("Повторите ввод");
                continue;
            } catch (NumberFormatException e) {
                out.println("Повторите ввод");
                continue;
            }
        } while (!enterAverageMark);
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

    boolean editAverageMark(float aM) {
        if (aM < 0.0 || aM > 5.0) {
            System.out.println("Повторите ввод");
            return false;
        }
        averageMark = aM;
        return true;
    }

    @Override
    public String toString() {
        String student = "Имя: " + this.name + " Возраст: " + this.age + " Средний балл: " + this.averageMark;
        return student;
    }
}
