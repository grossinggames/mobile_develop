class Figure {
    double dim1;
    double dim2;
    
    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }
    
    double area() {
        System.out.printLn("Площадь фигуры");
        return 0;
    }
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }
    
    // Переопределяем метод
	@Override
    double area() {
        System.out.println("Площадь прямоугольника");
        return dim1 * dim2;
    }
}

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }
    
    // переопределяем метод
	@Override
    double area() {
        System.out.println("Площадь треугольника");
        return dim1 * dim2 / 2;
    }
}

// В главной активности
Figure figure = new Figure(10, 10);
Rectangle rectangle = new Rectangle(8, 5);
Triangle triangle = new Triangle(10, 6);

Figure fig;

fig = figure;
textInfo.setText("Площадь равна " + fig.area());

fig = rectangle;
textInfo.setText("Площадь равна " + fig.area());

fig = triangle;
textInfo.setText("Площадь равна " + fig.area());