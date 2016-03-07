package com.mytestaddress;

/**
 * Created by priora on 07.03.2016.
 */
abstract class Partaker {
    String name;
    int age;

    Partaker() {
    }

    abstract void editing();
    abstract boolean editName(String s);
    abstract boolean editAge(int a);
}