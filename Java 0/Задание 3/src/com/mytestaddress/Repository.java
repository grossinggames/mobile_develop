package com.mytestaddress;

import java.util.*;
import static java.lang.System.out;

/**
 * Created by priora on 08.03.2016.
 */
public class Repository {
    HashSet<Partaker> hm = new HashSet<Partaker>();
    ArrayList<Partaker> list = new ArrayList<Partaker>();

    Repository() {

    }

    private boolean add(String typePartaker) {
        Partaker partaker;

        switch(typePartaker) {
            case "student":
                partaker = new Student();
                break;
            case "teacher":
                partaker = new Teacher();
                break;
            default:
                return false;
        }

        System.out.println( "Добавляем новую запись. Имя: " + partaker.name + " Объект: " + partaker.toString() );
        hm.add(partaker);
        list.add(partaker);
        return true;
    }

    private void printPartakers() {
        System.out.println("Вывод всех из HashMap");

        for (Partaker prkr : hm) {
            System.out.println(prkr);
        }

        System.out.println("Вывод всех из ArrayList");
        for (Partaker l: list) {
            System.out.println(l);
        }
    }

    private void printSortPartakers() {
        Collections.sort(list);

        System.out.println("Отсортированный вывод всех из HashSet");
        for (Partaker prkr : hm) {
            System.out.println(prkr);
        }

        System.out.println("Отсортированный вывод всех из ArrayList");
        for (Partaker l: list) {
            System.out.println(l);
        }
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        int operationCode = 0;

        do {
            try {
                out.println("Введите код операции. 0 - Выход. 1 - Добавить студента. 2 - Добавить преподавателя" +
                        " 3 - Вывод всех участников. 4 - Вывод после сортировки. 5 - Редактирование по порядковому номеру");
                String txt = sc.next();
                operationCode = Integer.parseInt(txt);

                switch(operationCode) {
                    case 0:
                        return;
                    case 1:
                        add("student");
                        break;
                    case 2:
                        add("teacher");
                        break;
                    case 3:
                        printPartakers();
                        break;
                    case 4:
                        printSortPartakers();
                        break;
                    case 5:

                        break;
                    default:
                        operationCode = 0;
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Повторите ввод");
                continue;
            }
        } while (operationCode != 0);
    }
}