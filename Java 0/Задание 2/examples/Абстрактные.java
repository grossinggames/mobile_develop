abstract class Figure {
    double dim1;
    double dim2;
    
    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }
    
    // абстрактный метод для вычисления площади
    abstract double area();
}

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }
    
    // переопределяем метод
    double area() {
        return dim1 * dim2 / 2;
    }
}

// В активности
// Figure figure = new Figure(10, 10); // теперь так нельзя
Triangle triangle = new Triangle(10, 8);

Figure fig; // так можно, так как объект мы не создаем
fig = triangle;
textInfo.setText("Площадь равна " + fig.area);


//-----------------------------

public interface SimpleInterface {
	String getClassName();
	int getAge();
}


public class Cat extends Animal implements SimpleInterface {

	@Override
	public String getClassName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return 0;
	}
}