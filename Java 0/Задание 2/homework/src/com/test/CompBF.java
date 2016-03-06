package com.test;

/**
 * Created by Core8 on 26.02.2016.
 */

import java.util.Scanner;
//import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.*;

/**
 * реализует поле боя компьютера.
 */
public final class CompBF extends Battlefield {

    /**
     * заполняет рандомными кораблями всё поле.
     */
    public CompBF() {
        super.addRandomShips();
    }

    /**
     * реализует ВХОДЯЩИЕ удары. Поле комптьютера -> по нему бьёт человек. метод
     * требует ввода.
     */
    @Override
    public void setTarget() {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in); // Создаем объект класса Scanner
        String xy = "";
        String x = "";
        int y = -1;
        ArrayList<String> hor = new ArrayList<>();
        for (HorCoords h : HorCoords.values()) {
            hor.add(h.toString());
        }
        do {
            System.out.println("Поле компьютера:");
            System.out.println(this);
            System.out.println("Введите координаты:");
            try {
                xy = sc.next().substring(0, 2);
                x = xy.substring(0, 1).toUpperCase();
                y = Integer.parseInt( xy.substring(1, 2) );

                //x = br.readLine().toUpperCase();
                //y = Integer.parseInt(br.readLine());
            //} catch (IOException | NumberFormatException e) {

            } catch (NumberFormatException e) {
                System.out.println("IOException. Повторите ввод");
                continue;
            }
        } while (!hor.contains(x) || y < 0 || y > 9);
        if (super.hitToSea(new SeaBlock(HorCoords.valueOf(x).getCoord(), y))) {
            setTarget();
        }
    }

    @Override
    public String toString() {
        String r = " ";
        for (HorCoords h : HorCoords.values()) {
            r += h.name();
        }
        r += "\n";

        for (int i = 0; i < 10; i++) {
            r += i;
            for (int j = 0; j < 10; j++) {
                if (sea()[j][i].isAlive) {
                    r += " ";

                } else {
                    r += sea()[j][i];
                }
            }
            r += "\n";
        }
        return r;
    }

    @Override
    String winner() {
        return "ЧЕЛОВЕК ВЫИГРАЛ";
    }
}
