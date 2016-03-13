package com.mytestaddress;

/**
 * Created by priora on 07.03.2016.
 */
abstract class Partaker implements Comparable<Partaker> {
    String name;
    int age;

    Partaker() {
    }

    abstract boolean setName(String s);
    abstract boolean setAge(int a);

    @Override
    public int compareTo(Partaker p) {
        System.out.println("this.age: " + this.age + " p.age: " + p.age);

        if(this.age < p.age)
        {
            /* текущее меньше полученного */
            return -1;
        }
        else if(this.age > p.age)
        {
            /* текущее больше полученного */
            return 1;
        }
        /* текущее равно полученному */
        return 0;
    }
}