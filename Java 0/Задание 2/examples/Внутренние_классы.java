// внешний класс
class Outer {
    int outer_x = 9;
    
    void test() {
        Inner inner = new Inner();
        inner.display();
    }
    
    // внутренний класс
    class Inner {
        void display() {
            Log.i(TAG, outer_x);	
			
        }
    }
}


class MainActivity...{
    // В методе onCreate() активности
    Outer outer = new Outer();
    outer.test();
}

