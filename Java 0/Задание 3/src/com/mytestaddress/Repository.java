package com.mytestaddress;

import java.lang.reflect.Array;
import java.util.*;
import static java.lang.System.out;

import java.util.List;

/**
 * Created by priora on 08.03.2016.
 */
public class Repository {
    HashMap<String, Partaker> hm = new HashMap<String, Partaker>();
    ArrayList<String> list = new ArrayList<String>();

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

        if ( hm.get(partaker.name) == null ) {
            System.out.println( "Добавляем новую запись. Имя: " + partaker.name + " Объект: " + partaker.toString() );
            System.out.println("");
            hm.put(partaker.name, partaker);
        } else {
            System.out.println( "Запись уже существует. Имя: " + partaker.name + " Объект: " + partaker.toString() );
            System.out.println("");
        }
        list.add(partaker.name);
        return true;
    }

    private void printPartakers() {
        System.out.println("Вывод всех из HashMap");
        for( Map.Entry<String, Partaker> entry : hm.entrySet() ) {
            String key = entry.getKey();
            Partaker value = entry.getValue();
            System.out.println("Имя: " + key + " Объект: " + value.toString());
        }

        System.out.println("Вывод всех из ArrayList");
        for (String l: list) {
            System.out.println("Имя: " + l);
        }
    }

    private void printSortPartakers() {
        HashMap<String, Partaker> hmSort = new HashMap<String, Partaker>();
        ArrayList<String> listSort = new ArrayList<String>();

        // Копируем массив hm
        for( Map.Entry<String, Partaker> entry : hm.entrySet() ) {
            String key = entry.getKey();
            Partaker value = entry.getValue();
            hmSort.put(key, value);
        }

        // Сортируем массив
        for( Map.Entry<String, Partaker> entry : hmSort.entrySet() ) {
            String key = entry.getKey();
            Partaker value = entry.getValue();
            int age = value.age;
        }

        // Копируем массив list
        for (String l: list) {
            listSort.add(l);
        }
        Collections.sort(listSort);

        System.out.println("Отсортированный вывод всех из HashMap");
        for( Map.Entry<String, Partaker> entry : hmSort.entrySet() ) {
            String key = entry.getKey();
            Partaker value = entry.getValue();
            System.out.println("Имя: " + key + " Объект: " + value);
        }

        System.out.println("Вывод всех из ArrayList");
        for (String l: listSort) {
            System.out.println("Объект: " + l);
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