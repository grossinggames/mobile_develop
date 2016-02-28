package com.mytestaddress;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in); // Создаем объект класса Scanner
        System.out.print("Введите количество вводимых цифр: ");

        if ( sc.hasNextInt() ) { // Возвращает истину если с потока ввода можно получить целове число
            int repeatCount = sc.nextInt(); // Считывает целое число
            int sum = 0;

            for (int i = 0; i < repeatCount; i++) {
                System.out.print("Введите " + (i + 1) + "-е целое число: ");

                if ( sc.hasNextInt() ) { // Возвращает истину если с потока ввода можно получить целове число
                    int chislo = sc.nextInt(); // Считывает целое число

                    if (chislo > 2) {
                        sum += chislo;
                    }
                } else {
                    System.out.println("Вы ввели не целое число");
                    break;
                }
            }

            System.out.println("Сумма введенных чисел значение которых > 2 равно : " + sum);
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }
}
