class Cat {

    void meow() { // параметры отсутствуют
    }
	
    void meow(int count) { // используется один параметр типа int
    }
	
    void meow(int count, int pause) { // используются два параметра типа int
    }
    
	long meow(long time) { // используется один параметр типа long return time;
    }
}

//------------------

public static double getMaxValue(Object... args) {
}

public static double getMaxValue(double... values) {

    double largest = Double.MIN_VALUE;

for (double v : values)
    {
        if (v > largest) {
            largest = v;
        }
    }

    return largest;
}

//----------------------

SaltwaterFish nemo = new SaltwaterFish();

if (nemo instanceof Fish) { 

    if (nemo instanceof SaltwaterFish) { // Немо - это морская рыбка!

    } 

}

//---------------------------

final int FILE_OPEN = 1;

final class Tail {
    // ...
}

// Следующий класс недопустим
class BigTail extends Tail {
    // Ошибка! 
}

//----------------------------



import ClassNameToImport;

hypot = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

import static java.lang.Math.*;


MyClass mcl = new MyClass();
String str=mcl.getClass().getName();
tr=='MyClass‘;

